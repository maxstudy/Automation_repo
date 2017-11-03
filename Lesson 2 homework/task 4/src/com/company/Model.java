package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Model {

//ArrayList methods
   public long initialization(ArrayList<Integer> array){
     int[] arr = new int[10000000];
       for (int i = 0; i < 10000000; i++){
           arr[i] =  ThreadLocalRandom.current().nextInt(0,  9);
       }
       long start_time = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            array.add(arr[i]);
        }
        long end_time = System.currentTimeMillis();
        long diff = end_time - start_time;

        return  diff;
    }


    public  long bulk_add(ArrayList<Integer> array){

       int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++){
           arr[i] = ThreadLocalRandom.current().nextInt(0, 9);
        }

        int add_rand_startpoint = ThreadLocalRandom.current().nextInt(0, 10000000);

       long start_time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            array.add(5000000, arr[i]);
        }
        long end_time = System.currentTimeMillis();

            long diff = end_time - start_time;

       return diff;
    }

    public long bulk_remove(ArrayList<Integer> array){
        long start_time = System.currentTimeMillis();
        int add_rand_rep_startpoint = ThreadLocalRandom.current().nextInt(0, 10000000);
        for (int i = 0; i< 1000; i++){
            array.remove(add_rand_rep_startpoint+i);
        }
        long end_time = System.currentTimeMillis();

        long diff = end_time - start_time;
        return diff;
    }


    public long search(ArrayList<Integer> array){

        int k = 0;
        int iter = 0;
        int search_element = ThreadLocalRandom.current().nextInt(0, 9);
        long start_time = System.currentTimeMillis();
        while(k < 1000 || iter < 10000000){
            if (array.get(iter) == search_element){
                k++;
            }
            iter++;
        }

        long end_time = System.currentTimeMillis();

        long diff = end_time - start_time;
        return diff;

    }



    public long display_search(ArrayList<Integer> arrlist){
        int startpoint = ThreadLocalRandom.current().nextInt(0, 10000000);
        int endpoint = startpoint + 1000;
        long start_time = System.currentTimeMillis();
        while ( startpoint < endpoint){
            int buf = arrlist.get(startpoint);
            startpoint++;
        }
        long end_time = System.currentTimeMillis();

        long diff = end_time - start_time;
        return diff;

    }


//LinkedList methods
    public long initialization(LinkedList<Integer> linklist){
        long start_time = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++){
            int num = ThreadLocalRandom.current().nextInt(0,  9);
            linklist.add(num);
        }
        long end_time = System.currentTimeMillis();

        long diff = end_time - start_time;
        return diff;
    }


    public  long bulk_add(LinkedList<Integer> linklist){
        long start_time = System.currentTimeMillis();
        int add_rand_startpoint = ThreadLocalRandom.current().nextInt(0, 10000000);
        for (int i = 0; i < 1000; i++){
            int element = ThreadLocalRandom.current().nextInt(0, 9);
            linklist.add(add_rand_startpoint+i, element);
        }
        long end_time = System.currentTimeMillis();

        long diff = end_time - start_time;

        return diff;
    }

    public long bulk_remove(LinkedList<Integer> linklist){
        long start_time = System.currentTimeMillis();
        int add_rand_rep_startpoint = ThreadLocalRandom.current().nextInt(0, 10000000);
        for (int i = 0; i< 1000; i++){
            linklist.remove(add_rand_rep_startpoint+i);
        }
        long end_time = System.currentTimeMillis();

        long diff = end_time - start_time;
        return diff;
    }


    public long search(LinkedList<Integer> linklist){

        int k = 0;
        int iter = 0;
        int search_element = ThreadLocalRandom.current().nextInt(0, 9);
        long start_time = System.currentTimeMillis();
        while(k < 1000 || iter < 10000000){
            if (linklist.get(iter) == search_element){
                k++;
            }
            iter++;
        }

        long end_time = System.currentTimeMillis();

        long diff = end_time - start_time;
        return diff;

    }

    public long display_search(LinkedList<Integer> linklist){
        int startpoint = ThreadLocalRandom.current().nextInt(0, 10000000);
        int endpoint = startpoint + 1000;
        long start_time = System.currentTimeMillis();
        while ( startpoint < endpoint){
            int buf = linklist.get(startpoint);
            startpoint++;
        }
        long end_time = System.currentTimeMillis();

        long diff = end_time - start_time;
        return diff;

    }


}
