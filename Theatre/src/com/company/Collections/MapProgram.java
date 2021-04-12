package com.company.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "High level compiled language.");
        languages.put("Python", "High level interpreted language.");
        languages.put("C", "Faster than any other language.");
        System.out.println(languages.containsKey("Java"));
        for(String key: languages.keySet()){
            System.out.println(key+" : "+languages.get(key));
        }
    }
}
