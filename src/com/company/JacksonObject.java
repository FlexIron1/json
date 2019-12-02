package com.company;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JacksonObject {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String filePath = System.getProperty("user.dir") + File.separator + "src\\resource\\parse.json";
        try {
            User user = (User) objectMapper.readValue(new FileInputStream(filePath), User.class);
            System.out.println(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
