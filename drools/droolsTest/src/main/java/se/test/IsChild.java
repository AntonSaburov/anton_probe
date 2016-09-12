package se.test;

/**
 * @author Anton Saburov <Anton.Saburov@OCRV.RU> on 08.07.2015.
 */
public class IsChild
{
    private Person person;

    public IsChild(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "IsChild{" + "person=" + person + '}';
    }
}
