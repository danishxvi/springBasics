package com.danish.xvi.springbasics.injection.constructor.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        /*
         * Change only this filename
         * to test different approaches.
         *
         * constructorIndex.xml
         * constructorType.xml
         * constructorName.xml
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("injectionConstructorAmbiguityIndex.xml");

        Employee emp =
                (Employee) context.getBean("employee");

        emp.display();

        ((ClassPathXmlApplicationContext) context).close();

    }

}