package edu.javacourse.utest;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.AdditionalMatchers.lt;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

public class PersonInfoProcessorTest
{
    @Test()
    public void testPersonInfo_01() {
        PersonInfo personMock = mock(PersonInfo.class);

        when(personMock.getFirstName()).thenAnswer(new Answer<String>() {
            public String answer(InvocationOnMock invocationOnMock) throws Throwable {
                return "Generated";
            }
        });
        when(personMock.getLastName()).thenReturn("Second");
        when(personMock.getDateOfBirth()).thenReturn(new Date());
        List<String> children = new ArrayList<String>();
        children.add("Fedot");
        children.add("Netot");
        when(personMock.getChildrenNames()).thenReturn(children);
        given(personMock.getAge(anyInt())).willReturn(100, 200, 300, 400, 500);
        given(personMock.getAge(lt(PersonInfoProcessor.COUNT - 2))).willReturn(10);

        PersonInfoProcessor pip = new PersonInfoProcessor();
        pip.testPerson(personMock);
    }

    @Test(expected = IOException.class)
    public void testPersonInfo_02() {
        PersonInfo personMock = mock(PersonInfo.class);
        when(personMock.getAge(10)).thenThrow(IOException.class);
        //doThrow(IOException.class).when(personMock).getAge(10);

        personMock.getAge(10);
    }

    @Test()
    public void testPersonInfo_03() {
        PersonInfo personMock = mock(PersonInfo.class);

        PersonInfoProcessor pip = new PersonInfoProcessor();
        pip.testPerson(personMock);

        verify(personMock).getFirstName();
        verify(personMock, times(1)).getAge(1);
        verify(personMock, never()).neverCall();
    }

    @Test()
    public void testPersonInfo_04() {
        PersonInfo personMock = mock(PersonInfo.class);

        PersonInfoProcessor pip = new PersonInfoProcessor();
        pip.testPerson(personMock);

        InOrder order = inOrder(personMock);
        order.verify(personMock).getFirstName();
        order.verify(personMock).getLastName();
    }

    @Test()
    public void testPersonInfo_05() {
        PersonInfo personMock = mock(PersonInfo.class);
        verifyZeroInteractions(personMock);
    }

    @Test()
    public void testPersonInfo_06() {
        PersonInfoImpl person = new PersonInfoImpl();
        try {
            person.neverCall();
        } catch(Exception e) {
        }

        PersonInfo personMock = spy(person);
        willDoNothing().given(personMock).neverCall();
//        doNothing().when(personMock).neverCall();

        personMock.neverCall();
    }

}
