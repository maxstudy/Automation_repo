package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.DefaultHttpClient;


public class RestOps {


    private static final String credentials = "maxstudy:zxcvbnm123";


    private Header getAuthHeader(String creds){
        byte[] plainCredsBytes = creds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);
        Header auth = new Header("Authorization", "Basic "+base64Creds);
        return auth;
    }



    public void getrequest(String user, String repo){

        Header auth = getAuthHeader(credentials);
        try{
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet getRequest = new HttpGet(
                    "https://api.github.com/repos/" + user + "/" + repo + "/collaborators");
            getRequest.addHeader("accept", "application/json");
            getRequest.addHeader(auth.getName(), auth.getValue());

            HttpResponse response = httpClient.execute(getRequest);

            if (response.getStatusLine().getStatusCode() != 200 ) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

         //   System.out.println(response);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            while ((output = br.readLine()) != null) {
             //   System.out.println(output);
                Parser parse = new Parser();
                 ArrayList<ParseDatum> collaborators = new ArrayList<ParseDatum>();
                  collaborators = parse.jsonParse(output);
                    for (ParseDatum e: collaborators){
                        System.out.println(e.getLogin());
                    }

            }
            //System.out.println(output);
            httpClient.getConnectionManager().shutdown();

        }catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }



        Parser parse = new Parser();
       // ArrayList<ParseDatum> collaborators = new ArrayList<ParseDatum>();
      //  collaborators = parse.jsonParse()
    }


    public void putrequest(String inviter, String repo, String invitee){

        Header auth = getAuthHeader(credentials);

        try{
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPut getRequest = new HttpPut(
                    "https://api.github.com/repos/" + inviter + "/" + repo + "/collaborators/" + invitee);
            getRequest.addHeader("accept", "application/json");
            getRequest.addHeader(auth.getName(), auth.getValue());

            HttpResponse response = httpClient.execute(getRequest);

            if (response.getStatusLine().getStatusCode() != 200 && response.getStatusLine().getStatusCode() != 201 ) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            while ((output = br.readLine()) != null) {
                Parser parse = new Parser();
                Putschema user = parse.jsonParsePut(output);
                if(user.getId() != null ){
                    System.out.println("Email is sent to user: "+user.getInvitee().getLogin()+" at " +user.getCreatedAt());
                }
            }

            httpClient.getConnectionManager().shutdown();

        }catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }



}
