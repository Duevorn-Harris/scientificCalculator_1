package com.duevornHarris;

import java.util.Scanner;


/**
 * Created by duevornharris on 5/13/16.
 */
public class SelectMode {
    CalculatorFunctions newCalculatorFunctions = new CalculatorFunctions();

    public static void chooseCalculatorMode() {
        System.out.println("Please choose from ArithmeticMode, TrigonometryMode.");
        Scanner selection = new Scanner(System.in);
        Mode modeSelection = Mode.valueOf(selection.next().toUpperCase());

        switch (modeSelection){
            case ARITHMETICMODE:
                CalculatorFunctions.switchCalculatorFunctions();
                break;

            case TRIGONOMETRYMODE:
                ChooseATrigFunction.switchTrigonometryFunctions();
                break;

            default:
                System.out.println("Please choose an appropriate mode.");


        }

        }
}
