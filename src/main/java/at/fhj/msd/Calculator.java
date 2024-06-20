package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2) {
        logger.debug("Called ADD with parameters" + number1 + " + " + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug("Called Minus with parameters" + number1 + " - " + number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        logger.debug("Called DIVIDE with parameters" + number1 + " / " + number2);
        if (number2 == 0) {
            logger.error("Division with 0 impossible");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("Called MULTIPLY with parameters" + number1 + " * " + number2);
        return number1 * number2;
    }

    public long factorial(double a) {
        if (a < 0) {
            return 0;
        } else {
            long result = 1;

            for (int factor = 2; factor <= a; factor++) {
                result *= factor;
            }

            return result;
        }
    }
}

