package com.danish.xvi.springbasics.lazybean.eager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * =============================================================================================
 *                                      APP CLASS
 * =============================================================================================
 *
 * Observe the console carefully.
 *
 * We NEVER call
 *
 *      getBean("laptop")
 *
 * Yet,
 *
 * Laptop Bean Created
 *
 * will still appear.
 *
 * Why?
 *
 * Because Developer depends upon Laptop.
 *
 * Spring cannot create Developer
 * without first creating Laptop.
 *
 * =============================================================================================
 */

public class App {

    public static void main(String[] args) {

        System.out.println("Before Creating ApplicationContext\n");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("lazyBeanEager.xml");

        System.out.println("\nApplicationContext Created");

        System.out.println("\n--------------------------------------");

        Developer developer =
                (Developer) context.getBean("developer");

        System.out.println("--------------------------------------");

        developer.coding();

        ((ClassPathXmlApplicationContext) context).close();

    }

}