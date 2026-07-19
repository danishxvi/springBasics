package com.danish.xvi.springbasics.lazybean.basic;

/*
 * =============================================================================================
 *                                   COMPUTER INTERFACE
 * =============================================================================================
 *
 * This interface represents a generic Computer.
 *
 * We are using an interface instead of directly
 * depending upon Laptop because Spring encourages
 * programming to interfaces rather than implementations.
 *
 * In this example, the interface only contains one method.
 *
 * Any class implementing this interface must provide
 * the implementation of compile().
 *
 * =============================================================================================
 */

public interface Computer {

    void compile();

}