package se.test;

/**
 * @author Anton Saburov <Anton.Saburov@OCRV.RU> on 08.07.2015.
 */
public class IsAdult
{
    private Person person;

    public IsAdult(Person person) {
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "IsAdult{" + "person=" + person + '}';
    }
}
