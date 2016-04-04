package edu.javacourse.reflection;

public class FininceExample
{
    public static void main(String[] args) {
        // Получаем нужный объект
        FinanceInfoBuilder fib = FinanceInfoBuilderFactory.getFinanceInfoBuilder();

        // Вызываем метод
        FinanceInformation info = fib.buildFinacneInformation();
        System.out.println("Имя класса:" + fib.getClass().getCanonicalName());
        // Дальше можем делать с полученной информацией все, что захотим
    }
}
