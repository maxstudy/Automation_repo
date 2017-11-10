package com.company;

import com.company.Armor;

public class Boots extends Armor {

    Boots(int cost, int weight, String material){

        super(cost, weight, material);
    }

    Boots(){
        super(-1,-1,null);
    };

    public String getType(){
        return "Boots";
    }


}
