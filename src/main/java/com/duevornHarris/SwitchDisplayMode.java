package com.duevornHarris;
import java.util.Scanner;
/**
 * Created by duevornharris on 5/10/16.
 */
public class SwitchDisplayMode {

    public void convertToBinary(double answer){
        int new_answer = (int) answer;
        String binary;
        binary = Integer.toBinaryString(new_answer);
        System.out.println("The converted number is " + binary);
        }

    public void convertToOctal(double answer){
        int new_answer = (int) answer;
        String octal;
        octal = Integer.toOctalString(new_answer);
        System.out.println("The converted number is " + octal);    }

    public void convertToHexadecimal(double answer){
        int new_answer = (int) answer;
        String hex;
        hex = Integer.toHexString(new_answer);
        System.out.println("The converted number is 0x" + hex);    }


    public void switchDisplayMode(){

        System.out.println("Please choose a display mode, BINARY, OCTAL, HEXADECIMAL, DECIMAL.");
        Scanner displayChoice = new Scanner(System.in);
        DisplayMode displayMode = DisplayMode.valueOf(displayChoice.next().toUpperCase());

        switch(displayMode){
            case BINARY:
                convertToBinary(Calculator.memory);
                break;

            case OCTAL:
                convertToOctal(Calculator.memory);
                break;

            case HEXADECIMAL:
                convertToHexadecimal(Calculator.memory);
                break;

            case DECIMAL:
                System.out.println("The number is already being displayed in decimal form.");
                break;

            default:
                System.out.println("Please choose an appropriate display feature.");
        }
    }

}
