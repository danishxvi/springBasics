package com.danish.xvi.springbasics.autowire.bytype;

/*
 * ==========================================================================================
 *                                      DEVELOPER CLASS
 * ==========================================================================================
 *
 * The Developer class depends upon a Computer.
 *
 * Notice carefully
 *
 * We are NOT writing
 *
 *      private Laptop laptop;
 *
 * Instead
 *
 *      private Computer computer;
 *
 * This is called Programming to an Interface.
 *
 * Spring will inject an implementation of Computer.
 *
 * Since only one implementation (Laptop)
 * exists in the IoC Container,
 * Spring can easily inject it.
 *
 * Unlike autowire="byName",
 * Spring DOES NOT care about the property name.
 *
 * Instead it checks the PROPERTY TYPE.
 *
 * Property Type
 *
 *      Computer
 *
 * Spring now searches the IoC Container
 * for a bean whose type is Computer.
 */

public class Developer {

    /*
     * ======================================================================================
     * PROPERTY
     * ======================================================================================
     *
     * Property Name
     *
     *      computer
     *
     * Property Type
     *
     *      Computer
     *
     * For autowire="byType"
     *
     * Spring completely ignores
     * the property name.
     *
     * It only checks
     *
     *          Computer
     */

    private Computer computer;

    public Developer() {

        System.out.println("Developer Bean Created.");

    }

    /*
     * ======================================================================================
     * SETTER METHOD
     * ======================================================================================
     *
     * Spring automatically calls
     *
     *      setComputer(...)
     *
     * after finding a bean whose type
     * matches Computer.
     */

    public void setComputer(Computer computer) {

        System.out.println();

        System.out.println("Spring injected Computer using byType.");

        this.computer = computer;

    }

    public void coding() {

        System.out.println();

        System.out.println("Developer started coding...");

        computer.compile();

    }

}