package Bantolabs;

import java.util.ArrayList;

public class NonRepatingCharacter{
	public static void main(String []args){
		String str="geeksforgeeks";
		char array[] = str.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					array[i]='/';
					array[j]='/';
				}
			}
		}
		for(int i=0;i<array.length;i++){
			if(array[i]!='/'){
				list.add(array[i]);
			}
		}
		System.out.println(list.get(0));
	}
}