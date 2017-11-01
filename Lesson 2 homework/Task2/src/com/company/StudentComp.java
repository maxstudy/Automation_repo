package com.company;

import java.util.Comparator;

public class StudentComp implements Comparator<Student> {

    @Override
    public int compare(Student e1, Student e2) {
        if(e1.getAge() < e2.getAge()){
            return 1;
        } else {
            return -1;
        }
    }
}
