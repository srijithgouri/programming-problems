package day_6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = sc.nextInt();
		System.out.println(getPrime(x));
	}
	
	public static String getPrime(int n){
		String res="";
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
			if(count==2){
				res="prime";
			}else{
				res="Not prime";
			}
		}
		return res;
	}
	
	

}
