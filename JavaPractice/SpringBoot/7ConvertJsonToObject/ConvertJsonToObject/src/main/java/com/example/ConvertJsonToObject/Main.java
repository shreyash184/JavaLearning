package com.example.ConvertJsonToObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/main/resources/person.json");
        try{
            ObjectMapper mapper = new ObjectMapper();
            List<Person>list = new ArrayList<>();
            List<String> nameList = new ArrayList<>();
            list= Arrays.asList(mapper.readValue(file, Person[].class));
            for(Person l : list){
                nameList.add(l.getFirst_name());
            }
            System.out.println(nameList);
        }catch(Exception e){
            e.printStackTrace();
        }

    }


}
