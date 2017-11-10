package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import ExamExceptions;


public class FileParser {

    public ArrayList<Armor> fileParse(String filename) throws ExamExceptions {

        ArrayList<Armor> knight = new ArrayList<Armor>();


  //      System.out.println(filename);
        Pattern regex = Pattern.compile("[csv]");
        Matcher matcher = regex.matcher(filename);

        //Validation(regexp contain CSV and need to upgrade)
        if (matcher.find()) {

            BufferedReader reader;

            try {
                reader = new BufferedReader(new FileReader(filename));
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                return knight;
            }

            Pattern regexString = Pattern.compile("[^A-Za-z]");

            String line = null;
            Scanner scanner = null;
            int index = 0;

            Factory builder = new Factory();


            try {
                while ((line = reader.readLine()) != null) {
                    scanner = new Scanner(line);
                    scanner.useDelimiter(",");
                    Armor element;
                    String name = "";
                    int cost = 0;
                    int weight = 0;
                    String material = "";
                    while (scanner.hasNext()) {
                        String data = scanner.next();
                        if (index == 0) {

                            Matcher matcherString = regexString.matcher(data);
                            if (matcherString.find()) {

                                System.out.println("File has bad format -- armor name contain excessed symbols");
                                return knight = null;
                            } else {
                                name = data;
                            }
                        } else if (index == 1)
                            cost = Integer.parseInt(data);
                        else if (index == 2)
                            weight = Integer.parseInt(data);
                        else if (index == 3)
                            material = data;
                        index++;
                    }
                    try {
                        element = builder.getArmor(name, cost, weight, material);
                    }catch (IncorrectElException e){
                        System.out.println("Factory error");
                        return knight = null;
                    }
                        knight.add(element);
                        index = 0;

                }


            }
            catch (IOException e) {
                System.out.println("IOException handled");
            }
            return knight;
        } else {
            System.out.println("Parse error, file extension isn't CSV");
            knight = null;
            return knight;
        }
    }

}
