package Arraysproblems;

import java.util.Arrays;
public class UniqueElements {
	public static void main(String[] args) {
  int arr[]={1,2,3,4,5,5,3,4,9,8};
  int c = 0;
  Arrays.sort(arr);
  for(int i = 0;i<arr.length;i+=2){
      if(arr[i] != arr[i+1]){
          System.out.print(arr[i] + " " + arr[i+1]+" ");
      }
  }
}
	
}	