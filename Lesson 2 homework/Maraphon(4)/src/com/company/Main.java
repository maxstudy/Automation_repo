package com.company;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Model model = new Model();

        ArrayList<Runner> runners = new ArrayList<Runner>();

        runners = model.setRunners();
        runners = model.sort(runners);
        model.view(runners);


        Runner first = new Runner();
        first = model.search(runners, 2);
        System.out.println("First place - " + model.search(runners,1).getName()+ ", time - " + model.search(runners,1).getTime());

        System.out.println("Second place - " + model.search(runners,2).getName()+ ", time - " + model.search(runners,2).getTime());
    }
}
