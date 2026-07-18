package com.danish.xvi.springbasics.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * ============================================================================================
 *                                      APP CLASS
 * ============================================================================================
 *
 * This class starts the Spring IoC Container.
 *
 * During the creation of ApplicationContext,
 * Spring performs all Dependency Injection.
 *
 * Since Singleton is the default scope,
 * all singleton beans are created immediately.
 *
 * By the time getBean() is executed,
 * the Developer object is already fully initialized.
 *
 * ============================================================================================
 */

public class App {

    public static void main(String[] args) {

        /*
         * ========================================================================================
         * STEP 1
         * ========================================================================================
         *
         * Create the Spring IoC Container.
         *
         * Spring internally performs
         *
         * Read XML
         * ↓
         * Parse Bean Definitions
         * ↓
         * Create Laptop Bean
         * ↓
         * Create Developer Bean
         * ↓
         * Inspect every setter
         * ↓
         * Find
         *
         *      setComputer(Computer computer)
         *
         * Property Type
         *
         *      Computer
         *
         * Search IoC Container
         *
         * for Bean Type
         *
         *      Computer
         *
         * Bean Found
         *
         * Inject Dependency
         *
         * Bean Ready
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowireByType.xml");

        System.out.println();

        System.out.println("--------------------------------------------");

        /*
         * Bean already exists.
         */

        Developer developer =
                (Developer) context.getBean("developer");

        System.out.println("--------------------------------------------");

        developer.coding();

        ((ClassPathXmlApplicationContext) context).close();

    }

}