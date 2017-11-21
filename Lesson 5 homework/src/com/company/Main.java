package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        while (true){
            Operations ops = new Operations();
            String input;
            Element first_element = new Element();
            Element second_element = new Element();
            Element sign = new Element();


            Scanner sc = new Scanner(System.in);
            input = sc.next();


            try {
                first_element = ops.validateElement(input, "element");
            }catch (IncorrectElException e){
                System.out.println("First arguement is not a number, please, start typing again");
                continue;
            }catch (QuitException e){
                break;
            }

            input = sc.next();

            try {
                sign = ops.validateElement(input, "sign");
            }catch (IncorrectElException e){
                System.out.println("Please, insert correct sign");
                continue;
            }catch (QuitException e){
                break;
            }

            input = sc.next();

            try {
                second_element = ops.validateElement(input, "element");
            }catch (IncorrectElException e){
                System.out.println("Second element isn't correct");
                continue;
            }catch (QuitException e){
                break;
            }

            try{
                String result = ops.calculate(first_element.number, sign.sign, second_element.number);
                System.out.println(result);
            }catch (DivideByZeroException e){
                System.out.println("You try to divide by zero, please try again");
                 continue;
            }

        }

    }
}

