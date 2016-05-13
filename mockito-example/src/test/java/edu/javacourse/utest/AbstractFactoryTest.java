package edu.javacourse.utest;

import edu.javacourse.dao.AbstractFactory;
import edu.javacourse.dao.FirstDAO;
import edu.javacourse.dao.SecondDAO;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by S.Anton on 5/13/16.
 */
public class AbstractFactoryTest
{
    @Test()
    public void testFactory() {
        AbstractFactory factoryMock = mock(AbstractFactory.class);
        FirstDAO firstMock = mock(FirstDAO.class);
        SecondDAO secondMock = mock(SecondDAO.class);
        when(factoryMock.getFirstDAO()).thenReturn(firstMock);
        when(factoryMock.getSecondDAO()).thenReturn(secondMock);

        FirstDAO first = factoryMock.getFirstDAO();
        first.callFirst();
    }
}
