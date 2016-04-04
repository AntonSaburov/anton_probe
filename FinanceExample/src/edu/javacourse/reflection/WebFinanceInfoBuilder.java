/*
 * Реализация интерфейса FinanceInfoBuilder
 * которая работает с информацией из веб-сервиса
 */
package edu.javacourse.reflection;

import edu.javacourse.reflection.FinanceInfoBuilder;
import edu.javacourse.reflection.FinanceInformation;

public class WebFinanceInfoBuilder implements FinanceInfoBuilder
{
    @Override
    public FinanceInformation buildFinacneInformation() {
        System.out.println("Вызов метода для объекта WebFinanceInfoBuilder");
        return new FinanceInformation();
    }
}
