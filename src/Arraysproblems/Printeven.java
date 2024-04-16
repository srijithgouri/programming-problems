package Arraysproblems;

import java.util.Arrays;

public class Printeven {

	public static void main(String[] args) {
		int n=10;
		if(n>0) {
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+ ",");
			}
//				else if(i%2==0){
//				System.out.println(i);
//			}
			}
		}
		else {
			System.out.println("out of range!");
		}
	}

}