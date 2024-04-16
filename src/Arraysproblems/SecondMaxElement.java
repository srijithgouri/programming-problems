package Arraysproblems;

public class SecondMaxElement
{
	public static void main(String[] args) {
	int[]	arr = {1,2,3,2,5,4,6,6,5,7,7,8,8};
	java.util.Arrays.sort(arr);
	for(int i = arr.length-1;i>0;i--){
	    if(arr[i]!=arr[i-1]){
	        System.out.print(arr[i-1]);
	        break;
	    }
	    
	}
	}
}
