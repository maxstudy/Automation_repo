package com.company;

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

public class Main {

    public static void main(String[] args) {


        List<Armor> knight = new ArrayList<Armor>();


        FileParser parser = new FileParser();
        try {
            knight = parser.fileParse("test.csv");

        } catch (ExamExceptions e) {
            System.out.println("File parser error");
            return;
        }
        if (knight == null) {
            System.out.println("program stopped");
            return;
        }

        Collections.sort(knight);
        for (Armor e : knight) {
            System.out.println(e.getType() + " cost:" + e.cost);
        }


        System.out.println("Search result(equipment with cost bigger than 0 and lesser than 200)");

        List<Armor> result = Armor.filter(knight, 0, 200);

        for (Armor e : result) {
            System.out.println(e.getType() + " cost:" + e.cost);
        }
    }
}
