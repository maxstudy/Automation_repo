package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Model  {


    public ArrayList<Student> sort(ArrayList<Student> group){

        Collections.sort(group, new StudentComp());
        return group;
    }

    public int avg_age(ArrayList<Student> group){
        int average = 0;
        for (Student el: group) {
            average+=el.getAge();
        }
        return average/group.size();
    }

    public ArrayList<Student> findByFirstChar(char criteria,ArrayList<Student> group){
        ArrayList<Student> subgroup = new ArrayList<Student>();
        for (Student el: group) {
            if (el.getSurname().charAt(0) == criteria){
                subgroup.add(el);
            }

        }

        return subgroup;
    }



}
