package com.company;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class PersonFromJson {
    private final static String json = "C:\\Users\\Samat\\IdeaProjects\\json\\src\\resource\\parse.json";

    public static void main(String[] args) {


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readValue(new File(json),Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
