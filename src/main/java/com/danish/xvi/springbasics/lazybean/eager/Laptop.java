package com.danish.xvi.springbasics.lazybean.eager;

/*
 * =============================================================================================
 *                                   LAPTOP CLASS
 * =============================================================================================
 *
 * This bean will be configured as
 *
 *      lazy-init="true"
 *
 * Normally this means Spring should create
 * this object only when someone requests it.
 *
 * HOWEVER...
 *
 * In this example,
 *
 * Developer depends upon Laptop.
 *
 * Since Developer is NOT lazy,
 * Spring must create Laptop first
 * before it can finish creating Developer.
 *
 * Therefore,
 *
 * even though Laptop is lazy,
 *
 * Spring creates it during ApplicationContext creation.
 *
 * This proves an important rule:
 *
 *      Dependency Resolution takes precedence
 *      over Lazy Initialization.
 *
 * =============================================================================================
 */

public class Laptop implements Computer {

    public Laptop() {

        System.out.println("Laptop Bean Created.");

    }

    @Override
    public void compile() {

        System.out.println("Laptop is compiling the project.");

    }

}