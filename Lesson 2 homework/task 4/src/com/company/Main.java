package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        LinkedList<Integer> linlist = new LinkedList<Integer>();
       Model obj = new Model();
       long arr_create_time = obj.initialization(arrlist);
        System.out.println("ArrayList creation time(milliseconds) - " + arr_create_time);

            long arr_add_time = obj.bulk_add(arrlist);
        System.out.println("ArrayList insertion time - " + arr_add_time);

            long arr_remove_time = obj.bulk_remove(arrlist);
        System.out.println("ArrayList removing time - " + arr_remove_time);

        long arr_search_time = obj.display_search(arrlist);
        System.out.println("ArrayList search time - " + arr_search_time);




        long lin_create_time = obj.initialization(linlist);
        System.out.println("LinkedList creation time(milliseconds) - "+ lin_create_time);

        long lin_add_time = obj.bulk_add(linlist);
        System.out.println("LinkedList  insertion time - " + lin_add_time);

        long lin_remove_time = obj.bulk_remove(linlist);
        System.out.println("LinkedList  removing time - " + lin_remove_time);

        long lin_search_time = obj.display_search(linlist);
        System.out.println("LinkedList  search time - " + lin_search_time);

        if (arr_create_time<lin_create_time){
            System.out.println("ArrayList creation faster than LinkedList on " + (lin_create_time - arr_create_time) + " milliseconds");
        } else {
            System.out.println("LinkedList creation faster than ArrayList on " + (arr_create_time - lin_create_time) + " milliseconds");

        }


        if (arr_add_time<lin_add_time){
            System.out.println("ArrayList addition faster than LinkedList on " + (lin_add_time - arr_add_time) + " milliseconds");
        } else {
            System.out.println("LinkedList addition faster than ArrayList on " + (arr_add_time - lin_add_time) + " milliseconds");

        }



        if (arr_remove_time<lin_remove_time){
            System.out.println("ArrayList remove faster than LinkedList on " + (lin_remove_time - arr_remove_time) + " milliseconds");
        } else {
            System.out.println("LinkedList remove faster than ArrayList on " + (arr_remove_time - lin_remove_time) + " milliseconds");

        }


        if (arr_search_time<lin_search_time){
            System.out.println("ArrayList search faster than LinkedList on " + (lin_search_time - arr_search_time) + " milliseconds");
        } else {
            System.out.println("LinkedList search faster than ArrayList on " + (arr_search_time - lin_search_time) + " milliseconds");

        }

    }
}
