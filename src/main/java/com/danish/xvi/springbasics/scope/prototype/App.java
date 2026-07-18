package com.danish.xvi.springbasics.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        /*
         * ===============================================================
         * STEP 1 - CREATE THE SPRING IoC CONTAINER
         * ===============================================================
         *
         * Unlike Singleton beans,
         * Spring DOES NOT create prototype beans during container startup.
         *
         * At this line Spring performs the following:
         *
         * 1. Reads prototype.xml.
         *
         * 2. Parses every <bean> definition.
         *
         * 3. Creates the IoC Container.
         *
         * 4. Registers all bean definitions internally.
         *
         * 5. Notices that "developer" is a prototype bean.
         *
         * 6. DOES NOT instantiate the Developer object.
         *
         * Spring only remembers:
         *
         * Bean Id      : developer
         * Bean Class   : Developer
         * Scope        : prototype
         *
         * No constructor is called here.
         *
         * Therefore,
         * after executing this line,
         * nothing will be printed from the Developer constructor.
         */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("scopePrototype.xml");



        System.out.println("\nContainer created.\n");



        /*
         * ===============================================================
         * STEP 2 - REQUEST THE BEAN FOR THE FIRST TIME
         * ===============================================================
         *
         * Since the bean is prototype scoped,
         * Spring now performs the following:
         *
         * 1. Looks for bean id "developer".
         *
         * 2. Finds its bean definition.
         *
         * 3. Creates a NEW Developer object.
         *
         * 4. Calls the constructor.
         *
         * 5. Injects dependencies (if any).
         *
         * 6. Returns the object reference.
         *
         * This is the FIRST Developer object.
         */

        Developer dev1 =
                (Developer) context.getBean("developer");



        System.out.println("-----------------------------------");



        /*
         * ===============================================================
         * STEP 3 - REQUEST THE SAME BEAN AGAIN
         * ===============================================================
         *
         * Spring DOES NOT return dev1.
         *
         * Instead,
         * it repeats the entire object creation process.
         *
         * Again it performs:
         *
         * Create object
         * ↓
         * Call constructor
         * ↓
         * Inject dependencies
         * ↓
         * Return object
         *
         * Therefore,
         * dev2 is a completely different object.
         */

        Developer dev2 =
                (Developer) context.getBean("developer");



        System.out.println("-----------------------------------");



        /*
         * ===============================================================
         * STEP 4 - REQUEST THE SAME BEAN FOR THE THIRD TIME
         * ===============================================================
         *
         * Exactly the same process happens again.
         *
         * Spring creates another completely new object.
         */

        Developer dev3 =
                (Developer) context.getBean("developer");



        System.out.println("\n");



        /*
         * ===============================================================
         * STEP 5 - PRINT OBJECT REFERENCES
         * ===============================================================
         *
         * Every Java object has a different memory address.
         *
         * Since prototype creates a new object every time,
         * all three references will be different.
         */

        System.out.println(dev1);

        System.out.println(dev2);

        System.out.println(dev3);



        System.out.println("\n");



        /*
         * ===============================================================
         * STEP 6 - VERIFY OBJECT IDENTITY
         * ===============================================================
         *
         * == compares object references.
         *
         * Since prototype creates a new object every time,
         * every comparison below will be false.
         */

        System.out.println(dev1 == dev2);

        System.out.println(dev2 == dev3);

        System.out.println(dev1 == dev3);



        /*
         * ===============================================================
         * STEP 7 - CLOSE THE CONTAINER
         * ===============================================================
         *
         * Spring closes the IoC container.
         *
         * IMPORTANT DIFFERENCE:
         *
         * For Singleton beans,
         * Spring manages the complete lifecycle,
         * including destruction callbacks.
         *
         * For Prototype beans,
         * Spring only creates and initializes the objects.
         *
         * After returning the prototype object,
         * Spring no longer manages its lifecycle.
         *
         * Therefore,
         * destroy-method and @PreDestroy methods
         * are NOT automatically called for prototype beans.
         */

        ((ClassPathXmlApplicationContext) context).close();

    }

}