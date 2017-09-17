package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {

        String names[] = {"Ivan", "Maksim", "Oleg", "Viktor", "Dmitry", "Valentin", "Igor", "Alexander", "Gleb", "Mikhail", "Semion", "Grigory"};
        String lastnames[] = {"Ivanov", "Petrov", "Sidorov", "Orlov", "Romanov", "Lavochkin", "Merkushev", "Nekrasov", "Zuev", "Kazakov", "Archipov", "Kondratyev", "Shiriaev"};

        int marks[] = new int[5];
        float avg_mark = 0;
        ArrayList<Student> students = new ArrayList<Student>();

        System.out.println("Exam results");

        for (int i = 0; i < 5; i++){
            Student temp_object = new Student();
            int name_num = ThreadLocalRandom.current().nextInt(0,  11);
            int lastname_num = ThreadLocalRandom.current().nextInt(0, 12);
            temp_object.setName(names[name_num]);
            temp_object.setLastname(lastnames[lastname_num]);
            students.add(temp_object);
            int rand_mark = ThreadLocalRandom.current().nextInt(1, 5 );
            marks[i] = rand_mark;
            avg_mark+=rand_mark;
            System.out.println("Student #" + (i+1) + " " + students.get(i).getLastname() + " " + students.get(i).getName() + " -- " + marks[i]);
        }
        avg_mark= avg_mark/5;

        System.out.println("Average mark -- " + avg_mark);

    }
}
