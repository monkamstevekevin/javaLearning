package collections;

import java.util.HashSet;

public class SetDemo {
    public static void show(){
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate elements are ignored

        // Print the HashSet
        System.out.println("HashSet: " + set);

        // Remove an element from the HashSet
        set.remove("Banana");

        // Print the HashSet after removing an element
        System.out.println("HashSet after removing Banana: " + set);
    }
}
