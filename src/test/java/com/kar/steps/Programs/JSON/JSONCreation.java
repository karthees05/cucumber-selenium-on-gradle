package com.kar.steps.Programs.JSON;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JSONCreation {

    //    Creating JSON from JSONObject
    public void createJSONUsingJsonObject(String key, String value) throws JSONException {
        JSONObject jo = new JSONObject();
        jo.put(key, value);
        System.out.println(jo);
    }

    //    Creating JSON from Map
    public void createJSONUsingHashMap(String key, String value) {
        Map<String, String> map = new HashMap<>();
        map.put(key, value);
        JSONObject jo = new JSONObject(map);
        System.out.println(jo);
    }

    @Test
    public void testCreateJSON() throws JSONException {
        createJSONUsingHashMap("city", "Farnborough");
        createJSONUsingHashMap("county", "Hampshire");

        createJSONUsingJsonObject("city", "Farnborough");
        createJSONUsingJsonObject("county", "Hampshire");

    }
}
