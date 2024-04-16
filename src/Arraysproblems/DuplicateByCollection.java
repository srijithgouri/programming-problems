package Arraysproblems;

import java.util.*;

public class DuplicateByCollection {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4,1,3, 5, 6, 7, 8,}; // Example array with duplicates
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : array) {
            if (!set.add(num)) {
                // If the number is already present in the set, it's a duplicate
                duplicates.add(num);
            }
           
        }
        System.out.println(duplicates);
        System.out.println(set);
                
        if (!duplicates.isEmpty()) {
            System.out.println("Duplicate elements in the array: " + duplicates);
        } else {
            System.out.println("No duplicates found in the array.");
        }
    }
}