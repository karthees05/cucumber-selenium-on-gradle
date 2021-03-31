package com.kar.steps.Programs;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;


public class JSONArray {
    public void createJSONUsingJSONArray(String key, String value) throws JSONException {
        org.json.JSONArray ja = new org.json.JSONArray();
        ja.put(Boolean.TRUE);
        ja.put("Category-A");
        JSONObject jo = new JSONObject();
        jo.put(key, value);
        ja.put(jo);
        System.out.println(ja);
        assertThat("",jo.has("TestKey-1"));
        assertThat("",jo.get("TestKey-1").equals("TestValue-1"));

    }

    public void createJSONUsingArrayList(String[] listOfArrayValues) {
        List<String> li = new ArrayList<>();
        Collections.addAll(li, listOfArrayValues);
        org.json.JSONArray jsonArray = new org.json.JSONArray();
        jsonArray.put(li);
        System.out.println(jsonArray);
    }

    @Test
    public void testCreateJSONArray() throws JSONException {
        createJSONUsingJSONArray("TestKey-1", "TestValue-1");
        createJSONUsingArrayList(new String[]{"One", "Two", "Three", "Four", "Five"});
    }
}
