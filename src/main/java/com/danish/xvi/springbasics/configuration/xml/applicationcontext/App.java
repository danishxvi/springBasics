package com.danish.xvi.springbasics.configuration.xml.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		/*
		 * ================================================================
		 * STEP 1 - CREATE THE SPRING IoC CONTAINER
		 * ================================================================
		 *
		 * ClassPathXmlApplicationContext is one of Spring's implementations
		 * of the ApplicationContext interface.
		 *
		 * The moment this line executes, Spring performs the following tasks:
		 *
		 * 1. Reads the XML configuration file (applicationContext.xml)
		 *    from the project's classpath.
		 *
		 * 2. Parses every <bean> definition present in the XML.
		 *
		 * 3. Creates the Spring IoC (Inversion of Control) Container.
		 *
		 * 4. By default, every bean having singleton scope is INSTANTIATED
		 *    immediately (eager initialization).
		 *
		 * 5. Spring calls the constructor of each singleton bean.
		 *
		 * 6. Spring performs Dependency Injection (constructor, setter,
		 *    or field injection depending on the configuration).
		 *
		 * 7. The fully initialized bean objects are stored inside the
		 *    IoC container, waiting to be requested.
		 *
		 * IMPORTANT:
		 * The Developer object is NOT created when getBean() is called.
		 * It is already created during this line (provided it is a
		 * singleton bean, which is Spring's default scope).
		 *
		 * To verify this:
		 * Add a constructor inside the Developer class like:
		 *
		 * public Developer() {
		 *     System.out.println("Developer object created");
		 * }
		 *
		 * You will notice that this message appears immediately after
		 * the following line executes, even before getBean() is called.
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("configurationXmlApplicationContext.xml");

		/*
		 * ================================================================
		 * STEP 2 - REQUEST THE BEAN FROM THE CONTAINER
		 * ================================================================
		 *
		 * getBean("developer") does NOT create a new object (for singleton
		 * beans).
		 *
		 * Instead, Spring simply searches its internal IoC container for
		 * the bean whose id is "developer" and returns the already existing
		 * object reference.
		 *
		 * Since getBean() returns Object, we explicitly cast it to
		 * Developer.
		 *
		 * If the bean scope were "prototype", Spring would create a new
		 * object every time getBean() is called.
		 */

		Developer dev = (Developer) context.getBean("developer");

		/*
		 * ================================================================
		 * STEP 3 - USE THE SPRING-MANAGED OBJECT
		 * ================================================================
		 *
		 * The object stored in 'dev' was not created using the 'new'
		 * keyword by our code.
		 *
		 * Instead, Spring created, configured, initialized, and managed
		 * the object. We simply request it from the container and use it.
		 */

		dev.coding();

		/*
		 * ================================================================
		 * STEP 4 - CLOSE THE CONTAINER
		 * ================================================================
		 *
		 * Closing the ApplicationContext releases resources held by the
		 * container.
		 *
		 * Spring also invokes bean destruction callbacks (such as methods
		 * specified using destroy-method or @PreDestroy) for singleton
		 * beans before shutting down the container.
		 */

		((ClassPathXmlApplicationContext) context).close();
	}
}