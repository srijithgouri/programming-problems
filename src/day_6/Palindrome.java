package day_6;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(getpalindrome(12222221));

	}
public static String getpalindrome(int n) {
	String res="";
	int temp=n;
	int reverse=0;
	while(n>0) {
		reverse=reverse*10+n%10;
		n/=10;
	}
	if(reverse==temp) {
		res="palindrome";
	}else {
		res="not palindrome";
	}
	return res;
}
}
