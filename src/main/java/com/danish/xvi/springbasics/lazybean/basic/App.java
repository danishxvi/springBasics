package com.danish.xvi.springbasics.lazybean.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * =============================================================================================
 *                                         APP CLASS
 * =============================================================================================
 *
 * This example demonstrates Lazy Initialization.
 *
 * Notice carefully.
 *
 * Creating the ApplicationContext DOES NOT
 * immediately create the Laptop bean because
 * it is marked as lazy.
 *
 * Spring simply stores the Bean Definition.
 *
 * Actual object creation happens only when
 * getBean("laptop") is executed.
 *
 * =============================================================================================
 */

public class App {

    public static void main(String[] args) {

        System.out.println("Before creating ApplicationContext\n");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("lazyBeanBasic.xml");

        /*
         * If the bean is truly lazy,
         * the Laptop constructor should NOT
         * execute before this point.
         */

        System.out.println("\nApplicationContext Created");

        System.out.println("\nNo Laptop object has been created yet.");

        System.out.println("\n-----------------------------------------");

        /*
         * Now Spring is forced to create
         * the Laptop bean because
         * the application explicitly requests it.
         */

        Computer computer =
                (Computer) context.getBean("laptop");

        System.out.println("-----------------------------------------\n");

        computer.compile();

        ((ClassPathXmlApplicationContext) context).close();

    }

}