package stringproblems;
import java.util.Scanner;
import java.util.Arrays;
public class SumofAsciiValues {

	public static void main(String[] args) {
	
		 System.out.println("Enter the Alphabits");
			Scanner sc=new Scanner(System.in);
	        String s=sc.next();
	        byte[] b=s.getBytes();
	        int sum=0;
	        int add=0;
	        System.out.println("The ascii values are: "+Arrays.toString(b));
	        for(int i=0;i<s.length();i++) {
	        	char ch=s.charAt(i);
	        	add=(int)ch;
	        	sum+=add;	
	        }
	        System.out.println("The sum of ascii values are: "+sum);
	}

}
