package stringproblems;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesinString {

	public static void main(String[] args) {
		String name="sRijiTh";
		name=name.toLowerCase();
		char arr[]=name.toCharArray();
		Set<Character> set = new LinkedHashSet();
		Set<Character> duplicates= new LinkedHashSet();
		
		for(char c : arr){
			if(!set.add(c)){
				duplicates.add(c);
			}
		}
//		If we directly prient the Hasset it will not follow the order where has LinkedHasSet
		System.out.println(set);
//		StringBuilder sb = new StringBuilder();
//		for(Character a: set){
//			sb.append(a);
//		}
//		String names=sb.toString();
//		System.out.println(names);
	}

}
