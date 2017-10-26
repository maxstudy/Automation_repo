package com.company;

import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {


        while(true){

            Scanner sc = new Scanner(System.in);
            String first = new String();
            double first_arg = 0;
            double second_arg = 0;
            double result = 0;
            first = sc.next();


            if (first.equals("quit")){
                break;
            }

            try {
               first_arg = Double.parseDouble(first);

            }catch (NumberFormatException exc){
                System.out.println("First arguement is not a number, please, start typing again");
                continue;
            }

            Scanner de = new Scanner(System.in);

            String delimitier = de.next();

            if (delimitier.equals("quit")){
                break;
            }

            if (delimitier.equals("+") || delimitier.equals("-")||delimitier.equals("*") || delimitier.equals("/")){

            }else {
                System.out.println("Delimitier isn't valid, please, start typing again");
                continue;
            }



            Scanner se = new Scanner(System.in);
            String second = new String();
            second = se.next();

            if (second.equals("quit")){
                break;
            }

            try {
                second_arg = Double.parseDouble(second);
            }catch (NumberFormatException exc){
                System.out.println("Second arguement is not a number, please, start typing again");
                continue;
            }


            switch (delimitier){
                case "+":
                    result = first_arg+second_arg;
                    break;
                case "-":
                    result = first_arg-second_arg;
                    break;
                case "*":
                    result = first_arg*second_arg;
                    break;
                case "/":
                    if (second_arg == 0){
                        System.out.println("It is impossible to divide by zero, please, start again");
                        continue;
                    }else{
                    result = first_arg/second_arg;
                    break;
                    }
            }



            System.out.println("Result = " + result);

        }

    }
}
