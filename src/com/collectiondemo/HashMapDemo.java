package com.collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        
        /* Create HashMap */
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("John", 25);
        map1.put("Alice", 28);
        map1.put("Bob", 30);

        System.out.println(map1);

        /* Find keys */
        Set<String> keys = map1.keySet();
        System.out.println(keys);

        /* Check if key exist and return its value */
        if (map1.containsKey("Bob"))
            System.out.println(map1.get("Bob"));

        /* Iterate through HashMap using keySet */
        for (String key : keys) {
            System.out.println("Name: " + key + ", Age: " + map1.get(key));
        }

        /* Iterate through HashMap using entrySet <It is preferred over using keySet> */
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();

        for (Map.Entry<String, Integer> entry: entries) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        /* Complex HashMap */
        Map<String, Map<String, Object>> userProfiles = new HashMap<>();

        Map<String, Object> profile = new HashMap<>();
        profile.put("age", 23);
        profile.put("dept", "CS");
        profile.put("city", "New york");

        userProfiles.put("John", profile);

        profile = new HashMap<>();
        profile.put("age", 25);
        profile.put("dept", "IT");
        profile.put("city", "New york");

        userProfiles.put("Alice", profile);

        System.out.println(userProfiles);

        /* Find age of John from his profile */
        Map<String, Object> johnProfile = userProfiles.get("John");
        int age = (Integer) johnProfile.get("age");

        System.out.println("Age of John: " + age);
    }
}
