package com.duevornHarris;

import java.util.Scanner;

import static com.duevornHarris.Calculator.*;
import static com.duevornHarris.User.*;
import static com.duevornHarris.ChoiceSelection.*;

/**
 * Created by duevornharris on 5/10/16.
 */
public class CalculatorFunctions {

        public void switchCalculatorFunctions() {

            System.out.println("Please choose from the list of functions: ADD, SUBTRACT, MULTIPLY, DIVIDE, SQUARE, \n" +
                    "SQUAREROOT, EXPONENTIATE, INVERSE, SWITCHSIGN");
            Scanner readSelection = new Scanner(System.in);
            ChoiceSelection choiceSelection = ChoiceSelection.valueOf(readSelection.next().toUpperCase());
            switch (choiceSelection) {
                case ADD:
                    add(calculatorUser());
                    break;

                case SUBTRACT:
                    subtract(calculatorUser());
                    break;

                case MULTIPLY:
                    multiplication(calculatorUser());
                    break;

                case DIVIDE:
                    division(calculatorUser());
                    break;

                case SQUARE:
                    square(calculatorUser());
                    break;

                case EXPONENTIATE:
                    exponentiation(calculatorUser());

                case SQUAREROOT:
                    squareroot(calculatorUser());

                default:
                    System.out.println("Please choose an appropriate function");

            }
        }
    }


