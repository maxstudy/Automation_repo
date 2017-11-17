package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.System.*;

public class Parser {

    public ArrayList<ParseDatum> jsonParse(String json) {
      ArrayList<ParseDatum> user = new ArrayList<ParseDatum>();
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            user = mapper.readValue(json, new TypeReference<ArrayList<ParseDatum>>(){});
          //  out.println(user);
          //  assertNotNull(user);
        } catch (JsonGenerationException e) {
      e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }

    public Putschema jsonParsePut(String json) {
        Putschema user = new Putschema();
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            user = mapper.readValue(json, Putschema.class);
            //  out.println(user);
            //  assertNotNull(user);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }


}
