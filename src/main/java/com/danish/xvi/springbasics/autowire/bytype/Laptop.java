package com.danish.xvi.springbasics.autowire.bytype;

/*
 * ==========================================================================================
 *                                      LAPTOP CLASS
 * ==========================================================================================
 *
 * Laptop is one implementation of the Computer interface.
 *
 * Spring will create an object of this class
 * and inject it wherever a Computer dependency exists.
 */

public class Laptop implements Computer {

    /*
     * Constructor
     *
     * The message printed here proves
     * exactly when Spring creates this bean.
     */

    public Laptop() {

        System.out.println("Laptop Bean Created.");

    }

    @Override
    public void compile() {

        System.out.println("Laptop is compiling the Java Project.");

    }

}