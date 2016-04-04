/*
 * Класс для создания экземпляра нужного класса
 */
package edu.javacourse.reflection;

import java.lang.annotation.Annotation;

// Объявление аннотации для класса
@FinanceAnnotation(financeBuilder = "edu.javacourse.reflection.WebFinanceInfoBuilder")
public class FinanceInfoBuilderFactory
{
    public static FinanceInfoBuilder getFinanceInfoBuilder() {
        try {
            // Получаем аннотацию к классу. Т.к. это наш класс, то можно его приводить
            Annotation ann = FinanceInfoBuilderFactory.class.getAnnotation(FinanceAnnotation.class);
            FinanceAnnotation fa = (FinanceAnnotation)ann;
            
            // Загружаем класс по имени
            Class cl = Class.forName(fa.financeBuilder());
            // Т.к. наш класс должен имплементировать интерфейс FinanceInfoBuilder
            // то мы можем сделать приведение к интерфейсу
            FinanceInfoBuilder builder = (FinanceInfoBuilder)cl.newInstance();
            return builder;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
}
