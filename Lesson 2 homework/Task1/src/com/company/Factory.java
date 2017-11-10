package com.company;

public class Factory {
    public Armor getArmor(String param, int cost, int weight, String material) throws IncorrectElException{
        Armor armor = null;
        switch (param){
            case "Helmet":
                armor = new Helmets(cost,weight,material);
                break;
            case "Boots":
                armor = new Boots(cost,weight,material);
                break;
            case "Body":
                armor = new Bodyarmor(cost,weight,material);
                break;
            default:
                throw  new IncorrectElException();
        }
        return armor;
    }
}
