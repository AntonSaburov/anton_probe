package edu.javacourse.utest;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by S.Anton on 5/12/16.
 */
public class PersonInfoImpl implements PersonInfo
{
    public String getFirstName() {
        return "FIRST IMPL";
    }

    public String getLastName() {
        return "LAST IMPL";
    }

    public Date getDateOfBirth() {
        return new Date();
    }

    public List<String> getChildrenNames() {
        return Collections.EMPTY_LIST;
    }

    public int getAge(int year) {
        return 999;
    }

    public void neverCall() {
        throw new RuntimeException("NEVER");
    }
}
