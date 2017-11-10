package com.company;
import java.util.*;

public abstract class Armor implements Comparable<Armor> {

    final public int cost;
    final public int weight;
    final public String material;

    public Armor(int cost, int weight, String material){
        this.cost = cost;
        this.material = material;
        this.weight = weight;
    }

    abstract String getType();


    //компаратор
    public int compareTo(Armor o) {
        if (o.cost > this.cost) return -1;
        if (o.cost < this.cost) return 1;
        return 0;
    }


    //фильтр сортировки
    public static List<Armor> filter(List<Armor> list, float min, float max) {
        List<Armor> result = new ArrayList<>();
        for (Armor arr : list) {
            if (arr.cost >= min && arr.cost <= max) result.add(arr);
        }
        return result;
    }


}
