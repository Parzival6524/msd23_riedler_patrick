package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    static Calculator calc;
    static double a = 3;
    static double b = 0;
    static double c = -1;
    static double should;
    static double should2;
    static double should3;
    static double should4;
    static double should5;
    static double should6;
    static double should7;
    static double is;
    static double is2;
    static double is3;
    static double is4;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    @BeforeAll
    static void test() {
        should = a + b;
        should2 = a - b;
        should3 = a * b;
        should4 = a / b;
        should5 = 6;
        should6 = 120;
        should7 = 0;
    }

    @Test
    void testAdd() {
        is = calc.add(a,b);
        Assertions.assertEquals(should,is);
    }

    @Test
    void testSubstract() {
        is2 = calc.minus(a,b);
        Assertions.assertEquals(should2,is2);
    }

    @Test
    void testMultiply() {
        is3 = calc.multiply(a,b);
        Assertions.assertEquals(should3,is3);
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> {
            is4 = calc.divide(a,b);
        });
        Assertions.assertEquals(should4,is4);
    }

    @Test
    void testFactorial1() {
        Assertions.assertEquals(should5,testFactorial(a));
    }

    @Test
    void testFactorial2() {
        Assertions.assertEquals(should6,testFactorial(b));
    }

    @Test
    void testFactorial3() {
        Assertions.assertEquals(should7,testFactorial(c));
    }

    public double testFactorial(double a) {
        is = calc.factorial(a);
        return is;
    }
}
