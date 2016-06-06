package org.sample;

import com.google.gson.Gson;
import io.protostuff.JsonIOUtil;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.concurrent.TimeUnit;
import javax.xml.bind.DatatypeConverter;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import ru.ocrv.asoup3.pfmx.PfmxParser;
import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.model.PfmxVmdRow;

@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(3)
//@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
//@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
//@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class SerializationTest
{

    private static PfmxMessage testValue;
    private static final Schema<PfmxVmdRow> vmdSchema;
    private static final Schema<PfmxMessage> schema;

    static {
        testValue = SerializationTest.loadFromFile("C:/tmp/messages/17783_112979773_24_190904");
//        testValue = SerializationTest.loadFromFile("C:/tmp/messages/10091_112972781_24_184629");
        schema = RuntimeSchema.getSchema(PfmxMessage.class);
        vmdSchema = RuntimeSchema.getSchema(PfmxVmdRow.class);
    }

    @Benchmark
    public int full_java_serialization() {
        int size = 0;
        try {
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    ObjectOutput out = new ObjectOutputStream(bos)) {
                out.writeObject(testValue);
                size += bos.size();
            }
        } catch (Exception ex) {
        }
        return size;
    }

    @Benchmark
    public int full_protostuff_serialization() {
        int size = 0;
        try {
            LinkedBuffer buffer = LinkedBuffer.allocate(512);
            byte[] outBytes = ProtostuffIOUtil.toByteArray(testValue, schema, buffer);
            size += outBytes.length;

        } catch (Exception ex) {
        }
        return size;
    }

    @Benchmark
    public int full_protostuff_serialization_json() {
        int size = 0;
        try {
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                JsonIOUtil.writeTo(bos, testValue, schema, true);
                String str = bos.toString();
                size += str.length();
            }
        } catch (Exception ex) {
        }
        return size;
    }

    @Benchmark
    public int full_protostuff_roundtrip_json() {
        int size = 0;
        try {
            PfmxMessage tmp = new PfmxMessage();
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                JsonIOUtil.writeTo(bos, testValue, schema, false);
                JsonIOUtil.mergeFrom(bos.toByteArray(), tmp, schema, false);
                size += bos.hashCode();
            }
        } catch (Throwable ex) {
        }
        return size;
    }

    @Benchmark
    public int full_gson_serialization() {
        int size = 0;
        String toJson = new Gson().toJson(testValue);
        size += toJson.length();
        return size;
    }

    @Benchmark
    public int full_gson_roundtrip() {
        int size = 0;
        Gson gson = new Gson();
        String toJson = gson.toJson(testValue);
        PfmxMessage fromJson = gson.fromJson(toJson, PfmxMessage.class);
        size += toJson.length() + fromJson.getAdditionalLength();
        return size;
    }

    @Benchmark
    public int vmd_java_serialization() {
        int size = 0;
        try {
            for (PfmxVmdRow vmd : testValue.getVmdList()) {
                try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                        ObjectOutput out = new ObjectOutputStream(bos)) {
                    out.writeObject(vmd);
                    byte[] bytes = bos.toByteArray();
                    size += bytes.length;
                }
            }
        } catch (Exception ex) {
        }
        return size;
    }

    @Benchmark
    public int vmd_protostuff_serialization() {
        int size = 0;
        try {
            for (PfmxVmdRow vmd : testValue.getVmdList()) {
                LinkedBuffer buffer = LinkedBuffer.allocate(512);
                byte[] outBytes = ProtostuffIOUtil.toByteArray(vmd, vmdSchema, buffer);
                size += outBytes.length;
            }

        } catch (Exception ex) {
        }
        return size;
    }

    @Benchmark
    public int vmd_protostuff_serialization_json() {
        int size = 0;
        try {
            for (PfmxVmdRow vmd : testValue.getVmdList()) {
                try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                    JsonIOUtil.writeTo(bos, vmd, vmdSchema, false);
                    String json = bos.toString();
                    size += json.length();
                }
            }
        } catch (Throwable ex) {
        }
        return size;
    }

    @Benchmark
    public int vmd_protostuff_roundtrip_json() {
        int size = 0;
        try {
            PfmxVmdRow tmp = new PfmxVmdRow();
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                for (PfmxVmdRow vmd : testValue.getVmdList()) {
                    JsonIOUtil.writeTo(bos, vmd, vmdSchema, false);
                    String json = bos.toString();
                    JsonIOUtil.mergeFrom(bos.toByteArray(), tmp, vmdSchema, false);
                    size += json.length();
                    bos.reset();
                }
            }
        } catch (Throwable ex) {
        }
        return size;
    }

    @Benchmark
    public int vmd_gson_serialization() {
        int size = 0;
        for (PfmxVmdRow vmd : testValue.getVmdList()) {
            String toJson = new Gson().toJson(vmd);
            size += toJson.length();
        }
        return size;
    }

    @Benchmark
    public int vmd_gson_roundtrip() {
        int size = 0;
        Gson gson = new Gson();
        for (PfmxVmdRow vmd : testValue.getVmdList()) {
            String toJson = gson.toJson(vmd);
            PfmxVmdRow fromJson = gson.fromJson(toJson, PfmxVmdRow.class);
            size += toJson.length() + fromJson.getDlVag();
        }
        return size;
    }

    private static PfmxMessage loadFromFile(String s) {
        try {
            FileInputStream file = new FileInputStream(s);
            byte[] bytes = new byte[file.available()];
            file.read(bytes);
            file.close();
            String strBytes = new String(bytes);
            byte[] pfmxBytes = DatatypeConverter.parseHexBinary(strBytes.trim());
            PfmxParser parser = new PfmxParser();
            PfmxMessage message = parser.processPfmx(pfmxBytes, null);
            return message;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return new PfmxMessage();
    }

    public static void main(String[] args) {
        final String path = "C:/tmp/messages/";
        String[] files = new File(path).list();
        int max = 0;
        String fileName = "";
//        String f = "10091_112972781_24_184629";
        String f = "17783_112979773_24_190904";
//        for (String f : files) {
        PfmxMessage pfmx = SerializationTest.loadFromFile(path + f);
        int current = 0;
        if (pfmx.getVmdList() != null) {
            current += pfmx.getVmdList().size();
        }
        if (max < current) {
            max = current;
            fileName = f;
        }
//        }
        System.out.println("Size:" + max);
        System.out.println("File:" + fileName);

        System.out.println("BMD:" + (pfmx.getBmdList() != null ? pfmx.getBmdList().size() : ""));
        System.out.println("KMD:" + (pfmx.getKmdList() != null ? pfmx.getKmdList().size() : ""));
        System.out.println("LMD:" + (pfmx.getLmdList() != null ? pfmx.getLmdList().size() : ""));
        System.out.println("PMD:" + (pfmx.getPmdList() != null ? pfmx.getPmdList().size() : ""));
        System.out.println("VMD:" + (pfmx.getVmdList() != null ? pfmx.getVmdList().size() : ""));

        SerializationTest st = new SerializationTest();
        SerializationTest.testValue = pfmx;
//        System.out.println("Full GSON:" + st.full_gson_serialization());
//        System.out.println("Full JAVA:" + st.full_java_serialization());
//        System.out.println("Full PROTO:" + st.full_protostuff_serialization());
//        System.out.println("Full PR JS:" + st.full_protostuff_serialization_json());
        System.out.println("VMD GSON:" + st.vmd_gson_serialization());
//        System.out.println("VMD JAVA:" + st.vmd_java_serialization());
//        System.out.println("VMD PROTO:" + st.vmd_protostuff_serialization());
        System.out.println("VMD PR JS:" + st.vmd_protostuff_serialization_json());
    }

}
