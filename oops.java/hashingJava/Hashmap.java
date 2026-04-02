package Hashing;
 //hashmap use hota hai pair vale  ko stire karne ke liye
 // pair me key and value ko combination hote hai 
 // key must be unique hona chahiye
 //.put();
 //.get();
 //.containsKey();


import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        // creating hashMap
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 200);
        System.out.println(map);
        // searching 
        if (map.containsKey("map")) {
            System.out.println("Key is present in the map");
        } else {
             System.out.println("key is not present in the map");
            }
            System.out.println(map.get("India")); // keuy existr
            System.out.println(map.get("Indoswenia")); // key doesnot exist
            
            // iteration operation in hashmap (1 method and prefer this)
             // syntax of itreration is similsr to for each loop
             // For( int val: key) {
             //  } for each loop syntax
             // similarly yha pe 
             //Map.Entry<String, Integer> is a type of e (e -> element0)
             //
              for (Map.Entry<String, Integer> e : map.entrySet()) {
                System.out.println(e.getKey());
                System.out.println(e.getValue());
              }

              // ioteration(2 method)
              // yha ppe ham  sari key ki set bna lenge
              Set<String> keys = map.keySet();
              for(String key : keys) {
                System.out.println(key+" "+map.get(key));

              }
              // removing 
              map.remove("china");
              System.out.println(map);

        }
    }

