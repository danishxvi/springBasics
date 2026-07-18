package com.danish.xvi.springbasics.injection.constructor.object;

public class Laptop {

    /*
     * ==========================================================
     * DEFAULT CONSTRUCTOR
     * ==========================================================
     *
     * Spring creates this bean first.
     *
     * Why?
     *
     * Because Developer depends upon Laptop.
     *
     * A dependency must exist before it
     * can be injected.
     */

    public Laptop() {

        System.out.println("Laptop object created.");

    }

    public void compile() {

        System.out.println("Laptop is compiling Java code.");

    }

}