package com.company;

import com.company.Armor;

public class Helmets extends Armor {

    Helmets(int cost, int weight, String material){

    super(cost, weight, material);
    }

    Helmets(){
        super(-1,-1,null);
    };

    public String getType(){
        return "Helmet";
    }

}
