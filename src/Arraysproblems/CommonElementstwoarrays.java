package Arraysproblems;

import java.util.Arrays;

public class CommonElementstwoarrays {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int arr1[]={6,7,8,2,9,3,4};
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr[i]==arr1[j]){
					count++;
				}
			}
		}
		int temp=0;
		int arr2[]=new int[count];
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr1.length;j++){
			if(arr[i]==arr1[j]){	
				arr2[temp]=arr[i];
				temp++;
				}
		}
	} 
		System.out.print(Arrays.toString(arr2));

	}
}