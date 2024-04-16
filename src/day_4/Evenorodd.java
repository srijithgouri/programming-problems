package day_4;

public class Evenorodd {

	public static void main(String[] args) {
		System.out.println(getevenorodd(7));

	}
public static String getevenorodd(int n) {
	String res="";
	if(n%2==0) {
		res="Even";
	}else {
		res="odd";
	}
	return res;

	}

}
