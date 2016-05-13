package com.duevornHarris;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by duevornharris on 5/1/16.
 */
public class CalculatorSpec {

    Calculator newCalculator;
    User newUser;
    Display newDisplay;

    @Before
    public void initializeCalculator() {
        newCalculator = new Calculator();
        newUser = new User();
        newDisplay = new Display();
    }

    @Test
    public void addTest() {
        float expectedSum = 10;
        ArrayList<Double> input = new ArrayList<Double>();
        input.add(3.0);
        input.add(4.0);
        input.add(3.0);
        double actualSum = newCalculator.add(input);
        assertEquals("The expected sum is not the same as the actual sum ", expectedSum, actualSum, 0);

    }

    @Test
    public void subtractionTest() {
        float expectedResult = -4;
        ArrayList<Double> input = new ArrayList<Double>();
        input.add(3.0);
        input.add(4.0);
        input.add(3.0);
        double actualResult = newCalculator.subtract(input);
        assertEquals("The expected subtraction does not equal the actual subtraction ", expectedResult, actualResult, 0);
    }

    @Test
    public void multiplicationTest() {
        float expectedResult = 36;
        ArrayList<Double> input = new ArrayList<Double>();
        input.add(3.0);
        input.add(4.0);
        input.add(3.0);
        double actualResult = newCalculator.multiplication(input);
        assertEquals("The expected multiplication does not equal the actual multiplication ", expectedResult, actualResult, 0);
    }
    @Test
    public void divisionTest(){
        float expectedResult = 1;
        ArrayList<Double> input = new ArrayList<Double>();
        input.add(3.0);
        input.add(3.0);
        input.add(1.0);
        double actualResult = newCalculator.division(input);
        assertEquals("The expected division does not equal the actual division ", expectedResult, actualResult, 0);
    }

    @Test
    public void squareTest(){
        double expectedResult = 81;
        ArrayList<Double> input = new ArrayList<Double>();
        input.add(9.0);
        double actualResult = newCalculator.square(input);
        assertEquals("The expected square does not equal the actual square ", expectedResult, actualResult, 0);
    }

    @Test
    public void exponentiationTest() {
        double expectedResult = 9;
        ArrayList<Double> input = new ArrayList<Double>();
        input.add(3.0);
        input.add(2.0);
        double actualResult = newCalculator.exponentiation(input);
        assertEquals("The expected exponentiation does not equal the actual exponentiation ", expectedResult, actualResult, 0);
    }

    @Test
    public void squareRootTest() {
        double expectedResult = 2;
        ArrayList<Double> input = new ArrayList<Double>();
        input.add(4.0);
        double actualResult = newCalculator.squareRoot(input);
        assertEquals("The expected square root does not equal the actual square root ", expectedResult, actualResult, 0);
    }

    @Test
    public void inverseTest(){
        ArrayList<Double> input = new ArrayList<Double>();
        input.add(5.0);
        double expectedResult = (1/(input.get(0)));
        double actualResult = newCalculator.inverse(input);
        assertEquals("The expected inverse does not equal the actual inverted sum ", expectedResult, actualResult, 0);
    }

    @Test
    public void switchSignTest(){
        ArrayList<Double> input = new ArrayList<Double>();
        input.add(-5.0);
        double expectedResult = (5.0);
        double actualResult = newCalculator.switchSign(input);
        assertEquals("The sign of the number was not switched ", expectedResult, actualResult, 0);
    }

    @Test
    public void getInitialStateTest(){
        ArrayList<Double> expectedResult = new ArrayList<Double>();
        expectedResult.add(0.0);
        ArrayList<Double> actualResult = newDisplay.getInitialState();
        assertEquals("The initial display on the calculator is not the same as the expected display result ", expectedResult,
                actualResult);
    }

}

