package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String names[] = {"Ivan", "Maksim", "Oleg", "Viktor", "Dmitry", "Valentin", "Igor", "Alexander", "Gleb", "Mikhail", "Semion", "Grigory"};
        String lastnames[] = {"Ivanov", "Petrov", "Sidorov", "Orlov", "Romanov", "Lavochkin", "Merkushev", "Nekrasov", "Zuev", "Kazakov", "Archipov", "Kondratyev", "Shiriaev"};

        ArrayList<Student> group = new ArrayList<Student>();


        for (int i = 0; i < 10; i++) {
            //Student generation
            Student temp_object = new Student();
            int name_num = ThreadLocalRandom.current().nextInt(0, 11);
            int lastname_num = ThreadLocalRandom.current().nextInt(0, 12);
            int age_num = ThreadLocalRandom.current().nextInt(17, 27);
            temp_object.setName(names[name_num]);
            temp_object.setSurname(lastnames[lastname_num]);
            temp_object.setAge(age_num);
            temp_object.setId(i);
            //Collection pushing
            group.add(temp_object);
        }

        Model obj = new Model();
        obj.sort(group);

        System.out.println("List of students(sorted by age):");
        for(Student el: group){
            System.out.println("id " + el.getId() + " "+ el.getSurname()+ " " +el.getName()+ ", age " + el.getAge());
        }

        System.out.println("average age = " + obj.avg_age(group));

        System.out.println("Please, insert search criteria(first character at surname)");
        Scanner sc = new Scanner(System.in);
        char criteria = sc.nextLine().charAt(0);
        ArrayList<Student> found = new ArrayList<Student>();
        found = obj.findByFirstChar(criteria, group);
        System.out.println("Look what I found");
        for(Student el: found){
            System.out.println("id " + el.getId() + " "+ el.getSurname()+ " " +el.getName()+ ", age " + el.getAge());
        }


    }
}
