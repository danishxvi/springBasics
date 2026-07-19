package com.danish.xvi.springbasics.lazybean.eager;

/*
 * =============================================================================================
 *                                   DEVELOPER CLASS
 * =============================================================================================
 *
 * This bean is NOT configured as lazy.
 *
 * Therefore,
 * Spring will create it immediately
 * during ApplicationContext initialization.
 *
 * The Developer bean depends on Computer.
 *
 * Before Spring can complete the creation
 * of Developer,
 * it must first inject a Computer object.
 *
 * The only available implementation is Laptop.
 *
 * Although Laptop is lazy,
 * Spring creates it immediately because
 * Developer cannot exist without it.
 *
 * =============================================================================================
 */

public class Developer {

    private Computer computer;

    public Developer() {

        System.out.println("Developer Bean Created.");

    }

    /*
     * Spring automatically calls this setter
     * during dependency injection.
     */

    public void setComputer(Computer computer) {

        System.out.println("Spring injected Laptop into Developer.");

        this.computer = computer;

    }

    public void coding() {

        System.out.println();

        System.out.println("Developer started coding.");

        computer.compile();

    }

}