package com.danish.xvi.springbasics.autowire.byname;

/*
 * =================================================================================================
 *                                      COMPUTER INTERFACE
 * =================================================================================================
 *
 * An interface in Java defines a contract.
 *
 * A contract simply means:
 *
 * "Any class implementing this interface MUST provide an implementation
 * for all the methods declared inside it."
 *
 * Interfaces promote one of the most important Object-Oriented Programming principles:
 *
 *                          Program to an Interface,
 *                          not to an Implementation.
 *
 * Why?
 *
 * Imagine the Developer class directly depends upon Laptop.
 *
 *      Developer
 *          |
 *          |
 *          ▼
 *       Laptop
 *
 * Now if tomorrow you decide to replace Laptop with Desktop,
 * Tablet, CloudComputer, or MacBook,
 * you'll have to modify the Developer class.
 *
 * This creates TIGHT COUPLING.
 *
 * Instead, we introduce an interface.
 *
 *                  Computer
 *                     ▲
 *                     │
 *          ┌──────────┴──────────┐
 *          │                     │
 *          │                     │
 *       Laptop               Desktop
 *
 * Now Developer depends only upon Computer.
 *
 * It doesn't care WHICH implementation is provided.
 *
 * This is called LOOSE COUPLING.
 *
 * Spring Framework strongly encourages this style because
 * Dependency Injection becomes extremely flexible.
 *
 * Today Spring may inject Laptop.
 *
 * Tomorrow it may inject Desktop.
 *
 * Developer never changes.
 *
 * =================================================================================================
 */

public interface Computer {

    /*
     * Any implementing class must define this method.
     */
    void compile();

}