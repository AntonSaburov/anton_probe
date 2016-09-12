package se.test;

/**
 * @author Anton Saburov <Anton.Saburov@OCRV.RU> on 08.07.2015.
 */
public class Person
{
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + ", age=" + age + '}';
    }

}
