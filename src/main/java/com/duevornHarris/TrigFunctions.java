package com.duevornHarris;


import java.util.ArrayList;

/**
 * Created by duevornharris on 5/13/16.
 */
public class TrigFunctions {


    public static void sineFunction(ArrayList<Double> input){

        double sinAns = Math.sin(input.get(0));
        System.out.println("The Sine of the number is " + sinAns);

    }

    public static void cosineFunction(ArrayList<Double> input){

        double cosAns = Math.cos(input.get(0));
        System.out.println("The Cosine of the number is " + cosAns);

    }

    public static void tangentFunction(ArrayList<Double> input){

        double tanAns = Math.tan(input.get(0));
        System.out.println("The Tangent of the number is " + tanAns);

    }

    public static void arcSineFunction(ArrayList<Double> input){

        double sinAns = Math.asin(Math.sin(input.get(0)));
        System.out.println("The Sine of the number is " + sinAns);

    }

    public static void arcCosineFunction(ArrayList<Double> input){

        double sinAns = Math.acos(Math.cos(input.get(0)));
        System.out.println("The Sine of the number is " + sinAns);

    }

    public static void arcTangentFunction(ArrayList<Double> input){

        double sinAns = Math.atan(Math.tan(input.get(0)));
        System.out.println("The Sine of the number is " + sinAns);

    }

}
