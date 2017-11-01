package com.company;

public class StudentComp implements Comparator<Student> {

    public int compare(Student e1, Student e2) {
        if(e1.getSalary() < e2.getAge()){
            return 1;
        } else {
            return -1;
        }
    }

}
