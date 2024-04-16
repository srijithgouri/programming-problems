package Bantolabs;

import java.util.HashSet;
import java.util.Set;

public class Duplicateremove {

	public static void main(String[] args) {
		int arr[]={10,20,40,30,50,10,70,60,30,90,20,10,7,6,8,7,10};
		 Set<Integer> set = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();
	      
	        for (int num : arr) {
	            if (!set.add(num)) {
	                
	                duplicates.add(num);
	            }
	        }       
        System.out.println(duplicates);
	        System.out.println(set);
	}
}
