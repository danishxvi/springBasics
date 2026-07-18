package com.danish.xvi.springbasics.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ============================================================
 * Spring Bean Scope Demo
 * ============================================================
 *
 * This program demonstrates how Spring manages
 * Singleton Beans.
 */
public class App {

    public static void main(String[] args) {

        /*
         * Creating the IoC Container.
         *
         * Spring reads scope.xml.
         *
         * It creates every Singleton bean immediately.
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("scopeSingleton.xml");

        System.out.println();

        System.out.println("Requesting first bean...");

        Student student1 =
                context.getBean("student", Student.class);

        System.out.println();

        System.out.println("Requesting second bean...");

        Student student2 =
                context.getBean("student", Student.class);

        System.out.println();

        System.out.println("---------------------------");

        student1.display();

        student2.display();

        System.out.println("---------------------------");

        /*
         * identityHashCode()
         *
         * Prints the memory identity of the object.
         *
         * If both numbers are equal,
         * both references point to the SAME object.
         */

        System.out.println();

        System.out.println(
                System.identityHashCode(student1));

        System.out.println(
                System.identityHashCode(student2));

        /*
         * Comparing object references.
         */

        System.out.println();

        System.out.println(student1 == student2);
        
        
        ((ClassPathXmlApplicationContext) context).close();
    }

}