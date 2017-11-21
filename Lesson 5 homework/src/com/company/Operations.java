package com.company;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;

public class Operations {


    public Element validateElement(String input, String type) throws IncorrectElException, QuitException{
        Double final_element;
        Element el = new Element();
        if(input.equals("quit")){
            throw new QuitException();
        }

        if (type.equals("sign")){
            if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")){
                el.sign = input;
                return el;
            }else throw new IncorrectElException();
        }else {
            try {
                el.number = Double.parseDouble(input);

            }
            catch (NumberFormatException exc){
                throw new IncorrectElException();
            }
        }

        return el;
    }



    public String calculate(Double first_el, String sign, Double second_el) throws DivideByZeroException{
        String result;
        switch (sign.charAt(0)){
            case '+':
                 result = Double.toString(first_el+second_el);
                break;
            case '-':
                 result = Double.toString(first_el-second_el);
                break;
            case '*':
                 result = Double.toString(first_el*second_el);
                break;
            case '/':
                if (second_el == 0){

                    throw new DivideByZeroException();
                }else{
                     result = Double.toString(first_el/second_el);
                    break;
                }
             default:
             result = "0";
        }
        return result;
    }


}
