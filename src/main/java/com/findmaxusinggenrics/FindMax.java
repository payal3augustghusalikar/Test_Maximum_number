package com.findmaxusinggenrics;

public class FindMax<E extends Comparable> {
    E firstValue;
    E secondValue;
    E thirdValue;

    public FindMax(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public <E extends Comparable> E findMaxValue(E firstValue, E secondValue, E thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return  firstValue;
        else if(secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }
}


