package Arraysproblems;

public class Sumofdiagonals {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,5,8,1}};
		System.out.println(getDiagonals(arr));

	}
public static String getDiagonals(int arr[][]) {
	String result="";
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<=arr.length;j++) {
			if(i==j) {
				sum+=arr[i][j];	
			}
			result+=arr[i][j]+" ";
		}
		result+="\n";
	}
	return result+"The sum of diadonals is:"+sum;
}
}