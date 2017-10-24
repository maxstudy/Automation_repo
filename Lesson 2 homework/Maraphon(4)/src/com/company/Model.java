package com.company;

import java.util.ArrayList;

 class Model {

    private String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

    private int[] time = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };


     ArrayList<Runner> setRunners() {

         ArrayList<Runner> runners = new ArrayList<Runner>();

        for (int i = 0; i<= 15; i++){
            Runner temp_run = new Runner();
            temp_run.setName(this.names[i]);
            temp_run.setTime(this.time[i]);
            runners.add(temp_run);

        }

return runners;
    }

    //Sorry for bubble-sort, as Ivan said in slack -- we don't learn Comparator :)
    public ArrayList<Runner> sort(ArrayList<Runner> runner){


            for (int i = runner.size() - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (runner.get(j).getTime() > runner.get(j+1).getTime()) {

                        String temp_name = runner.get(j).getName();
                        int temp_time = runner.get(j).getTime();

                        runner.get(j).setTime(runner.get(j+1).getTime());
                        runner.get(j).setName(runner.get(j+1).getName());
                        runner.get(j+1).setName(temp_name);
                        runner.get(j+1).setTime(temp_time);
                    }
                }
            }

        return runner;
    }


    public Runner search(ArrayList<Runner> runners, int number){
        Runner temp_runner = new Runner();
        temp_runner = runners.get(number-1);
        return temp_runner;
    }

    public void view(ArrayList<Runner> runners){
        for (int i = 0; i< runners.size();i++ ){
            System.out.println(i+1 + " "+ runners.get(i).getName()+ " " + runners.get(i).getTime());
        }
    };

}
