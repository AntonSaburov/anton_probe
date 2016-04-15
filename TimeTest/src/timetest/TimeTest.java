package timetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TimeTest
{
    public static void main(String[] args) {
        int symbols = 3;
        int groupsCount = (int) Math.round(Math.pow(10, symbols));
        for (int i = 0; i < groupsCount; i++) {
            String g = String.format("%0" + symbols + "d", i);
            System.out.println(g);
        }

//        List<Test> test = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            for (int k = 0; k < 3; k++) {
//                test.add(new Test(i, (byte) k));
//            }
//        }
//        Collections.shuffle(test);
//        Collections.sort(test);
//        test.forEach(e -> System.out.println(e));
    }
}

class Test implements Comparable<Test>
{
    private long receptionTime;
    private byte internalOrder;

    public Test(long receptionTime, byte internalOrder) {
        this.receptionTime = receptionTime;
        this.internalOrder = internalOrder;
    }

    @Override
    public int compareTo(Test other) {
        long answer = other.receptionTime - receptionTime;
        if (answer == 0) {
            return other.internalOrder - internalOrder;
        }
        return answer > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Test{" + "receptionTime=" + receptionTime + ", internalOrder=" + internalOrder + '}';
    }
}
