package com.duevornHarris;

import java.util.ArrayList;


/**
 * Created by duevornharris on 5/1/16.
 */
public class Calculator {
    public static double memory = 0;
    public static void  resetMemory(){
        memory = 0;
        System.out.println("The memory has been set to the value " + memory + ".");
    }
    public static double ans = 0;

    public static double add (ArrayList<Double> input){

        for (double no : input){
            ans += no;
        }
        System.out.println(ans);
        memory = ans;
        return memory;
    }

    public static double subtract (ArrayList<Double> input){
        double subtractionAns = input.get(0);{
        for (int i = 1; i < input.size(); i++)
        subtractionAns -= input.get(i);}
        System.out.println(subtractionAns);
        memory = subtractionAns;
        return memory;
    }

    public static double multiplication (ArrayList<Double> input) {

        double multiplicationAns = input.get(0);
        {
            for (int i = 1; i < input.size(); i++) {
                multiplicationAns *= input.get(i);
            }
            System.out.println(multiplicationAns);
            memory = multiplicationAns;
            return memory;
        }
    }

    public static double division (ArrayList<Double> input) {

        double divisionAns = input.get(0);
        {
            for (int i = 1; i < input.size(); i++) {
                divisionAns /= input.get(i);
            }
            System.out.println(divisionAns);
            memory = divisionAns;
            return memory;
        }
    }

    public static double square (ArrayList<Double> input){
        if (input.get(0) != 0){
           ans =  (input.get(0)) * (input.get(0));
        }
        else {
            return 0;
        }
        System.out.println(ans);
        memory = ans;
        return memory;
    }

    public static double exponentiation (ArrayList<Double> input){
        double ans = input.get(0);
        double ans1 = input.get(1);
        double ans3 = Math.pow(ans, ans1);
        memory = ans3;
        return memory;
    }

    public static double squareRoot(ArrayList<Double> input){
        if (input.get(0) != 0){
            ans = Math.sqrt(input.get(0));
        }
        else {
            return 0;
        }
        System.out.println(ans);
        memory = ans;
        return memory;
    }

    public static double inverse(ArrayList<Double> input){
        if (input.get(0) != 0){
            ans = (1/input.get(0));
        }
        else {
            return 0;
        }
        System.out.println(ans);
        memory = ans;
        return memory;
    }

    public static double switchSign(ArrayList<Double> input){
        if (input.get(0) != 0) {
            ans = (input.get(0) * -1);
        }
        else {
        return 0;
        }
        System.out.println(ans);
        memory = ans;
        return memory;
    }

    public static double naturalLog(ArrayList<Double> input){
       ans =  Math.log(input.get(0));

        System.out.println(ans);
        memory = ans;
        return memory;

    }

    public static double antiLog(ArrayList<Double> input){
        ans =  Math.pow(Math.E, (Math.log(input.get(0))));

        System.out.println(ans);
        memory = ans;
        return memory;

    }

    public static double inverseNaturalLog(ArrayList<Double> input){
        ans =  -Math.log(input.get(0));

        System.out.println(ans);
        memory = ans;
        return memory;

    }

}
