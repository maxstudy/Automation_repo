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
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.commons.codec.binary.Base64;

import static io.restassured.RestAssured.*;

public class RestOps {

   private static final String credentials = "maxstudy:zxcvbnm123";


    private Header getAuthHeader(String creds){
        byte[] plainCredsBytes = creds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);
        Header auth = new Header("Authorization", "Basic "+base64Creds);
        return auth;
    }

    public int getCollaboratorsJSON(String user, String repo) {


        Response json = given().header(this.getAuthHeader(credentials)).when().get("https://api.github.com/repos/"+user+"/"+repo+"/collaborators");
        System.out.println(json.prettyPeek());
         int statuscode = json.getStatusCode();
        return statuscode;
    }

    public void setCollaborator(String inviter, String repo, String invitee){
        Response add_user = given().header(this.getAuthHeader(credentials)).when().put("https://api.github.com/repos/"+inviter+"/"+repo+"/collaborators/"+invitee);
            add_user.prettyPrint();


    }

}
