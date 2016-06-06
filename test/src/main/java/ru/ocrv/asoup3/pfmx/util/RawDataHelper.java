package ru.ocrv.asoup3.pfmx.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * A helper class that works with input parametes for stored procedures.
 * @author BaranovSF
 *
 */
public class RawDataHelper {

    /**
     * Deserializes input parameters from byte array
     * @param inputBytes
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object getInputParamsFromBytes(byte[] inputBytes) throws IOException, ClassNotFoundException {

        ByteArrayInputStream bis = new ByteArrayInputStream(inputBytes);
        ObjectInput in = null;
        try {
            in = new ObjectInputStream(bis);
            Object o = in.readObject();
            return o;
        } finally {
            try {
                bis.close();
            } catch (IOException ex) {
            }
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
            }
        }
    }

    /**
     * Converts input data to byte array
     * @param vpoknes
     * @return
     * @throws IOException
     */
    public static byte[] inputParamsToByteArray(Object vpoknes) throws IOException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        try {
            out = new ObjectOutputStream(bos);
            out.writeObject(vpoknes);
            byte[] outBytes = bos.toByteArray();
            return outBytes;
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException ex) {
            }
            try {
                bos.close();
            } catch (IOException ex) {
            }
        }
    }
}
