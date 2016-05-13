package com.duevornHarris;


import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by duevornharris on 5/1/16.
 */
public class User {

    public static ArrayList<Double> input = new ArrayList<Double>();
    public static Scanner userInput = new Scanner(System.in);

    public static ArrayList<Double> calculatorUser() {

        System.out.println("Enter the desired numbers for calculation one at a time.");
        while ( userInput.hasNextDouble() ) {
            System.out.println("Enter a number, else enter the word \"done\".");
            input.add(userInput.nextDouble());
            }
        return input;
        }
}

