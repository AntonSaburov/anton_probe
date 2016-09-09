package se.test;

/**
 * @author Anton Saburov <Anton.Saburov@OCRV.RU> on 08.07.2015.
 */
public class ChildBusPass
{
    private Person person;

    public ChildBusPass(Person person) {
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

}
