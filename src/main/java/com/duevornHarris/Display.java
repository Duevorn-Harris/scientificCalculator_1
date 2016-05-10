package com.duevornHarris;

import java.util.ArrayList;
import java.util.Scanner;
import static com.duevornHarris.Calculator.*;

/**
 * Created by duevornharris on 5/1/16.
 */
public class Display {

    User newUser = new User();
    Calculator newCalculator = new Calculator();
    ArrayList<Double> initialState = new ArrayList<Double>();

    public Display() {
        {
        initialState.set(0, 0.0);
        System.out.println("The current value of the display is " + initialState.get(0));
            initialState.get(0);
        }
    }

    public ArrayList<Double> updateInitialState() {
        ArrayList<Double> updatedInitialState = new ArrayList<Double>();
        updatedInitialState = newUser.calculatorUser();
        return updatedInitialState;
    }

    public void getDisplay() {

        System.out.println(updateInitialState());
    }

    public void clearDisplay() {
        if (!(updateInitialState().get(0) == 0)) {
            updateInitialState().set(0, 0.0);
            System.out.println("You have cleared the display " + updateInitialState().get(0));
        }

    }






}







