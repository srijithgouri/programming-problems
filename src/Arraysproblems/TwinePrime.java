package Arraysproblems;

public class TwinePrime {
	     
	public static void main(String[] args) {
		getTwinPrime(100);
	}
	public static void getTwinPrime(int userInput){
	    int[] prime=new int[userInput/2];
	    int index=0;
	    for(int i=2;i<=userInput;i++){
	        int count=0;
	        for(int j=2;j<=i/2;j++){
	            if(i%j==0){
	                count++;
	            }
	        }
	        if(count==0){
	            prime[index]=i;
	            index++;
	        }
	    }
	    for(int a=0;a<  prime.length-1;a++){
	        if(prime[a+1]-prime[a]==2){
	            System.out.println(prime[a]+" "+prime[a+1]);
	        }
	    }
	}

}



	

