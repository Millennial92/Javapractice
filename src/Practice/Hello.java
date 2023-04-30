package Practice;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.*;

public class Hello {
    public Hello (String h) {
    }

    public Hello() {

    }
    void nonStaticMethod() {
        System.out.println("nonStaticMethod");
    }
    static void staticMethod() { System.out.println("staticMethod"); }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        System.out.println("Hello World!!");
        Hello hello = new Hello("dfd");
        Logger logger = Logger.getLogger(Hello.class);
        logger.debug("Hello");
        logger.info("this is information");
    }
}
