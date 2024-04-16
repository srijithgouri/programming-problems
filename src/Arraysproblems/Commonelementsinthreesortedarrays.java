package Arraysproblems;

import java.util.Arrays;

public class Commonelementsinthreesortedarrays {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {3,4,7,8,9,2,10,11};
		int arr3[]= {3,4,11,12,2,13,15};
//		getCommonelements(arr1,arr2,arr3);
		getcommon(arr1,arr2,arr3);
	}
//	approch 1
public static void getCommonelements(int arr1[],int arr2[],int arr3[]) {
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			for(int k=0;k<arr3.length;k++) {
				if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}
// approch 2 is applicable only for sorted arrays
public static void getcommon(int arr1[],int arr2[],int arr3[]) {
	int x=0,y=0,z=0;
	while(x<arr1.length&&y<arr2.length&&z<arr3.length) {
		if(arr1[x]==arr2[y]&&arr2[y]==arr3[z]) {
			x++;
			y++;
			z++;
		}else if(arr1[x]>arr2[y]) { 
			y++;
		}else if(arr2[y]>arr3[z]) {
			z++;
		}else {
			x++;
		}
	}
			int[] a={2,3,4,5};
			int[] b={0,2,3,6};
			int[] c={2,3,7,9};
			int[] arr=new int[2];
			int res=0;
			
			for(int i=0;i<a.length;i++){
			    for(int j=0;j<b.length;j++){
			        if(a[i]==b[j]){
			            arr[i]=a[i];	
			    }
			    
			}
		}
			for(int i=0;i<arr.length;i++){
			    for(int k=0;k<c.length;k++){
			        if(arr[i]==c[k]){
			            arr[i]=c[k];
			     }
			}
			}
	/*	for(int l=0;l<arr.length;l++){
		    System.out.print(arr[l]+",");
		}*/
	 	System.out.println(Arrays.toString(arr)+" ");
	}
	
}
