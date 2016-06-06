package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxHeaderParser
{

    public static PfmxMessage processPfmxHeader(byte[] pfmxData) {

        PfmxMessage pfmx = new PfmxMessage();

        int offset = 0;

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(pfmxData, 0 + offset, rawVal, 0, 4);
            pfmx.setPackageSize(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(pfmxData, 4 + offset, rawVal, 0, 4);
            pfmx.setPackageType(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(pfmxData, 8 + offset, rawVal, 0, 4);
            pfmx.setKsmcbpf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(pfmxData, 13 + offset, rawVal, 0, 4);
            pfmx.setKskmcbpf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(pfmxData, 18 + offset, rawVal, 0, 10);
            pfmx.setDnosmcbp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(pfmxData, 29 + offset, rawVal, 0, 8);
            pfmx.setVnosmcbp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(pfmxData, 43 + offset, rawVal, 0, 8);
            pfmx.setIdstdpf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[16];
            System.arraycopy(pfmxData, 52 + offset, rawVal, 0, 16);
            pfmx.setAdrabpf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(pfmxData, 82 + offset, rawVal, 0, 4);
            pfmx.setUns(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(pfmxData, 108 + offset, rawVal, 0, 2);
            pfmx.setIkoddor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(pfmxData, 112 + offset, rawVal, 0, 4);
            pfmx.setLbefcomp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(pfmxData, 117 + offset, rawVal, 0, 26);
            pfmx.setStartTimestamp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(pfmxData, 208 + offset, rawVal, 0, 2);
            pfmx.setAdditionalLength(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            if (pfmxData.length >= 208 + 2 + offset + pfmx.getAdditionalLength() && pfmx.getAdditionalLength() > 0) {
                byte[] rawVal = new byte[pfmx.getAdditionalLength() - 2];
                System.arraycopy(pfmxData, 208 + offset + 2, rawVal, 0, pfmx.getAdditionalLength() - 2);
                pfmx.setAdditionalInfo(new String(rawVal, Charset.forName(CHARSET)).trim());
            } else {
                if (pfmxData.length > 208 + 2 + offset) {
                    byte[] rawVal = new byte[pfmxData.length - 208 - 2 - offset];
                    System.arraycopy(pfmxData, 208 + 2 + offset, rawVal, 0, pfmxData.length - 208 - 2 - offset);
                    pfmx.setAdditionalInfo(new String(rawVal, Charset.forName(CHARSET)).trim());
                }
            }
        }

        return pfmx;
    }

}

