package Arraysproblems;

import java.util.Arrays;

public class WeavingElement {

	public static void main(String[] args) {
		int arr1[]={10,20,30,40};   //it is not possible for not sorted arrays,duplicates
		int []arr2={15,25,35,45};
		int index=0;
		int min=Math.min(arr1.length, arr2.length);
		int[]a3=new int[min*2];
		for(int i=0;i<min;i++){
			a3[index++]=arr1[i];
			a3[index++]=arr2[i];
			
		}
System.out.println(Arrays.toString(a3));

int[] a1= {10,20,30,40};
int[] a2= {15,25,35,45,30,40,60};
int j=0;
int l;
if(a1.length<=a2.length) {
	l=a1.length;
}else {
	l=a2.length;
}
int[] res=new int[2*l];
for(int i=0;i<l;i++) {
	res[j]=a1[i];
	j++;
	res[j]=a2[i];
	j++;
}
System.out.println(Arrays.toString(res));
	}
} 