package com.company;
import io.restassured.*;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class Main {

    public static void main(String[] args) {
        String invitee = "EkaterinaMoskaleva";
        RestOps operation = new RestOps();
System.out.println("Get the list of Automation_repo repository collaborators");
     operation.getCollaboratorsJSON("maxstudy", "Automation_repo");
System.out.println("Send collaboration invite to "+invitee+" user");
    operation.setCollaborator("maxstudy","Automation_repo", invitee);


    }




}
