package Arraysproblems;
import java.util.*;

public class Leading {
	public static void main(String[] args) {
		  int arr[]={7,6,5,2,3,1};
		    ArrayList<Integer> list=new ArrayList<>();
			for(int i=0;i<arr.length;i++){
			    boolean flag = true;
			    for(int j=i+1;j<arr.length-1;j++){
			        if(arr[i]<arr[j]){
			            flag = false;
			           break;
			        }
			    }
			    if(flag){
			       list.add(arr[i]); 
			    }
			     
			}
			System.out.println(list);
	}
}
