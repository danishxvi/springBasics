package com.danish.xvi.springbasics.lazybean.eager;

/*
 * =============================================================================================
 *                                  COMPUTER INTERFACE
 * =============================================================================================
 *
 * This interface acts as a contract.
 *
 * Any class implementing this interface
 * must provide an implementation of
 *
 *      compile()
 *
 * The Developer class depends on this interface
 * instead of directly depending on Laptop.
 *
 * This provides Loose Coupling.
 *
 * =============================================================================================
 */

public interface Computer {

    void compile();

}