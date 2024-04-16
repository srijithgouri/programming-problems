package Arraysproblems;

import java.util.Arrays;

public class Arrange0s1s2s {

	public static void main(String[] args) {
		int[] arr= {1,2,1,1,0,0,0,2,2,2,2,1,1,0,0,0,1,1,1,1,1,2,2,2,2,0,1,0,2,2,1,0,1,2,0,1,2,0,1,2,0};
		int i=0;
		int j=arr.length-1;
		int k=0;
		int temp;
		while(j>i) {
			if(arr[i]==0) {
				temp=arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
				i++;
				k++;
			}else if(arr[i]==2) {	
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j--;
				
			}else {
				i++;
			}
		}
//		for(int l=0;l<arr.length;l++) {
			System.out.print(Arrays.toString(arr));
		}

	}


