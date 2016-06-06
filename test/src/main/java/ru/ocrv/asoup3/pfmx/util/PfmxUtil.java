package ru.ocrv.asoup3.pfmx.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.bind.DatatypeConverter;

import ru.ocrv.asoup3.pfmx.PfmxParser;
import ru.ocrv.asoup3.pfmx.model.PfmxMessage;

public class PfmxUtil
{
/*
For DVS0 use messages from files:
10_112963686_24_181954
75_112963731_24_182004
284_112963939_24_182033
342_112963998_24_182041
397_112964064_24_182049
 */

    private static final int COUNT = 1;

    public static void main(String[] args) {

        boolean printMessage = true;

        PfmxParser parser = new PfmxParser();
        try {
            byte[] bytes = loadHexFile("C:/tmp/messages/397_112964064_24_182049");

            long d1 = System.currentTimeMillis();
            for (int i = 0; i < COUNT; i++) {
                PfmxMessage pfmx = parser.processPfmx(bytes, null);
                if (printMessage) {
                    System.out.println(pfmx);
                }
            }

            long d2 = System.currentTimeMillis();
            float one = (float) (d2 - d1) / (float) COUNT;
            System.out.println("Direct:" + (d2 - d1));
            System.out.println("Direct ONE:" + one);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] loadHexFile(String fileName) throws IOException {

        BufferedReader out = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = out.readLine()) != null) {
            sb.append(line);
        }
        out.close();
        return DatatypeConverter.parseHexBinary(sb.toString());
    }
}
