package Arraysproblems;

public class MaxwithException {
	public static void main(String[] args) {
		int[] arr={1,2,3,5,6,4,2};
//		int[] arr={};
		System.out.println(maximum(arr));
	}

		 public static int maximum(int arr[]){
		int a=0;
		if(arr.length==0){
		 throw new IllegalArgumentException("Array is either null or empty");
		}
		else{
		 for(int i=0;i<arr.length;i++){
		 if(a<=arr[i]){
		 a=arr[i];
		 }
		 }
		}
		 return a;
		 }
		}

