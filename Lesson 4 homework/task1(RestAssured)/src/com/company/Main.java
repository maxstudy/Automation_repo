package com.company;
import io.restassured.*;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class Main {

    public static void main(String[] args) {

        RestOps operation = new RestOps();

    System.out.println( operation.getCollaboratorsJSON("maxstudy", "Automation_repo"));
    operation.setCollaborator("maxstudy","Automation_repo", "EkaterinaMoskaleva");


    }




}
