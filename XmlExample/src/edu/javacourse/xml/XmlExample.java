package edu.javacourse.xml;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmlExample
{
    public static void main(String[] args) throws Exception {
        testXml();
        System.out.println("====================>");
//        testZip();
    }

    private static void testXml() throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(PassportDescriptor.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        PassportDescriptor desc = (PassportDescriptor) jaxbUnmarshaller.unmarshal(loadXml());
        System.out.println("RuleFlow:" + desc.getRuleFlowConfigFile());
        System.out.println("OpsClassName:" + desc.getOpsClassName());
        System.out.println("SchemaClassName:" + desc.getSchemaClassName());
        System.out.println("RuleFiles:" + desc.getRuleFiles());
        
//        desc.getRuleFiles().getRuleFile().stream().forEach(s -> System.out.println("File:" + s));

    }

    private static InputStream loadXml() throws Exception {
        FileInputStream fis = new FileInputStream("passport-descriptor.xml");
        byte[] file = new byte[fis.available()];
        fis.read(file);
        ByteArrayInputStream bais = new ByteArrayInputStream(file);
        return bais;
    }

    private static void testZip() throws Exception {
        ZipInputStream zis = new ZipInputStream(new FileInputStream("/home/S.Anton/work/test.jar"));
        ZipEntry entry = zis.getNextEntry();
        while (entry != null) {
            String name = entry.getName();
            if (entry.isDirectory()) {
                System.out.println("DirName:" + name);
            } else {
                System.out.println("FileName:" + name);
                if (name.endsWith(".xml")) {
                    System.out.println("XML:");
                    byte[] buffer = new byte[4096];
                    int c = zis.read(buffer);
                    while (c != -1) {
                        String s = new String(buffer, 0, c);
                        System.out.print(s);
                        c = zis.read(buffer);
                    }
                    System.out.println();
                }
            }
            entry = zis.getNextEntry();
        }
        zis.close();
    }
}
