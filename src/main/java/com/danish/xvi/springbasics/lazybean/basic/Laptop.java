package com.danish.xvi.springbasics.lazybean.basic;

/*
 * =============================================================================================
 *                                    LAPTOP CLASS
 * =============================================================================================
 *
 * This class implements the Computer interface.
 *
 * The constructor prints a message so that we can
 * easily identify WHEN Spring creates this bean.
 *
 * Normally,
 *
 * Singleton Beans
 *
 * are created during ApplicationContext initialization.
 *
 * However,
 *
 * in this example,
 *
 * the bean will be configured as
 *
 *      lazy-init="true"
 *
 * Therefore,
 * Spring will postpone object creation.
 *
 * Instead of creating the object during container startup,
 * Spring waits until someone actually requests
 * the bean using
 *
 *      getBean()
 *
 * This is called
 *
 *          Lazy Initialization
 *
 * =============================================================================================
 */

public class Laptop implements Computer {

    /*
     * =========================================================================================
     * DEFAULT CONSTRUCTOR
     * =========================================================================================
     *
     * If this message appears,
     * it means Spring has actually created
     * the Laptop object.
     *
     * If no one requests this bean,
     * this constructor will never execute.
     */

    public Laptop() {

        System.out.println("Laptop Bean Created.");

    }

    @Override
    public void compile() {

        System.out.println("Laptop is compiling the project.");

    }

}