package day_6;

public class Printevennumbers {

	public static void main(String[] args) {
		System.out.println(geteven(1234567894));

	}
public static String geteven(int n) {
	String result="";
	int reverse=0;
	int temp;
	while(n>0){
	    reverse=reverse*10+n%10;
	    n/=10;
	}
	while(reverse>0){
	    temp=reverse%10;
	    if(temp%2==0){
	        result+=temp;
	    }
	    reverse/=10;
	}
	return result;
}
}