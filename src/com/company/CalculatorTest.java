package com.company;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest { //Calculator class is the source code

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calculatorUnderTest = new Calculator(); //Create object
        double actual = calculatorUnderTest.add(2,4); //Call method
        double expected = 6; //What your answer should be
        assertEquals(expected,actual);
    }

   /* @org.junit.jupiter.api.Test (expected = ArithmeticException.class)
    void divideByZero() {
        Calculator calculatorUnderTest = new Calculator();
        //assertEquals(3,calculatorUnderTest.divide(6,2));
        calculatorUnderTest.divide(8,0);
    } */

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calculatorUnderTest = new Calculator(); //Create object
        assertEquals(3,calculatorUnderTest.divide(6,2)); //Shorthand way of problem

    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calculatorUnderTest = new Calculator(); //Create object
        assertEquals(4, calculatorUnderTest.subtract(10,6)); //Assertion is important
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        Calculator calculatorUnderTest = new Calculator(); //Create object
        assertEquals(64,calculatorUnderTest.multiplication(8,8));
    }
}

/*
Proper test should say passed
Main method
J Unit version constantly changing
 */