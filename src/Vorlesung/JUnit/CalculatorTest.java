package Vorlesung.JUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Value 50 must be at index 2")
    void testInsertValuesInArray_correct(){
        calculator.insertValueInIndexOfArray(50, 2);
        assertEquals(50, calculator.array[2]);
    }

    @Test
    @DisplayName("Value 50 must not be at index 2")
    void testInsertValuesInArray_false(){
        calculator.insertValueInIndexOfArray(50, 3);
        assertNotEquals(50, calculator.array[2]);
    }

    @Test
    @DisplayName("Value -1 must not be at index 0")
    void testInsertValuesInArray_extra(){
        calculator.insertValueInIndexOfArray(50, 100);
        assertEquals(-1, calculator.array[0]);
    }

    @Test
    @DisplayName("Value -1 must not be at index 0")
    void testInsertValuesInArray_extra2(){
        calculator.insertValueInIndexOfArray(50, -100);
        assertEquals(-1, calculator.array[0]);
    }

    @Test
    @DisplayName("add should return 4")
    void addPositive() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("add should return -5")
    void addNegative() {
        assertEquals(-5, calculator.add(-3, -2));
    }

    @Test
    @DisplayName("add should return 8")
    void addNegativeAndPositive() {
        assertEquals(8, calculator.add(-2, 10));
    }

    @Test
    @DisplayName("add should return 1")
    void addNegativeWithZero() {
        assertEquals(1, calculator.add(1, 0));
    }
}