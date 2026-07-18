package com.danish.xvi.springbasics.injection.setter.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        /*
         * ============================================================
         * STEP 1
         * ============================================================
         *
         * Spring creates the IoC Container.
         *
         * During startup Spring performs:
         *
         * Read XML
         * ↓
         * Parse bean definitions
         * ↓
         * Create Laptop bean
         * ↓
         * Create Developer bean
         * ↓
         * Inject Laptop bean into Developer
         * ↓
         * Store both singleton beans
         * inside the IoC Container.
         *
         * Since singleton is the default scope,
         * all of this happens before getBean().
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("injectionSetterObject.xml");

        System.out.println("--------------------------------");

        /*
         * ============================================================
         * STEP 2
         * ============================================================
         *
         * The Developer object is already created.
         *
         * Spring simply returns its reference.
         */

        Developer developer =
                (Developer) context.getBean("developer");

        System.out.println("--------------------------------");

        /*
         * ============================================================
         * STEP 3
         * ============================================================
         *
         * Call the business method.
         */

        developer.coding();

        ((ClassPathXmlApplicationContext) context).close();

    }

}