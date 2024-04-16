package day_3;

import java.util.Scanner;

public class Areaandpermeterofsquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 'value1' for area ");
		int value1=sc.nextInt();
		System.out.println("enter 'value2' for perimeter");
		int value2=sc.nextInt();
		System.out.println(area(value1));
        System.out.println(perimeter(value2));
	}
public static String area(int a) {
	int area=4*a;
	return "The area of square is: "+area;
}
public static String perimeter(int a) {
	int perimeter=a*a;
	return "The perimeter of square is: "+perimeter;

	}

}
