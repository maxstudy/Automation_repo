package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        RestOps operation = new RestOps();
        System.out.println("Get the list of Automation_repo repository collaborators:");
        operation.getrequest("maxstudy", "Automation_repo");
        System.out.println("Send collaboration invite to EkaterinaMoskaleva user");
        operation.putrequest("maxstudy","Automation_repo", "EkaterinaMoskaleva");
    }
}
