package Arraysproblems;

public class SubArraycount {

	public static void main(String[] args) {
		int []arr={2,4,3,6,8,9,10,7,15};
		int start=0;
		int end=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
			   start=i;
			   break;
			}
		}
for(int j=arr.length-1;j>=0;j--){
	if(arr[j]<arr[j-1]){
		end=j;
		break;
	}
}
System.out.println((end+1)-start);
	}

}
