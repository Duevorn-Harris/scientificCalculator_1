package com.duevornHarris;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by duevornharris on 5/13/16.
 */
public class Memory {

    ArrayList<Double> savedNumber = new ArrayList<Double>();

    public void storeDisplayInMemory(double answer){
        savedNumber.add(answer);
        System.out.println("The number " + savedNumber + " has been stored in memory.");
    }

    public void getNumberInDisplay(){
        System.out.println("The number in memory is " + savedNumber);
    }

    public void memoryChoices() {

        System.out.println("Please use M to store a number in memory, MC to reset memory and MRC to recall number from " +
                "memory.");
        Scanner readSelection = new Scanner(System.in);
        MemoryFunctions memorySelection = MemoryFunctions.valueOf(readSelection.next().toUpperCase());

        switch (memorySelection) {

            case M:
                storeDisplayInMemory(Calculator.memory);
                break;

            case MC:
                Calculator.resetMemory();;
                break;

            case MRC:
                getNumberInDisplay();
                break;

            default:
                System.out.println("Please make valid selection.");




        }
    }
}

