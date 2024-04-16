package Arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
		int arr[]= {8,1,2,3,4,5,4,8,7,5,1,2,1,9,2,2,2};
		boolean flag=false;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[i+1]) {
					System.out.println("duplicate is found:"+arr[i]);
					flag=true;
				}
			}
//		}
		if(flag==false) {
		System.out.println("duplicate is not found");
		}
		int[] arr1 = {1,2,3,4,5,1,1,2,2,397};
		List<int[]> list = Arrays.asList(arr1);
//		List<Integer> list2=new ArrayList<>(arr1);
		
	}
	
	
	
}