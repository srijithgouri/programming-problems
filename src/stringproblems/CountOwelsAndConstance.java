package stringproblems;

public class CountOwelsAndConstance {

	public static void main(String[] args) {
	String name ="srijith";
	int count=0;
	int count1=0;
	name=name.toLowerCase();
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
		count++;
			System.out.println("The vowels are:"+name.charAt(i));
		}else {
			count1++;
			System.out.println("The constance are:"+name.charAt(i));
		}
	}
	System.out.println("The no of vowels:"+count);
	System.out.println("The no fo constance are:"+count1);

	}

}

