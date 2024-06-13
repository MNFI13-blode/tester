/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


/**
 *
 * @author A S U S
 */
package tp.mkpl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MKPLTest {

    public MKPLTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAddition() {
        double num1 = 5.0;
        double num2 = 3.0;
        char operator = '+';
        double expected = 8.0;
        double result = calculate(num1, num2, operator);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        double num1 = 5.0;
        double num2 = 3.0;
        char operator = '-';
        double expected = 2.0;
        double result = calculate(num1, num2, operator);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        double num1 = 5.0;
        double num2 = 3.0;
        char operator = '*';
        double expected = 15.0;
        double result = calculate(num1, num2, operator);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testDivision() {
        double num1 = 6.0;
        double num2 = 3.0;
        char operator = '/';
        double expected = 2.0;
        double result = calculate(num1, num2, operator);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        double num1 = 6.0;
        double num2 = 0.0;
        char operator = '/';
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculate(num1, num2, operator);
        });
        assertEquals("Error! Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    public void testInvalidOperator() {
        double num1 = 6.0;
        double num2 = 3.0;
        char operator = '%';
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculate(num1, num2, operator);
        });
        assertEquals("Invalid operator!", exception.getMessage());
    }

    // Helper method to simulate the calculation logic in the main class
    private double calculate(double num1, double num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new IllegalArgumentException("Error! Division by zero is not allowed.");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator!");
        }
        return result;
    }
}
