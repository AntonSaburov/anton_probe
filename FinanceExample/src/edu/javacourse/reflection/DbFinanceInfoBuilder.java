/*
 * Реализация интерфейса FinanceInfoBuilder
 * которая работает с информацией из базы данных
 */
package edu.javacourse.reflection;

public class DbFinanceInfoBuilder implements FinanceInfoBuilder
{

    @Override
    public FinanceInformation buildFinacneInformation() {
        System.out.println("Вызов метода для объекта DbFinanceInfoBuilder");
        return new FinanceInformation();
    }
}
