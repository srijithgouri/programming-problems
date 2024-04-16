package Arraysproblems;

import java.util.*;

public class Maxelements {

	public static void main(String[] args) {
		int arr[]= {4,2,3,4,5,6,7,3,10,11,8};
		get_secondmax(arr);
		int[] arr2=get_secondmax(arr);
		System.out.println((arr2.length-2));
//		getsecondmax(arr);
	}
	public static int[] get_secondmax(int[] arr) {
		int temp;

		for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}

		return arr;
		
	}
	public static void getsecondmax(int arr[]) {
		int size=arr.length;
		if(size<2) {
			System.out.println("invalid");
		}
		Arrays.sort(arr);
		System.out.println(arr[size-2]);
	}
}