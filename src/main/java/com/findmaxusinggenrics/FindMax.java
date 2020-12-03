package com.findmaxusinggenrics;

public class FindMax {
    public static void main(String[] args) {
        System.out.println("***** Welcome to arithmetic number computation ****");
    }

    /* Generic Method to Find the Max Value of passed Arguments*/

    public <E extends Comparable> E findMaxValue(E firstValue, E secondValue, E thirdValue) {
       E max = firstValue;
        if (secondValue.compareTo(max) > 0) {
            max = secondValue; }

        if (thirdValue.compareTo(max) > 0) {
            max = thirdValue;
        }
        printMax(max);
        return max;
    }

    public <E> void printMax(E max) {
        System.out.println("Max Value = " + max);
    }
}




   /* public <E extends Comparable> E findMaxValue(E firstValue, E secondValue, E thirdValue){
        E max = firstValue;
        if (secondValue.compareTo(max) > 0) {
            max = secondValue;
        }
        if (thirdValue.compareTo(max) > 0) {
            max = thirdValue;
        }
        printMax(max);
        return max;
    }

    public <E> void printMax(E max){
        System.out.println("Max Value = "+max);
    }*/



