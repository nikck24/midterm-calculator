package com.midterm;


public class Calculator {
    private int value1;
    private int value2;

    public Calculator() {
    }

    public Calculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

  
    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

 
    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int add() {
        return value1 + value2;
    }

    public int subtract() {
        return value1 - value2;
    }


    public static boolean isEven(int number) {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("Number must be between 1 and 100");
        }
        return number % 2 == 0;
    }
}
