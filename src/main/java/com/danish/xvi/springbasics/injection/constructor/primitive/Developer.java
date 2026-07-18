package com.danish.xvi.springbasics.injection.constructor.primitive;

public class Developer {

    /*
     * ===========================================================
     * INSTANCE VARIABLES
     * ===========================================================
     *
     * These variables receive their values
     * through the constructor.
     *
     * Since Constructor Injection is being used,
     * setter methods are not required.
     */

    private String name;

    private int experience;

    /*
     * ===========================================================
     * PARAMETERIZED CONSTRUCTOR
     * ===========================================================
     *
     * Spring creates the object by calling
     * this constructor.
     *
     * XML
     *
     * <constructor-arg value="Danish"/>
     * <constructor-arg value="2"/>
     *
     * becomes
     *
     * new Developer("Danish", 2);
     *
     * Notice:
     * Spring automatically converts
     * "2" (String from XML)
     * into integer 2.
     */

    public Developer(String name, int experience) {

        System.out.println("Parameterized constructor invoked.");

        this.name = name;
        this.experience = experience;

    }

    public void coding() {

        System.out.println();

        System.out.println("Developer Name : " + name);

        System.out.println("Experience : " + experience + " years");

    }

}