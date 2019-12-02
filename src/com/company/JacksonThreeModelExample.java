package com.company;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class JacksonThreeModelExample {
    private final static String json = "C:\\Users\\Samat\\IdeaProjects\\json\\src\\resource\\parse.json";

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonNode rootNode = mapper.readTree(new File(json));
            JsonNode nameNode = rootNode.path("name");
            System.out.println("name: " + nameNode.getTextValue());
            JsonNode firstNameNode = rootNode.path("firstName");
            System.out.println("firstName: " + firstNameNode.getTextValue());
            JsonNode address = rootNode.path("address");
            System.out.println("Address: ");
            Iterator<JsonNode> addressIterator = address.getElements();
            while (addressIterator.hasNext()) {
                System.out.println(addressIterator.next().getTextValue());
            }
            JsonNode phone = rootNode.path("phone");
            System.out.println("Phone: ");
            Iterator<JsonNode> phoneIterator = phone.getElements();
            while (phoneIterator.hasNext()) {
                System.out.println(phoneIterator.next().getTextValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
