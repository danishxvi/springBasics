package com.danish.xvi.springbasics.injection.constructor.object;

public class Developer {

    /*
     * ==========================================================
     * INSTANCE VARIABLE
     * ==========================================================
     *
     * Developer HAS-A Laptop.
     *
     * Instead of creating Laptop itself,
     * Spring injects an existing Laptop object.
     */

    private Laptop laptop;

    /*
     * ==========================================================
     * PARAMETERIZED CONSTRUCTOR
     * ==========================================================
     *
     * XML
     *
     * <constructor-arg ref="laptop"/>
     *
     * tells Spring:
     *
     * Find the bean whose id is "laptop"
     *
     * then call
     *
     * new Developer(laptopObject);
     */

    public Developer(Laptop laptop) {

        System.out.println("Developer constructor invoked.");

        this.laptop = laptop;

    }

    public void coding() {

        System.out.println();

        System.out.println("Developer started coding.");

        laptop.compile();

    }

}