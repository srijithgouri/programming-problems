package day_6;

public class Strongnumber {


			public static void main(String[] args) {
		System.out.println(getStrong(145));

	}
public static String getStrong(int n) {
	int sum=0;
	int temp=n;
	String res="";
	int rem;
	while(n>0) {
		rem=n%10;
	int mul=1;
	for(int i=1;i<=rem;i++) {
		mul*=i;
	}
	
	sum+=mul;
	n/=10;
}
	if(sum==temp) {
		res="Strong";
	}else {
		res="Not A strong";
	}
	return "The number is "+res+" Number";
}
}