package edu.javacourse.utest;

import java.util.Date;
import java.util.List;

/**
 * Created by S.Anton on 5/12/16.
 */
public interface PersonInfo
{
    String getFirstName();
    String getLastName();
    Date getDateOfBirth();
    List<String> getChildrenNames();
    int getAge(int year);
    void neverCall();
}
