package com.danish.xvi.springbasics.autowire.byname;

/*
 * =================================================================================================
 *                                      LAPTOP CLASS
 * =================================================================================================
 *
 * Laptop IMPLEMENTS the Computer interface.
 *
 * This means Laptop agrees to fulfill the contract defined by Computer.
 *
 * Therefore it MUST provide an implementation of
 *
 *      compile()
 *
 * Laptop is one possible implementation.
 *
 * Tomorrow we could easily create
 *
 *      Desktop
 *
 *      Tablet
 *
 *      CloudComputer
 *
 * without modifying the Developer class.
 *
 * This is one of the biggest advantages of programming
 * against interfaces.
 *
 * =================================================================================================
 */

public class Laptop implements Computer {

    /*
     * =============================================================================================
     * DEFAULT CONSTRUCTOR
     * =============================================================================================
     *
     * This constructor is invoked by Spring.
     *
     * Since singleton is the default bean scope,
     * Spring creates this object while initializing
     * the IoC Container.
     *
     * It is NOT created when getBean() is called.
     *
     * Constructor execution proves
     * exactly when Spring creates the object.
     */

    public Laptop() {

        System.out.println("Laptop Bean Created.");

    }

    /*
     * =============================================================================================
     * IMPLEMENTATION OF INTERFACE METHOD
     * =============================================================================================
     *
     * Since Laptop implements Computer,
     * Java forces us to provide the implementation
     * of compile().
     */

    @Override
    public void compile() {

        System.out.println("Laptop is compiling the Java Project...");

    }

}