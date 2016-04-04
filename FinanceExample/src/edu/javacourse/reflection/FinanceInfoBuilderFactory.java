/*
 * Класс для создания экземпляра нужного класса
 */
package edu.javacourse.reflection;

import java.util.PropertyResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FinanceInfoBuilderFactory
{
    // Сделаем констуанту для имения нужного нам свойства
    private static final String BUILDER_CLASS = "builder.class";
    
    public static FinanceInfoBuilder getFinanceInfoBuilder() {
        // Получаем имя класса из файла builder.properties
        PropertyResourceBundle pr = (PropertyResourceBundle) 
                PropertyResourceBundle.getBundle("edu.javacourse.reflection.builder");
        String className = pr.getString(BUILDER_CLASS);
        
        try {
            // Загружаем класс по имени
            Class cl = Class.forName(className);
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
