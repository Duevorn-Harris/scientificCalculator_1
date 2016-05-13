package com.duevornHarris;

import java.util.Scanner;

/**
 * Created by duevornharris on 5/13/16.
 */
public class ChooseATrigFunction {

    public static void switchTrigonometryFunctions() {
        System.out.println("Please choose which Trigonometry function you would like to perform, SINE, COSINE, TANGENT, " +
                "ARCSINE, ARCCOSINE, ARCTANGENT");
        Scanner selection = new Scanner(System.in);
        TrigonometryFunctions trigSelection = TrigonometryFunctions.valueOf(selection.next().toUpperCase());

        switch (trigSelection) {

            case SINE:
                TrigFunctions.sineFunction(User.calculatorUser());
                break;

            case COSINE:
                TrigFunctions.cosineFunction(User.calculatorUser());

            case TANGENT:
                TrigFunctions.tangentFunction(User.calculatorUser());

            case ARCSINE:
                TrigFunctions.arcSineFunction(User.calculatorUser());

            case ARCCOSINE:
                TrigFunctions.arcCosineFunction(User.calculatorUser());

            case ARCTANGENT:
                TrigFunctions.arcTangentFunction(User.calculatorUser());

            default:
                System.out.println("Please choose an appropriate function.");

        }
    }
}

