package com.danish.xvi.springbasics.injection.constructor.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        /*
         * ===========================================================
         * STEP 1
         * ===========================================================
         *
         * Create the Spring IoC Container.
         *
         * Since singleton is the default scope,
         * Spring immediately starts creating
         * all singleton beans.
         *
         * Spring performs the following internally:
         *
         * Read XML
         * ↓
         * Parse bean definitions
         * ↓
         * Find constructor arguments
         * ↓
         * Convert XML values if required
         * ↓
         * Call the constructor
         * ↓
         * Store the fully initialized object
         * inside the IoC Container.
         *
         * Unlike Setter Injection,
         * there are NO setter methods involved.
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("injectionConstructorPrimitive.xml");

        System.out.println("--------------------------------");

        /*
         * ===========================================================
         * STEP 2
         * ===========================================================
         *
         * The object already exists.
         *
         * Spring simply returns the reference
         * of the singleton bean.
         */

        Developer developer =
                (Developer) context.getBean("developer");

        System.out.println("--------------------------------");

        developer.coding();

        ((ClassPathXmlApplicationContext) context).close();

    }

}