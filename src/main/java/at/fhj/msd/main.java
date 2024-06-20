package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3.5));
        System.out.println(calculator.minus(5, 3.5));
        System.out.println(calculator.divide(5, 3.5));
        System.out.println(calculator.multiply(5, 3.5));
        System.out.println("Patrick Riedler");

        logger.info("INFO");
        logger.error("ERROR");
    }
}
