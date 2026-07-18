package com.danish.xvi.springbasics.autowire.primary;

/*
 * =============================================================================================
 *                                   LAPTOP IMPLEMENTATION
 * =============================================================================================
 *
 * Laptop is one implementation of the Computer interface.
 *
 * Since multiple implementations will exist,
 * Spring will not automatically know
 * which implementation should be injected.
 *
 * Later,
 * we will mark THIS bean as
 *
 *      primary="true"
 *
 * inside the XML configuration.
 *
 * That tells Spring
 *
 * "If multiple Computer beans are found,
 * prefer this one."
 *
 * =============================================================================================
 */

public class Laptop implements Computer {

    /*
     * Constructor
     *
     * Printed simply to demonstrate
     * exactly when Spring creates
     * this bean.
     */

    public Laptop() {

        System.out.println("Laptop Bean Created.");

    }

    @Override
    public void compile() {

        System.out.println("Laptop is compiling the project.");

    }

}