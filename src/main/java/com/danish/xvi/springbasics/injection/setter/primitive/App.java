package com.danish.xvi.springbasics.injection.setter.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        /*
         * ============================================================
         * STEP 1
         * ============================================================
         *
         * Create the Spring IoC Container.
         *
         * Spring now performs:
         *
         * 1 Read setterPrimitive.xml
         *
         * 2 Parse every bean definition.
         *
         * 3 Create Developer object
         *   using the default constructor.
         *
         * 4 Call setName("Danish")
         *
         * 5 Convert "5"
         *   into integer 5.
         *
         * 6 Call setExperience(5)
         *
         * 7 Store the completely initialized
         *   Developer object inside
         *   the IoC Container.
         *
         * Since singleton is the default scope,
         * all of this happens before getBean()
         * is executed.
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("setterPrimitive.xml");

        System.out.println("--------------------------------");

        /*
         * ============================================================
         * STEP 2
         * ============================================================
         *
         * The object already exists.
         *
         * Spring simply returns the reference
         * of the existing singleton object.
         */

        Developer dev =
                (Developer) context.getBean("developer");

        System.out.println("--------------------------------");

        /*
         * ============================================================
         * STEP 3
         * ============================================================
         *
         * Use the Spring-managed object.
         */

        dev.coding();

        /*
         * ============================================================
         * STEP 4
         * ============================================================
         *
         * Close the container.
         */

        ((ClassPathXmlApplicationContext) context).close();

    }

}