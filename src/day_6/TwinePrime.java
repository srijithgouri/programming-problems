package day_6;

public class TwinePrime {

	public static void main(String[] args) {
		getTwinPrime(100);
	}
	public static void getTwinPrime(int n){
		int index=0;
		int[] prime=new int[n];
		
		for(int i=2;i<=n;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				prime[index]=i;
				index++;
			}
		}
		for(int l=0;l<prime.length-1;l++){
			if(prime[l+1]-prime[l]==2){
				System.out.println(prime[l]+" "+prime[l+1]);
			}
		}
	}
}
