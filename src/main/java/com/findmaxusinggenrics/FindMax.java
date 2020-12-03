package com.findmaxusinggenrics;

public class FindMax {
    public static void main(String[] args) {
        System.out.println("***** Welcome to arithmetic number computation ****");
    }

    public Integer findMaxValue(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }

    public Float findMaxValue(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }


    void printMax(Integer max) {
        System.out.println("Maximum from integer = " + max);
    }

    void printMax(Float max) {
        System.out.println("Maximum from float = " + max);
    }
}


