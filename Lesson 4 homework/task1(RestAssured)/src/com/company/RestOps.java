package com.company;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.commons.codec.binary.Base64;

import java.util.ArrayList;

import static io.restassured.RestAssured.*;

public class RestOps {

    private static final String credentials = "maxstudy:zxcvbnm123";


    private Header getAuthHeader(String creds) {
        byte[] plainCredsBytes = creds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);
        Header auth = new Header("Authorization", "Basic " + base64Creds);
        return auth;
    }

    public void getCollaboratorsJSON(String user, String repo) {


        Response res = given().header(this.getAuthHeader(credentials)).when().get("https://api.github.com/repos/" + user + "/" + repo + "/collaborators");

        String body = res.asString();
        Parser parse = new Parser();

        ArrayList<ParseDatum> users = parse.jsonParse(body);
        System.out.println("List of collaborators:");
        for(ParseDatum e: users){
            System.out.println(e.getLogin());
        }


    }

    public void setCollaborator(String inviter, String repo, String invitee) {
        Response add_user = given().header(this.getAuthHeader(credentials)).when().put("https://api.github.com/repos/" + inviter + "/" + repo + "/collaborators/" + invitee);
String body = add_user.asString();
        Parser parse = new Parser();
        Putschema user = parse.jsonParsePut(body);
        if(user.getId() != null ){
            System.out.println("Email is sent to user: "+user.getInvitee().getLogin()+" at " +user.getCreatedAt());
        }

    }

}
