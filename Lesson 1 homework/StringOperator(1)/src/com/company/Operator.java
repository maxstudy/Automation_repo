package com.company;

public class Operator {


    public String toRevert(String row) {
       String new_row = new String();
       for (int i = row.length()-1; i >= 0; i--){
           new_row += row.charAt(i);
       }

        return new_row;
    }


    public String toReplace(String row){
        String new_row = new String();
        new_row = row.replace(" ", "*");
        return new_row;
    }

    public String toUpperCase(String row){

        return row.toUpperCase();
    }

    public String toSubstr(String row){

        return row.substring(4,9);

    }

    public String[] toSplit(String row){
        String[] arrs = row.split(" ");
        return arrs;
    }

}
