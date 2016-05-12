package edu.javacourse.utest;

import java.util.Date;
import java.util.List;

/**
 * Hello world!
 */
public class PersonInfoProcessor
{
    public static final int COUNT = 2;

    public void testPerson(PersonInfo person) {
        String first = person.getFirstName();
        System.out.println("FIRST:" + first);

        String last = person.getLastName();
        System.out.println("LAST:" + last);

        Date dateOfBirth = person.getDateOfBirth();
        System.out.println("DATE:" + dateOfBirth);

        List<String> children = person.getChildrenNames();
        for (String s : children) {
            System.out.println("CHILD:" + s);
        }

        for (int i = 0; i < COUNT; i++) {
            int age = person.getAge(i);
            System.out.println("PARAM:" + i + ", AGE:" + age);
        }
        System.out.println();
    }
}
