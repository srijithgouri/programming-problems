package day_6;

public class Sumofdivisibles0f3_5{

	public static void main(String[] args) {
		System.out.println(get_divisible(9,15));
	}
public static int get_divisible(int a,int b) {
	int sum=0;
	for(int i=a;i<=b;i++) {
		if(i%3==0||i%5==0) {
			sum+=i;
		}
	}
	return sum;
}
}