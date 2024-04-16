package day_6;

public class Spynumber {

	public static void main(String[] args) {
		System.out.println(getspy(9));

	}
public static String getspy(int n) {
	String res="";
	int sum=0;
	int mul=1;
	int temp=0;
	while(n>0) {
		temp=n%10;
		sum+=temp;
		mul=mul*temp;
		n/=10;	
	}
	if(sum==mul) {
		res="spy";
	}else {
		res="not spy";
	}
	return res;
}
}
