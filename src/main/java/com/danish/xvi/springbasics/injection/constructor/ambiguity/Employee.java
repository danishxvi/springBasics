package com.danish.xvi.springbasics.injection.constructor.ambiguity;

public class Employee {

    private String name;
    private int age;
    private String city;

    /*
     * ============================================================
     * PARAMETERIZED CONSTRUCTOR
     * ============================================================
     *
     * We intentionally have multiple constructor parameters
     * to demonstrate how Spring matches XML values with
     * constructor parameters.
     *
     * Different XML files will use:
     *
     * 1. index
     * 2. type
     * 3. name
     *
     * Although the XML differs,
     * Spring always ends up calling
     *
     * new Employee("Danish",22,"Delhi");
     */

    public Employee(String name, int age, String city) {

        System.out.println("Parameterized Constructor Invoked.\n");

        this.name = name;
        this.age = age;
        this.city = city;

    }

    public void display() {

        System.out.println("Name : " + name);

        System.out.println("Age : " + age);

        System.out.println("City : " + city);

    }

}