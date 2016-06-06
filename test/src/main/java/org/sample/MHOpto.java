package org.sample;

import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(3)
//@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
//@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
//@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
public class MHOpto 
{
    public int value = 42;

    public int testMethod(Integer counter1) {
        return counter1;
    }
    
    private static Field reflective;
    private static Method method;
    private static MethodHandle unreflect;
    private static MethodHandle unreflect_set;
    private static MethodHandle mh;
    private static MethodHandle mh_set;
    private static MethodHandle mh_method;
    
    private static FieldAccess esotericField;
    private static int esotericFieldIndex;
    private static MethodAccess esotericMethod;
    private static int esotericMethodIndex;
    
    private static Map<String, Method> map_method = new HashMap<>();
    private static Map<String, MethodHandle> map_handle = new HashMap<>();
    

    static {
        try {
            reflective = MHOpto.class.getDeclaredField("value");
            method = MHOpto.class.getMethod("testMethod", new Class[] {Integer.class});
            unreflect_set = MethodHandles.lookup().unreflectSetter(reflective);
            unreflect = MethodHandles.lookup().unreflectGetter(reflective);
            mh = MethodHandles.lookup().findGetter(MHOpto.class, "value", int.class);
            mh_set = MethodHandles.lookup().findSetter(MHOpto.class, "value", int.class);
            mh_method = MethodHandles.lookup().findSpecial(MHOpto.class, "testMethod", 
                    MethodType.methodType(int.class, Integer.class), MHOpto.class);
            
//            for(int i=0; i<100; i++) {
//                map_method.put("testMethod" + i, method);
//                map_handle.put("testMethod" + i, mh_method);
//            }
//            map_method.put("testMethod", method);
//            map_handle.put("testMethod", mh_method);

            esotericField = FieldAccess.get(MHOpto.class);
            esotericFieldIndex = esotericField.getIndex("value");
            esotericMethod = MethodAccess.get(MHOpto.class);
            esotericMethodIndex = esotericMethod.getIndex("testMethod");
            
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
/*
    @Benchmark
    public int field_plain() {
        return value;
    }

    @Benchmark
    public void field_plain_set() {
        this.value = 99;
    }
    
    @Benchmark
    public int field_reflect() throws Throwable {
        return (int) reflective.get(this);
    }

    @Benchmark
    public void field_reflect_set() throws Throwable {
        reflective.set(this, 99);
    }
    
    @Benchmark
    public int field_unreflect_invoke() throws Throwable {
        return (int) unreflect.invoke(this);
    }

    @Benchmark
    public void field_unreflect_invoke_set() throws Throwable {
        unreflect_set.invoke(this, 99);
    }
    
    @Benchmark
    public int field_unreflect_invokeExact() throws Throwable {
        return (int) unreflect.invokeExact(this);
    }

    @Benchmark
    public void field_unreflect_invokeExact_set() throws Throwable {
        unreflect_set.invokeExact(this, 99);
    }
    
    @Benchmark
    public int field_mh_invoke() throws Throwable {
        return (int) mh.invoke(this);
    }

    @Benchmark
    public void field_mh_invoke_set() throws Throwable {
        mh_set.invoke(this, 99);
    }
    
    @Benchmark
    public int field_mh_invokeExact() throws Throwable {
        return (int) mh.invokeExact(this);
    }

    @Benchmark
    public void field_mh_invokeExact_set() throws Throwable {
        mh_set.invokeExact(this, 99);
    }
    
    @Benchmark
    public int field_es_invoke() throws Throwable {
        return (int) esotericField.get(this, "value");
    }

    @Benchmark
    public void field_es_invoke_set() throws Throwable {
        esotericField.set(this, "value", 99);
    }
    
    @Benchmark
    public int field_es_invokeIndex() throws Throwable {
        return (int) esotericField.get(this, esotericFieldIndex);
    }

    @Benchmark
    public void field_es_invokeIndex_set() throws Throwable {
        esotericField.set(this, esotericFieldIndex, 99);
    }
    
    @Benchmark
    public int plain_method() {
        return testMethod(99);
    }

    @Benchmark
    public int method_reflect_invoke() throws Throwable {
//        Method method = map_method.get("testMethod");
        return (int) method.invoke(this, new Integer(99));
    }

    @Benchmark
    public int method_mh_invoke() throws Throwable {
//        MethodHandle mh_method = map_handle.get("testMethod");
        return (int) mh_method.invoke(this, new Integer(99));
    }
    
    @Benchmark
    public int method_mh_invokeExact() throws Throwable {
//        MethodHandle mh_method = map_handle.get("testMethod");
        return (int) mh_method.invokeExact(this, new Integer(99));
    }

    @Benchmark
    public int method_es_invoke() throws Throwable {
        return (int) esotericMethod.invoke(this, "testMethod", new Integer(99));
    }

    @Benchmark
    public int method_es_invokeIndex() throws Throwable {
        return (int) esotericMethod.invoke(this, esotericMethodIndex, new Integer(99));
    }
*/
}