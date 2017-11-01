package com.company;

import javax.swing.text.Style;

public class Student  implements Comparable<Student> {

    private int student_id;

    private String name;

    private String lastname;

    private int ticket_id;


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }



    public int compareTo(Student student) {
        //write code here for compare name
    }
}
