package com.danish.xvi.springbasics.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * =================================================================================================
 *                                          APP CLASS
 * =================================================================================================
 *
 * This class starts the Spring Framework.
 *
 * ApplicationContext represents the Spring IoC Container.
 *
 * The IoC Container is responsible for
 *
 *      1. Creating Objects
 *
 *      2. Managing Objects
 *
 *      3. Injecting Dependencies
 *
 *      4. Destroying Objects
 *
 * Developers simply ask Spring
 * for the required object.
 *
 * Spring takes care of everything else.
 *
 * =================================================================================================
 */

public class App {

    public static void main(String[] args) {

        /*
         * =========================================================================================
         * STEP 1
         * =========================================================================================
         *
         * Create the Spring IoC Container.
         *
         * During this line,
         * Spring performs MANY internal operations.
         *
         * Step 1
         *
         * Read XML file.
         *
         * Step 2
         *
         * Parse every Bean Definition.
         *
         * Step 3
         *
         * Create every Singleton Bean.
         *
         * Step 4
         *
         * Create Laptop Bean.
         *
         * Step 5
         *
         * Create Developer Bean.
         *
         * Step 6
         *
         * Since autowire="byName"
         *
         * Spring checks every setter.
         *
         * Finds
         *
         *          setComputer()
         *
         * Property Name
         *
         *          computer
         *
         * Searches IoC Container
         *
         * for Bean ID
         *
         *          computer
         *
         * Finds matching bean.
         *
         * Calls
         *
         *          setComputer(bean)
         *
         * Bean is now fully initialized.
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowireByName.xml");

        System.out.println();

        System.out.println("----------------------------------------");

        /*
         * =========================================================================================
         * STEP 2
         * =========================================================================================
         *
         * Object already exists.
         *
         * Spring simply returns
         * the existing singleton object.
         */

        Developer developer =
                (Developer) context.getBean("developer");

        System.out.println("----------------------------------------");

        developer.coding();

        ((ClassPathXmlApplicationContext) context).close();

    }

}