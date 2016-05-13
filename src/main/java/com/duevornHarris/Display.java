package com.duevornHarris;

import java.util.ArrayList;


/**
 * Created by duevornharris on 5/1/16.
 */
public class Display {


    ArrayList<Double> initialState = new ArrayList<Double>();

    public Display() {

        initialState.add(0.0);
        System.out.println("The current value of the display is " + initialState.get(0) + "\n");
            initialState.get(0);
        }


        public ArrayList<Double> getInitialState(){
            return this.initialState;
        }





    }














