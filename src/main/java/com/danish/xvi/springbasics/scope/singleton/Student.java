package com.danish.xvi.springbasics.scope.singleton;

/**
 * ============================================================
 * CLASS NAME : Student
 * ============================================================
 *
 * This is a simple Java class (POJO).
 *
 * IMPORTANT:
 *
 * There is absolutely NOTHING Spring-specific inside this class.
 *
 * It does not know:
 *
 * 1. What Spring is.
 * 2. What IoC Container is.
 * 3. What Bean Scope is.
 * 4. Whether it is Singleton or Prototype.
 *
 * Spring simply creates objects of this class.
 *
 * This is one of the biggest strengths of Spring:
 * Your business classes remain plain Java classes.
 */
public class Student {

    /**
     * Name of the student.
     */
    private String name;

    /**
     * Constructor
     *
     * Whenever Spring creates a Student object,
     * this constructor will execute.
     *
     * We'll print a message so that we can observe
     * exactly how many Student objects Spring creates.
     */
    public Student() {

        System.out.println("Student object created.");

    }

    /**
     * Setter Injection
     *
     * Spring will call this method while creating
     * the bean because the XML configuration
     * provides a value for "name".
     */
    public void setName(String name) {

        this.name = name;

    }

    /**
     * Displays the student information.
     */
    public void display() {

        System.out.println("Student Name : " + name);

    }

}