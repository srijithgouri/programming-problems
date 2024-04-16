package day_6;

public class Perfectnumber {

	public static void main(String[] args) {
		System.out.println(getperfect(6));

	}
	public static String getperfect(int n) {
		String res="";
		int sum=0;
		int temp=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==temp) {
			res="perfect";
		}else {
			res="not perfect";
		}
		return res;
	}

}
