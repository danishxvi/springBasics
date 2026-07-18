package com.danish.xvi.springbasics.injection.constructor.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        /*
         * ==========================================================
         * STEP 1
         * ==========================================================
         *
         * Create the Spring IoC Container.
         *
         * Spring now performs:
         *
         * Read XML
         * ↓
         * Parse Bean Definitions
         * ↓
         * Find Developer Bean
         * ↓
         * Developer requires Laptop
         * ↓
         * Create Laptop Bean
         * ↓
         * Create Developer Bean
         * ↓
         * Pass Laptop object to constructor
         * ↓
         * Store both beans inside
         * the IoC Container.
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("injectionConstructorObject.xml");

        System.out.println("--------------------------------");

        /*
         * ==========================================================
         * STEP 2
         * ==========================================================
         *
         * The Developer bean has already been
         * created during container initialization.
         *
         * Spring simply returns its reference.
         */

        Developer developer =
                (Developer) context.getBean("developer");

        System.out.println("--------------------------------");

        developer.coding();

        ((ClassPathXmlApplicationContext) context).close();

    }

}