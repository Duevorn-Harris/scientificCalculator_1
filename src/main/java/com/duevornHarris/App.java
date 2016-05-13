package com.duevornHarris;

/**
 * Created by duevornharris on 5/1/16.
 */
public class App {

    public static void main(String[] args) {

        Display newDisplay = new Display();
        Memory newMemory = new Memory();
        SwitchDisplayMode newSwitchDisplayMode = new SwitchDisplayMode();

        newDisplay.getInitialState();
        SelectMode.chooseCalculatorMode();
        newSwitchDisplayMode.switchDisplayMode();
        newMemory.memoryChoices();

    }
}







