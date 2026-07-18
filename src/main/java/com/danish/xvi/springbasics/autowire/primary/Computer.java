package com.danish.xvi.springbasics.autowire.primary;

/*
 * =============================================================================================
 *                                   COMPUTER INTERFACE
 * =============================================================================================
 *
 * This interface represents a generic Computer.
 *
 * Instead of making the Developer class depend upon
 * a specific implementation like Laptop,
 * we make it depend upon an abstraction.
 *
 * This follows one of the most important Object-Oriented
 * Programming principles.
 *
 *      "Program to an Interface,
 *       not to an Implementation."
 *
 * Benefits
 * --------
 *
 * ✔ Loose Coupling
 *
 * ✔ Easy Maintenance
 *
 * ✔ Easy Testing
 *
 * ✔ Easy Replacement of Implementations
 *
 * =============================================================================================
 *
 * Current Implementations
 *
 *              Computer
 *                 ▲
 *                 │
 *      ┌──────────┴──────────┐
 *      │                     │
 *      │                     │
 *   Laptop               Desktop
 *
 * =============================================================================================
 */

public interface Computer {

    void compile();

}