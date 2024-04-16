package day_3;

public class Swapusingthirdvariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		System.out.println("Before swap: "+a+","+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap: "+a+","+b);
	}

}
