package com.duevornHarris;

import java.util.ArrayList;

/**
 * Created by duevornharris on 5/1/16.
 */
public class Calculator {
    public static double memory = 0;
    public static void  resetMemory(){ memory = 0;}

    public static double add (ArrayList<Double> input){

        double ans = 0;
        for (double no : input){
            ans += no;
        }
        System.out.println(ans);
        memory = ans;
        return memory;
    }

    public static double subtract (ArrayList<Double> input){

        double ans = input.get(0);
        for (int i = 1; i <  input.size(); i++){
            ans -= input.get(i);
        }
        System.out.println(ans);
        return ans;
    }

    public static double multiplication (ArrayList<Double> input){

        double ans = input.get(0);
        for (int i = 1; i <  input.size(); i++){
            ans *= input.get(i);
        }
        System.out.println(ans);
        return ans;
    }
    public static double division (ArrayList<Double> input) {

        double ans = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            ans /= input.get(i);
        }
        System.out.println(ans);
        return ans;
    }

    public static double square (ArrayList<Double> input){
        double ans = input.get(0);
        if (input.get(0) != 0){
           ans =  (input.get(0)) * (input.get(0));
        }
        else {
            return 0;
        }
        System.out.println(ans);
        return ans;
    }

    public static double exponentiation (ArrayList<Double> input){
        double ans = input.get(0);
        double ans1 = input.get(1);
        double ans3 = Math.pow(ans, ans1);
        return ans3;
    }

    public static double squareroot(ArrayList<Double> input){
        double ans = input.get(0);
        if (input.get(0) != 0){
            ans = Math.sqrt(input.get(0));
        }
        else {
            return 0;
        }
        System.out.println(ans);
        return ans;
    }
}
