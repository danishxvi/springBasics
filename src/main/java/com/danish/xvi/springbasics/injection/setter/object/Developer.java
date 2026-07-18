package com.danish.xvi.springbasics.injection.setter.object;

public class Developer {

    /*
     * ============================================================
     * NON-PRIMITIVE INSTANCE VARIABLE
     * ============================================================
     *
     * Instead of storing primitive values,
     * this variable stores the reference
     * of another object.
     *
     * Developer HAS-A Laptop.
     */

    private Laptop laptop;

    /*
     * ============================================================
     * DEFAULT CONSTRUCTOR
     * ============================================================
     *
     * Spring first creates the Developer object.
     */

    public Developer() {

        System.out.println("Developer object created.");

    }

    /*
     * ============================================================
     * SETTER METHOD
     * ============================================================
     *
     * XML
     *
     * <property name="laptop" ref="laptop"/>
     *
     * tells Spring:
     *
     * Find the bean whose id is "laptop"
     *
     * and call
     *
     * setLaptop(laptopObject)
     *
     * Notice that Spring injects the object,
     * not a String.
     */

    public void setLaptop(Laptop laptop) {

        System.out.println("Spring called setLaptop()");

        this.laptop = laptop;

    }

    public void coding() {

        System.out.println();

        System.out.println("Developer started coding.");

        laptop.compile();

    }

}