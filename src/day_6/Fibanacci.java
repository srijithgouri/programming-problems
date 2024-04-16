package day_6;

public class Fibanacci {

	public static void main(String[] args) {
	
System.out.println(getfibanacci(5));
	}
public static String getfibanacci(int n) {
	int a=0,b=1,c;
	String res="";
	for(int i=0;i<=n;i++) {
		c=a+b;
		res=res+c;
		a=b;
		b=c;
		res+=" ";
	}
	return res;
}
}
