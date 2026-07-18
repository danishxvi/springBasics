package com.danish.xvi.springbasics.autowire.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * =============================================================================================
 *                                         APP CLASS
 * =============================================================================================
 *
 * This class starts the Spring IoC Container.
 *
 * The moment ApplicationContext is created,
 * Spring performs the following tasks:
 *
 *      1. Read the XML configuration file.
 *
 *      2. Parse every Bean Definition.
 *
 *      3. Create all Singleton Beans.
 *
 *      4. Resolve all Dependencies.
 *
 *      5. Inject Dependencies.
 *
 *      6. Store Beans inside the IoC Container.
 *
 * After this process,
 * every bean is completely initialized.
 *
 * Therefore,
 *
 *      getBean()
 *
 * simply returns an already existing object.
 *
 * =============================================================================================
 */

public class App {

    public static void main(String[] args) {

        /*
         * Create the Spring IoC Container.
         *
         * Spring immediately creates
         *
         * Laptop Bean
         *
         * Desktop Bean
         *
         * Developer Bean
         *
         * Then it starts dependency injection.
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowirePrimary.xml");

        System.out.println();

        System.out.println("------------------------------------------");

        Developer developer =
                (Developer) context.getBean("developer");

        System.out.println("------------------------------------------");

        developer.coding();

        ((ClassPathXmlApplicationContext) context).close();

    }

}