package com.company;
import sun.util.resources.cldr.kea.TimeZoneNames_kea;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {
        //Arrays with values for entities random generation
        String names[] = {"Ivan", "Maksim", "Oleg", "Viktor", "Dmitry", "Valentin", "Igor", "Alexander", "Gleb", "Mikhail", "Semion", "Grigory"};
        String lastnames[] = {"Ivanov", "Petrov", "Sidorov", "Orlov", "Romanov", "Lavochkin", "Merkushev", "Nekrasov", "Zuev", "Kazakov", "Archipov", "Kondratyev", "Shiriaev"};
        String Questions[] = {"Q1","Q2","Q3","Q4","Q5","Q6","Q7","Q8","Q9", "Q10"};

        int marks[] = new int[5];
        float avg_mark = 0;

        //Students and tickets collections
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        System.out.println("Exam results");

        //Tickets generates randomly
        for (int k = 0; k <10; k++){
            Ticket temp_ticket = new Ticket();
            temp_ticket.setId(k);
            int question_num = ThreadLocalRandom.current().nextInt(0,  9);
            temp_ticket.setQuestion(Questions[question_num]);
            tickets.add(temp_ticket);
        }

        for (int i = 0; i < 5; i++){
            //Student generation
            Student temp_object = new Student();
            int name_num = ThreadLocalRandom.current().nextInt(0,  11);
            int lastname_num = ThreadLocalRandom.current().nextInt(0, 12);
            int ticket_num = ThreadLocalRandom.current().nextInt(0,  9);
            temp_object.setName(names[name_num]);
            temp_object.setLastname(lastnames[lastname_num]);
            temp_object.setTicket_id(ticket_num);
            //Collection pushing
            students.add(temp_object);
            int rand_mark = ThreadLocalRandom.current().nextInt(1, 5 );
            marks[i] = rand_mark;
            avg_mark+=rand_mark;

            //Output. It can be replaced to another cycle, but i think it isn't necessary

            System.out.println("Student #" + (i+1)
                                + " "
                                + students.get(i).getLastname()
                                + " "
                                + students.get(i).getName()
                                + ", Ticket # "
                                + (students.get(i).getTicket_id()+1)
                                + " Question "
                                + tickets.get(students.get(i).getTicket_id()).getQuestion()
                                + " -- "
                                + marks[i]);


        }
        avg_mark= avg_mark/5;

        System.out.println("Average mark -- " + avg_mark);

    }
}
