package com.danish.xvi.springbasics.scope.prototype;

public class Developer {

    /*
     * ===============================================================
     * CONSTRUCTOR
     * ===============================================================
     *
     * This constructor is executed every time Spring creates a
     * Developer object.
     *
     * Since the bean scope is "prototype",
     * Spring creates a NEW object whenever getBean() is called.
     *
     * Therefore,
     * if getBean() is called three times,
     * this constructor will also execute three times.
     */

    public Developer() {
        System.out.println("Developer constructor executed.");
        System.out.println("A new Developer object has been created.\n");
    }

    public void coding() {
        System.out.println("Developer is coding...");
    }
}