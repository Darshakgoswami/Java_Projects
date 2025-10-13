package DSA;

import java.util.HashMap;
import java.util.Map;

/* HashMap use to store key-value pair
Key should be unique
Value can be duplicate
One null key is allowed
Multiple null values are allowed
HashMap is not synchronized
TreeMap is used to store key-value pair in sorted order
TreeMap stores the keys in natural order or according to the Comparator provided at the time of creation
HashMap is not thread-safe
Thread-safe means multiple threads can access the map at the same time without issues */

public class HashMap_Class {
    public static void main(String[] args) {

        // Create a HashMap to store Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs into the HashMap
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        // This will update the value for key 1
        map.put(1, "one_updated");

        // 1. Using entrySet() method to print all key-value pairs
        for (Map.Entry<Integer, String> mapelement : map.entrySet()) {
            System.out.println("Key: " + mapelement.getKey() + ", Value: " + mapelement.getValue());
        }

        // 2. Using keySet() to access keys and print corresponding values
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }

        // 3. Printing only values using values() method
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 4. Printing all keys using keySet() method
        System.out.println("Keys: " + map.keySet());

        // 5. Check if a specific key exists using containsKey()
        if (map.containsKey(1)) {
            System.out.println("Key 1 exists in the map");
        } else {
            System.out.println("Key 1 does not exist in the map");
        }

        // 6. Get value by key
        System.out.println("Value of key 1: " + map.get(1));

        // 7. Get key by value (e.g., key for value "three")
        Integer keyByValue = null;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals("three")) {
                keyByValue = entry.getKey(); // Store key if value matches
                System.out.println("Key for value 'three': " + keyByValue);
                break;
            }
        }
    }
}