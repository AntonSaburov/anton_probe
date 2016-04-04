package edu.javacourse.collection;

import edu.javacourse.lambda.Person;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionTest
{

    public void demoCollection() {
        List<Person> test = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double d = Math.random();
            String n = String.format("%02d", i);
            test.add(new Person("Name_" + n, Math.round((float) (Math.random() * 50 + 20)),
                    d > 0.5 ? Person.Sex.FEMALE : Person.Sex.MALE, "email_" + n));
        }

        System.out.println("Single Demo =====>>>>>");
        interationSingle(test);
        System.out.println("Parallel Demo =====>>>>>");
        interationParallel(test);

        System.out.println("Collect demo =====>>>>>");
        collect(test);
        collectList(test);
        collectMap(test);

        System.out.println("Summa demo =====>>>>>");
        sumSum(test);
        sumCollect(test);
        sumReduce(test);

        System.out.println("Avarage demo =====>>>>>");
        avarageDemo(test);

    }

    private void interationSingle(List<Person> test) {
        test.stream()
                .filter(e -> e.getGender() == Person.Sex.FEMALE)
                .forEach(e -> System.out.println(e.getName() + ":" + e.getAge()));
    }

    private void interationParallel(List<Person> test) {
        test.parallelStream()
                .filter(e -> e.getGender() == Person.Sex.MALE)
                .forEach(e -> System.out.println(e.getName() + ":" + e.getAge()));
    }

    private void collect(List<Person> test) {
//        String joined = test.parallelStream()
        String joined = test.stream()
                .map(r -> r.getName())
                .collect(Collectors.joining(", "));

        System.out.println("Collect:" + joined);
    }

    private void collectList(List<Person> test) {
        List<String> namesOfFemale = test
                .stream()
                .filter(p -> p.getGender() == Person.Sex.FEMALE)
                .map(p -> p.getName())
                .collect(Collectors.toList());
        namesOfFemale.stream().forEach(p -> System.out.println(p));
    }

    private void collectMap(List<Person> test) {
        System.out.println("Map1 ===>>>");
        Map<Person.Sex, List<Person>> byGender = test
                .stream()
                .collect(Collectors.groupingBy(Person::getGender));
        System.out.println("FEMALE:");
        byGender.get(Person.Sex.FEMALE).stream().forEach(p -> System.out.println(p.getName()));
        System.out.println("MALE:");
        byGender.get(Person.Sex.MALE).stream().forEach(p -> System.out.println(p.getName()));

        System.out.println("Map2 ===>>>");
        Map<Person.Sex, List<String>> namesByGender = test
                .stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println("FEMALE:");
        namesByGender.get(Person.Sex.FEMALE).stream().forEach(p -> System.out.println(p));
        System.out.println("MALE:");
        namesByGender.get(Person.Sex.MALE).stream().forEach(p -> System.out.println(p));

        System.out.println("Map3 ===>>>");
        Map<Person.Sex, Integer> totalAgeByGender = test
                .stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.reducing(0, Person::getAge, Integer::sum)));
        System.out.println("FEMALE:" + totalAgeByGender.get(Person.Sex.FEMALE));
        System.out.println("MALE:" + totalAgeByGender.get(Person.Sex.MALE));
        

        System.out.println("Map4 ===>>>");
        Map<Person.Sex, Double> averageAgeByGender = test
                .stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.averagingInt(Person::getAge)));
        System.out.println("FEMALE:" + averageAgeByGender.get(Person.Sex.FEMALE));
        System.out.println("MALE:" + averageAgeByGender.get(Person.Sex.MALE));
        
    }

    private void sumSum(List<Person> test) {
        int total = test.stream()
                .mapToInt(e -> e.getAge())
                .sum();

        System.out.println("Sum:" + total);
    }

    private void sumCollect(List<Person> test) {
        int total = test.stream()
                .collect(Collectors.summingInt(Person::getAge));

        System.out.println("Sum:" + total);
    }

    private void sumReduce(List<Person> test) {
        int total = test.stream()
                .mapToInt(e -> e.getAge())
                //                .reduce(10000, (a, b) -> {System.out.println(a); return a + b; });
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum:" + total);
    }

    private void avarageDemo(List<Person> test) {
        Averager averageCollect = test.stream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .map(Person::getAge)
                .collect(Averager::new, Averager::accept, Averager::combine);

        System.out.println("Average age of male members: " + averageCollect.average() + ":" + averageCollect.getCount());
    }

}
