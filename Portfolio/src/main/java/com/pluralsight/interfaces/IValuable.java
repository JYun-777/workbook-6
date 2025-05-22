package com.pluralsight.interfaces;

public interface IValuable extends Comparable<IValuable>{
    double getValue();

    @Override
    default int compareTo(IValuable other){
        return Double.compare(this.getValue(), other.getValue());
    }
}
