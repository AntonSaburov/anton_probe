package ru.ocrv.asoup3.pfmx.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PfmxGenerator {

    public static void main(String[] args) {

        PfmxGenerator gen = new PfmxGenerator();

        /* ��� PMD ���� �������� ����� ���������, ������� �� ��������: 908 + offset
        if(pmd.getRowLength().intValue() == 1014) {
            return pmd;
        }
         */

        List<FieldDescription> modelDescription = gen.loadDecription("txt/pfmx_vmd_dvs.txt");
        gen.generate(modelDescription, "modelData");

    }

    private List<FieldDescription> loadDecription(String fileName) {

        List<FieldDescription> result = new ArrayList<FieldDescription>();
        try {
            BufferedReader out = new BufferedReader(new FileReader(fileName));
            String line = null;
            while ((line = out.readLine()) != null) {
                String[] desc = line.split("\\s+");
                if (desc.length == 4) {
                    String name = prepareName(desc[0]);
                    int offset = Integer.parseInt(desc[2]);
                    int size = Integer.parseInt(desc[3]);
                    FieldDescription.FieldType type = defineType(desc[1]);
                    FieldDescription fd = new FieldDescription(name, offset, size, type);
                    result.add(fd);
                } else {
                    System.out.println("ERROR for line:" + line);
                }
            }
            out.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return result;
    }

    private void generate(List<FieldDescription> fields, String arrayName) {

        final String varName = "vmdDvs";
        final String typeName = "PfmxMessage";

        generateAll(fields, arrayName, varName, typeName);

        //generateModelClassFile(fields, arrayName, varName, typeName);
    }

    private void generateAll(List<FieldDescription> fields, String arrayName, String varName, String typeName) {

        StringBuilder sbList = new StringBuilder("public static final List<FieldDescription> description = new ArrayList<FieldDescription>() {{");
        StringBuilder sbFields = new StringBuilder();
        StringBuilder sbCode = new StringBuilder(typeName + " " + varName + " = new " + typeName + "();");
        for (FieldDescription fd: fields) {
            String listItem = prepareListItem(fd);
            sbList.append("\n\r" + listItem);
            String fieldItem = prepareField(fd);
            sbFields.append("\n" + fieldItem);
            String codeItem = prepareCodeSnippet(fd, arrayName, varName);
            sbCode.append("\n\r" + codeItem);
        }
        sbList.append("}};");

        //        System.out.println(sbList);
        //        System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println(sbFields);
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println(sbCode);
                System.out.println("-----------------------------------------------------------------------------------------");
    }

    /*    private void generateModelClassFile(List<FieldDescription> fields, String arrayName, String varName, String typeName) {

            StringBuilder sbFields = new StringBuilder();

            String name = Character.toString(varName.charAt(0)).toUpperCase() + varName.substring(1);

            sbFields.append("public class Pfmx" + name + "Row extends PfmxModelRow {");

            for (FieldDescription fd: fields) {
                String fieldItem = prepareField(fd);
                sbFields.append("\n" + fieldItem);
            }

            sbFields.append("\n}");
            File file = new File("model/" + "Pfmx" + name + "Row(Generated).java");
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(file));
                writer.write(sbFields.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    */
    private String prepareListItem(FieldDescription fd) {

        StringBuilder sb = new StringBuilder("add(new FieldDescription(\"");
        String type = defineTypeString(fd.getFieldType(), false);
        sb.append(fd.getFieldName() + "\", " + fd.getOffset() + ", " + fd.getSize() + ", FieldDescription.FieldType." + type + "));");
        return sb.toString();
    }

    private String prepareField(FieldDescription fd) {

        StringBuilder sb = new StringBuilder("private ");
        String type = defineTypeString(fd.getFieldType(), true);
        sb.append(type + " " + fd.getFieldName() + ";");
        return sb.toString();
    }

    private String prepareCodeSnippet(FieldDescription fd, String arrayName, String varName) {

        StringBuilder sb = new StringBuilder();
        String val;

        sb.append("\n{");
        sb.append("\nbyte[] rawVal = new byte[" + fd.getSize() + "];");
        sb.append("\nSystem.arraycopy(" + arrayName + ", " + fd.getOffset() + " + offset, rawVal, 0, " + fd.getSize() + ");");
        val = defineArgument(fd.getFieldType());
        String upperName = Character.toString(fd.getFieldName().charAt(0)).toUpperCase() + fd.getFieldName().substring(1);
        String method = "set" + upperName;
        sb.append("\n" + varName + "." + method + "(" + val + ");");
        if (method.startsWith("setNull")) {
            String notNullMethod = method.replaceAll("setNull", "set");
            sb.append("\nif(" + varName + ".get" + upperName + "().intValue() == -1) {");
            sb.append("\n" + varName + "." + notNullMethod + "(null);");
            sb.append("\n}");
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static String prepareName(String rawName) {

        int posDot = rawName.indexOf(".");
        String name = rawName.substring(posDot + 1).toLowerCase();
        int posUnd = 0;
        while ((posUnd = name.indexOf("_")) != -1) {
            if (posUnd < name.length() - 1) {
                char tmp = name.charAt(posUnd + 1);
                name = name.replaceFirst("_" + tmp, ("" + tmp).toUpperCase());
            } else {
                name = name.replaceFirst("_", "");
            }
        }
        return name;
    }

    private FieldDescription.FieldType defineType(String type) {

        if (type.startsWith("INT2") || type.startsWith("NUMC(2)")) {
            return FieldDescription.FieldType.SHORT;
        }
        if (type.startsWith("INT4") || type.startsWith("NUMC(4)")) {
            return FieldDescription.FieldType.INT;
        }
        if (type.startsWith("NUMC")) {
            return FieldDescription.FieldType.STRING;
        }
        if (type.startsWith("DEC")) {
            return FieldDescription.FieldType.BIGINT;
        }
        if (type.startsWith("CHAR") || type.startsWith("STRING")) {
            return FieldDescription.FieldType.STRING;
        }
        if (type.startsWith("DAT")) {
            return FieldDescription.FieldType.DATE;
        }
        if (type.startsWith("TIMS")) {
            return FieldDescription.FieldType.TIMS;
        }
        if (type.startsWith("RAW")) {
            return FieldDescription.FieldType.RAW;
        }

        throw new RuntimeException("UNKNOWN TYPE: " + type);
    }

    public static String defineTypeString(FieldDescription.FieldType type, boolean forJava) {

        if (FieldDescription.FieldType.SHORT.equals(type)) {
            return forJava ? "Short" : "SHORT";
        }
        if (FieldDescription.FieldType.INT.equals(type)) {
            return forJava ? "Integer" : "INT";
        }
        if (FieldDescription.FieldType.BIGINT.equals(type)) {
            return forJava ? "BigInteger" : "BIGINT";
        }
        if (FieldDescription.FieldType.STRING.equals(type)) {
            return forJava ? "String" : "STRING";
        }
        if (FieldDescription.FieldType.DATE.equals(type)) {
            return forJava ? "String" : "DATE";
        }
        if (FieldDescription.FieldType.TIMS.equals(type)) {
            return forJava ? "String" : "TIMS";
        }
        if (FieldDescription.FieldType.RAW.equals(type)) {
            return forJava ? "byte[]" : "RAW";
        }

        throw new RuntimeException("UNKNOWN TYPE: " + type.toString());
    }

    public static String defineArgument(FieldDescription.FieldType type) {

        if (FieldDescription.FieldType.SHORT.equals(type)) {
            return "new Short(PfmxParser.byteArrayToShort(rawVal))";
        }
        if (FieldDescription.FieldType.INT.equals(type)) {
            return "new Integer((PfmxParser.byteArrayToInt(rawVal)))";
        }
        if (FieldDescription.FieldType.BIGINT.equals(type)) {
            return "new BigInteger(rawVal)";
        }
        if (FieldDescription.FieldType.STRING.equals(type)) {
            return "new String(rawVal, Charset.forName(CHARSET)).trim()";
        }
        if (FieldDescription.FieldType.DATE.equals(type)) {
            return "new String(rawVal, Charset.forName(CHARSET))";
        }
        if (FieldDescription.FieldType.TIMS.equals(type)) {
            return "new String(rawVal, Charset.forName(CHARSET))";
        }
        if (FieldDescription.FieldType.RAW.equals(type)) {
            return "rawVal";
        }

        throw new RuntimeException("UNKNOWN TYPE: " + type.toString());
    }

}
