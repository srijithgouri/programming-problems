package Arraysproblems;

import java.util.Arrays;

public class Arrange0s1s {

	public static void main(String[] args) {
		int arr[]= {1,1,1,0,0,0,1,0,0,0,1,1,0};
		int i=0;
		int j=0;
		int temp;
		while(arr.length>i) {
			if(arr[i]==0) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
				j++;
			}else {
				i++;
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}