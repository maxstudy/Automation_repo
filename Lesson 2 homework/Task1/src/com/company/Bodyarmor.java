package com.company;

import com.company.Armor;

public class Bodyarmor extends Armor {

    Bodyarmor(int cost, int weight, String material){

        super(cost, weight, material);
    }

    Bodyarmor(){
        super(-1,-1,null);
    };

    public String getType(){
        return "Body";
    }


}
