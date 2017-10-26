package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Insert romb side");
        Scanner sc = new Scanner(System.in);
        int scale = sc.nextInt();
        int height = (scale * 2) - 1;
        int half = Math.round((height / 2));


        for (int i = 0; i < height; i++) {

            for (int k = 0; k < height; k++) {

                if (i <= half) {

                    if (k == half - i || k == half + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }


                } else {
                    if (k == half + i - height + 1 || k == half - i + height - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }
            System.out.println(" ");
        }


    }
}
