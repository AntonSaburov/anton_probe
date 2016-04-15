package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Collectionexample
{

    public static void main(String[] args) {
        List<Person> test = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            test.add(new Person(100 * (i + 1), 200 * (i + 1)));
        }

//        process(test, new Process() {
//            @Override
//            public double calculate(int salary, int bonus) {
//                return salary + 0.3 * bonus;
//            }
//        });
        process(test, (s, b) -> s + 0.2 * b);

//        for(Person p : test) {
//            System.out.println(p.getTotal());
//        }
        List<Person> collect = test.stream().filter(p -> p.getTotal() > 1000).collect(Collectors.toList());

        test.parallelStream().forEach(p -> System.out.println(p.getTotal()));

//        collect.stream().forEach(p -> System.out.println(p.getTotal()));
    }

    public static void process(List<Person> test, BiFunction<Integer, Integer, Double> pr) {
        for (Person p : test) {
            p.setTotal(pr.apply(p.getSalary(), p.getBonus()));
        }
    }
}

//interface Process
//{
//    double calculate(int salary, int bonus);
//}
//
//
//class BigProcess implements Process {
//
//    @Override
//    public double calculate(int salary, int bonus) {
//
//        return 10.0;
//    }
//}
class Person
{

    private int salary;
    private int bonus;
    private double total;

    public Person(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
