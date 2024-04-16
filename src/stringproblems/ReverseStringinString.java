package stringproblems;
import java.util.Arrays;
public class ReverseStringinString {
public static void main(String[] args) {
	String[] sarr={"srijith","Rohith","Arun","Giri"};
	String[] sarr1=new String[sarr.length];
	int index=0;
	for(int i=sarr.length-1;i>=0;i--){
		String s=sarr[i];
	    String s1="";
//	    int index=0;
	    for(int j=0;j<s.length();j++){
	        s1=s.charAt(j)+s1;
	    }
	    sarr1[index++]=s1;
//	    sarr1[sarr.length-i-1]=s1;
	}
	System.out.println(Arrays.toString(sarr1));
	
//	Approch-2
	String[] arr= {"srijith","arun","giri","sumanth"};
	int count=0;
	String[] arr2 =new String[arr.length];
	for(int i=arr.length-1;i>=0;i--) {
		String temp="";
		for(int j=arr[i].length()-1;j>=0;j--) {
			temp+=arr[i].charAt(j);
		}
		arr2[count]=temp;
		count++;
	}
	System.out.println(Arrays.toString(arr2));
}
}