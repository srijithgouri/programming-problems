package Arraysproblems;

public class TargetValue {

	public static void main(String[] args) {
	int[] arr={7,1,2,3,5,8,4,6};
System.out.println(gettoSum(arr));
	}
	public static String gettoSum(int arr[]){
		String res="";
		int target=15;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					res=i+" "+j;
				}
				
			}
			
		}
		return res;
	}

}
