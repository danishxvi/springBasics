package com.danish.xvi.springbasics.autowire.byname;

/*
 * =================================================================================================
 *                                      DEVELOPER CLASS
 * =================================================================================================
 *
 * This class depends upon a Computer.
 *
 * Notice carefully that we are NOT writing
 *
 *      private Laptop laptop;
 *
 * Instead we are writing
 *
 *      private Computer computer;
 *
 * This is one of the biggest advantages of using
 * Dependency Injection.
 *
 * Developer DOES NOT KNOW
 *
 * whether it receives
 *
 *      Laptop
 *      Desktop
 *      GamingLaptop
 *      MacBook
 *
 * It only knows
 *
 *      "I need a Computer."
 *
 * Whoever gives me a Computer,
 * I'll use it.
 *
 * This is called
 *
 *          Programming to an Interface.
 *
 * Spring Framework promotes this style because
 * it creates Loose Coupling.
 *
 * Loose Coupling means
 *
 * If tomorrow Laptop changes to Desktop,
 *
 * Developer.java remains exactly the same.
 *
 * =================================================================================================
 */

public class Developer {

    /*
     * =============================================================================================
     * DEPENDENCY
     * =============================================================================================
     *
     * This object will be injected by Spring.
     *
     * Notice the PROPERTY NAME
     *
     *              computer
     *
     * This is EXTREMELY IMPORTANT for
     * Autowire byName.
     *
     * Spring will search the IoC Container
     * for a bean whose id is
     *
     *              computer
     *
     * If it finds one,
     * it automatically calls
     *
     *          setComputer(bean)
     *
     * If it cannot find one,
     * this variable remains null.
     *
     * Spring NEVER creates the object here.
     */

    private Computer computer;

    /*
     * =============================================================================================
     * DEFAULT CONSTRUCTOR
     * =============================================================================================
     *
     * Spring first creates the Developer object.
     *
     * After creating the object,
     *
     * it starts performing Dependency Injection.
     */

    public Developer() {

        System.out.println("Developer Bean Created.");

    }

    /*
     * =============================================================================================
     * SETTER METHOD
     * =============================================================================================
     *
     * This setter is automatically called by Spring.
     *
     * We NEVER call
     *
     *      setComputer(...)
     *
     * ourselves.
     *
     * Spring calls it because
     *
     * autowire="byName"
     *
     * has been configured inside the XML.
     *
     * Internally Spring performs something similar to
     *
     *      developer.setComputer(computerBean);
     *
     * where
     *
     * computerBean
     *
     * is fetched from the IoC Container.
     */

    public void setComputer(Computer computer) {

        System.out.println();

        System.out.println("Spring called setComputer() automatically.");

        this.computer = computer;

    }

    /*
     * =============================================================================================
     * BUSINESS METHOD
     * =============================================================================================
     *
     * This method demonstrates that
     * the dependency has been injected successfully.
     */

    public void coding() {

        System.out.println();

        System.out.println("Developer started coding...");

        computer.compile();

    }

}