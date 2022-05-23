package Palindrome;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

public class CFGSet {
    // Main driver method
    public static void main(String[] args)
    {
        // Demonstrating Set using HashSet
        // Declaring object of type String
        Set<String> hash_Set = new HashSet<String>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        hash_Set.add("Set5");
        Set<String> hash_Set1 = new HashSet<String>();

        // Adding elements to the Set
        // using add() method
        hash_Set1.add("Geeks");
        hash_Set1.add("For");
        hash_Set1.add("Geeks");
        hash_Set1.add("Example");
        hash_Set1.add("Set");
        hash_Set1.add("Set5");

        // Printing elements of HashSet object
        System.out.println(hash_Set);
        System.out.println(hash_Set1);
        Set<String> intersection = Sets.intersection(hash_Set, hash_Set1);
        System.out.println(intersection);
    }
}
