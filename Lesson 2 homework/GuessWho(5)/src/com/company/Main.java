package com.company;
import java.util.regex.*;
import java.util.Scanner;




public class Main {



     static String replaceCharAt(String s, int pos, char c) {

        return s.substring(0,pos) + c + s.substring(pos+1);

    }


    public static void main(String[] args) {
	System.out.println("Insert name and surname");
        Scanner sc = new Scanner(System.in);
        String layout = "Maxim Pipkin";
        String temp_layout = layout;
        boolean iswin = false;
        Pattern regex = Pattern.compile("[^A-Za-z]");

        String cipher = layout.replaceAll("[A-Za-z]", "*");

        System.out.println(cipher);
        while (iswin == false){
            System.out.println("insert character or word");
            Scanner sc1 = new Scanner(System.in);
            String temp = sc1.nextLine();

            Matcher matcher = regex.matcher(temp);

            if (matcher.find()){
                System.out.println("not a word, please, try again");
                continue;
            }


            if (layout.indexOf(temp) == -1){
                System.out.println("Character or word not found, please try again");
                continue;
            }
            if (cipher.indexOf(temp) != -1){

                System.out.println("You already insert this character or word, please, try again");
                continue;
            }


            while (temp_layout.indexOf(temp) != -1){
                int first_symbol = temp_layout.indexOf(temp);
                for (int i = 0; i < temp.length(); i++){


                    cipher = replaceCharAt(cipher, first_symbol+i, temp.charAt(i));
                    temp_layout = replaceCharAt(temp_layout, first_symbol+i, '*');
                }
            }

            if (cipher.equals(layout)){

                iswin = true;
                System.out.println("You win");
            }

            System.out.println(cipher);
            temp_layout = "Maxim Pipkin";
        }


        // write your code here
    }
}
