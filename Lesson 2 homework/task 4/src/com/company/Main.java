package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
//ARRLIST INIT
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        LinkedList<Integer> linlist = new LinkedList<Integer>();
       Model obj = new Model();
       long arr_create_time = obj.initialization(arrlist);
        System.out.println("ArrayList creation time(milliseconds) - " + arr_create_time);

//_______________________________ADD____________________________________

            long arr_add_time = obj.bulk_add(arrlist);
        System.out.println("ArrayList insertion time - " + arr_add_time);

//______________________________remove_____________________________________
            long arr_remove_time = obj.bulk_remove(arrlist);
        System.out.println("ArrayList removing time - " + arr_remove_time);

        long arr_search_time = obj.search(arrlist);
        System.out.println("ArrayList search time - " + arr_search_time);





        System.out.println("LinkedList creation time(milliseconds) - "+ obj.initialization(linlist));
        // write your code here

        long lin_add_time = obj.bulk_add(linlist);
        System.out.println("LinkedList  insertion time - " + lin_add_time);

//______________________________remove_____________________________________
        long lin_remove_time = obj.bulk_remove(linlist);
        System.out.println("LinkedList  removing time - " + lin_remove_time);

        long lin_search_time = obj.search(linlist);
        System.out.println("LinkedList  search time - " + lin_search_time);


    }
}
