package com.pluralsight.finance;

import com.pluralsight.interfaces.IValuable;

public abstract class FixedAsset implements IValuable {
    private String name;
    private double marketValue;

    //constructor
    public FixedAsset(String name, double value){

    }

    @Override
    public double getValue() {
        return this.marketValue;
    }
}
