package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner io = new Scanner(System.in);
        String row = io.nextLine();

        Operator obj = new Operator();
    System.out.println(obj.toRevert(row));
    System.out.println(obj.toReplace(row));
    System.out.println(obj.toUpperCase(row));
    System.out.println(obj.toSubstr(row));
    String[] words = obj.toSplit(row);

        for (String e_word:words) {
            System.out.println(e_word);
        }
    }
}
