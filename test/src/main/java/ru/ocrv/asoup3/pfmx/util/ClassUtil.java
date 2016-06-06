package ru.ocrv.asoup3.pfmx.util;

import java.lang.reflect.Field;
import java.math.BigInteger;

public class ClassUtil
{

    public static String getString(Object object) {

        StringBuilder sb = new StringBuilder();
        try {
            Class<?> c = object.getClass();
            sb.append(c.getName() + " {");
            Field[] fields = c.getDeclaredFields();
            for (Field f: fields) {
                f.setAccessible(true);
                Object o = f.get(object);
                sb.append("\n\r" + f.getName() + "=" + (o != null ? o.toString() : "null"));
            }
            sb.append("\n\r}");
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return sb.toString();
    }

    public static int byteArrayToInt(byte[] b) {

        return b[0] << 24 | (b[1] & 0xff) << 16 | (b[2] & 0xff) << 8 | (b[3] & 0xff);

    }

    public static short byteArrayToShort(byte[] b) {

        return (short) ((b[0] & 0xff) << 8 | b[1] & 0xff);
    }

    public static BigInteger byteArrayToBigInt(byte[] b) {

        String value = "0";
        for (byte by: b) {
            value += Character.toString((char) (((by & 0xf0) >> 4) + '0'));
            char c = (char) ((by & 0xf) + '0');
            if (c < 58)
                value += Character.toString(c);
            else if (c == 13 || c == 11)
                value = "-" + value;
        }
        return new BigInteger(value);
    }
}
