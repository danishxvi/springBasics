package com.danish.xvi.springbasics.injection.setter.primitive;

public class Developer {

    /*
     * ============================================================
     *                 INSTANCE VARIABLES
     * ============================================================
     *
     * These variables are private.
     *
     * Therefore Spring cannot directly modify them.
     *
     * Instead Spring uses the setter methods
     * to assign values.
     */

    private String name;

    private int experience;

    /*
     * ============================================================
     *              DEFAULT CONSTRUCTOR
     * ============================================================
     *
     * Since we are using Setter Injection,
     * Spring first creates the object using
     * this no-argument constructor.
     *
     * After the object has been created,
     * Spring starts calling the setter methods.
     */

    public Developer() {

        System.out.println("Developer object created.\n");

    }

    /*
     * ============================================================
     *                SETTER FOR NAME
     * ============================================================
     *
     * XML
     *
     * <property name="name" value="Danish"/>
     *
     * tells Spring to call
     *
     * setName("Danish")
     */

    public void setName(String name) {

        System.out.println("Spring called setName()");

        this.name = name;

    }

    /*
     * ============================================================
     *             SETTER FOR EXPERIENCE
     * ============================================================
     *
     * XML
     *
     * value="5"
     *
     * is written as a String inside XML.
     *
     * Spring automatically converts
     *
     * "5"
     *
     * into
     *
     * int 5
     *
     * before calling this method.
     */

    public void setExperience(int experience) {

        System.out.println("Spring called setExperience()");

        this.experience = experience;

    }

    public void coding() {

        System.out.println();

        System.out.println("Developer Name : " + name);

        System.out.println("Experience : " + experience + " years");

    }

}