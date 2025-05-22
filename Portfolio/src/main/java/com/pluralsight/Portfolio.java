package com.pluralsight;

import com.pluralsight.interfaces.IValuable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfolio {
    String name;
    String owner;
    List<IValuable> assets = new ArrayList<IValuable>();

    public void add(IValuable asset){
        assets.add(asset);
    }

    public double getValue(){
        //loop through assets and get sum of value
        double totalValue = 0;

        for (IValuable a:assets){
            totalValue += a.getValue();
        }

        return totalValue;
    }

    public IValuable getMostValuable(){
        //find highest getvalue in assets list
        Collections.sort(assets);
        System.out.println(assets.get(assets.size() - 1).getValue());
        return assets.get(assets.size() - 1);
    }

    public IValuable getLeastValuable(){
        //find lowest getvalue in assets list
        Collections.sort(assets);
        System.out.println(assets.get(0).getValue());
        return assets.get(0);
    }


}