package com.danish.xvi.springbasics.autowire.bytype;

/*
 * ==========================================================================================
 *                                      COMPUTER INTERFACE
 * ==========================================================================================
 *
 * This interface defines a contract.
 *
 * Any class implementing this interface must provide
 * an implementation of the compile() method.
 *
 * We deliberately use an interface instead of directly
 * depending upon the Laptop class.
 *
 * Why?
 *
 * Spring encourages programming against interfaces
 * instead of concrete implementations.
 *
 * This creates Loose Coupling.
 *
 * Developer
 *      │
 *      ▼
 *  Computer (Interface)
 *      ▲
 *      │
 *  Laptop
 *
 * The Developer class knows only about Computer.
 *
 * It has no knowledge of Laptop.
 *
 * Therefore tomorrow we can replace Laptop with
 * Desktop without modifying Developer.java.
 *
 * ==========================================================================================
 */

public interface Computer {

    void compile();

}