package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Insert your row; In example -- To be or not to be");
        Scanner io = new Scanner(System.in);
        String row = io.nextLine();


        Thread first = new ExampleThread();
        Operator obj = new Operator();
        first.start();
    System.out.println(obj.toRevert(row));
  System.out.println(  first.getStackTrace());
    System.out.println(obj.toReplace(row));
    System.out.println(obj.toUpperCase(row));
    System.out.println(obj.toSubstr(row));
    String[] words = obj.toSplit(row);

        for (String e_word:words) {
            System.out.println(e_word);
        }
    }
}
