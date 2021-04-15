package com.kar.steps.Programs.JSON;

import java.io.FileReader;
import java.util.Set;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class compareJsonFile {

    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("/home/chandrakant/Desktop/json1.json"));
            Object obj1 = parser.parse(new FileReader("/home/chandrakant/Desktop/json2.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject jsonObject1 = (JSONObject) obj1;
            Set<String> s = jsonObject.keySet();
            for (String str : s) {
                System.out.println("key:" + str + " : value1:" + jsonObject.get(str) + ":value2:" + jsonObject1.get(str));
                //compare value of json1 with json2
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}