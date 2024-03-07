package com.dangercode.javaCore.convertions;

import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ByteArrayToJSON {
    public static void main(String[] args) {
        byte[] byteArray = HexFormat.of().parseHex("7b226e616d65223a2244696e636572222c227375726e616d65223a2253616b61227d");
        String jsonString = new String(byteArray);
        System.out.println("JSON String format:"+jsonString);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Person person = objectMapper.readValue(jsonString, Person.class);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getSurname());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
