package com.danish.xvi.springbasics.autowire.primary;

/*
 * =============================================================================================
 *                                  DESKTOP IMPLEMENTATION
 * =============================================================================================
 *
 * Desktop is another implementation
 * of the Computer interface.
 *
 * Therefore Spring IoC Container now has
 * TWO beans implementing
 *
 *              Computer
 *
 *                  ▲
 *                  │
 *      ┌───────────┴────────────┐
 *      │                        │
 *      │                        │
 *   Laptop                  Desktop
 *
 * This creates ambiguity.
 *
 * Spring now has two possible candidates.
 *
 * Which one should be injected?
 *
 * Laptop ?
 *
 * or
 *
 * Desktop ?
 *
 * Without additional configuration,
 * Spring throws an exception.
 *
 * =============================================================================================
 */

public class Desktop implements Computer {

    public Desktop() {

        System.out.println("Desktop Bean Created.");

    }

    @Override
    public void compile() {

        System.out.println("Desktop is compiling the project.");

    }

}