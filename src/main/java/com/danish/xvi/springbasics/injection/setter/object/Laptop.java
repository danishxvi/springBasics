package com.danish.xvi.springbasics.injection.setter.object;

public class Laptop {

    /*
     * ============================================================
     * DEFAULT CONSTRUCTOR
     * ============================================================
     *
     * Spring creates this object first because
     * the Developer bean depends upon it.
     */

    public Laptop() {

        System.out.println("Laptop object created.");

    }

    public void compile() {

        System.out.println("Laptop is compiling Java code.");

    }

}