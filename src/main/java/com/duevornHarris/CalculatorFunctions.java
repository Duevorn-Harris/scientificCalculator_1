package com.duevornHarris;

import java.util.Scanner;

import static com.duevornHarris.Calculator.*;
import static com.duevornHarris.User.*;

/**
 * Created by duevornharris on 5/10/16.
 */
public class CalculatorFunctions {

    public static void switchCalculatorFunctions() {

        System.out.println("Please choose from the list of functions: ADD, SUBTRACT, MULTIPLY, DIVIDE, SQUARE, \n" +
                    "SQUAREROOT, EXPONENTIATE, INVERSE, SWITCHSIGN, INVERSELOG, LN, INVNATURALLOG");
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
                    break;
                case SQUAREROOT:
                    squareRoot(calculatorUser());
                    break;
                case INVERSE:
                    inverse(calculatorUser());
                    break;
                case SWITCHSIGN:
                    switchSign(calculatorUser());
                    break;
                case LN:
                    naturalLog(calculatorUser());
                    break;
                case INVERSELOG:
                    antiLog(calculatorUser());
                    break;
                case INVNATURALLOG:
                    inverseNaturalLog(calculatorUser());
                    break;

                default:
                    System.out.println("Please choose an appropriate function");

            }
        }
    }



