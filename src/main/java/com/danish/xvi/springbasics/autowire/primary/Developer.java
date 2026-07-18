package com.danish.xvi.springbasics.autowire.primary;

/*
 * =============================================================================================
 *                                    DEVELOPER CLASS
 * =============================================================================================
 *
 * The Developer class depends upon
 *
 *          Computer
 *
 * instead of Laptop.
 *
 * This allows Spring
 * to inject ANY implementation
 * of Computer.
 *
 * =============================================================================================
 */

public class Developer {

    /*
     * =========================================================================================
     * DEPENDENCY
     * =========================================================================================
     *
     * Property Type
     *
     *          Computer
     *
     * Spring checks ONLY this type
     * because we are using
     *
     *          autowire="byType"
     *
     * Spring searches for every bean
     * implementing Computer.
     *
     * In our project,
     * there are TWO.
     *
     *      Laptop
     *
     *      Desktop
     *
     * Since two candidates exist,
     * Spring normally cannot decide.
     *
     * We solve this problem
     * using
     *
     *          primary="true"
     *
     * in the XML.
     */

    private Computer computer;

    public Developer() {

        System.out.println("Developer Bean Created.");

    }

    /*
     * =========================================================================================
     * This setter is automatically called
     * by Spring after it determines
     * which Computer bean should be injected.
     *
     * Since Laptop is marked as Primary,
     * Spring injects Laptop.
     *
     * Internally Spring performs
     *
     *      setComputer(laptopBean);
     *
     * =========================================================================================
     */

    public void setComputer(Computer computer) {

        System.out.println();

        System.out.println("Spring injected the PRIMARY Computer Bean.");

        this.computer = computer;

    }

    public void coding() {

        System.out.println();

        System.out.println("Developer started coding...");

        computer.compile();

    }

}