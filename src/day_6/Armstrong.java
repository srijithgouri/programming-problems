package day_6;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println(getArmstrong(1634));

	}
public static String getArmstrong(int n) {
	int sum=0;
	int count=0;
	String res="";
	int temp1=n;
	int temp2=n;
	while(n>0) {
		n/=10;
		count++;
	}
	while(temp1>0) {
		int digit=temp1%10;
		sum+=Math.pow(digit, count);
		temp1/=10;
	}
	if(sum==temp2) {
		res="Amstrong";
	}else {
		res="not amstrong";
	}
	return res;
}
}
