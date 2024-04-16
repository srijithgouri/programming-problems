package day_6;
public class Allnumbers {
	public static void main(String[] args) {
		System.out.println(getAlldigits(1234664525));
	}
public static String getAlldigits(int n) {
	String res="";
	int reverse=0;
	while(n>0) {
		reverse=reverse*10+(n%10);
		n/=10;
	}
	while(reverse>0) {
		res=res+(reverse%10);
		reverse/=10;
	}
	return res;
}
}	