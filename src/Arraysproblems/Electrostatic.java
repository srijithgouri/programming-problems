package Arraysproblems;

public class Electrostatic {

	public static void main(String[] args) {
		int[] arr={4,3,5,5,4};
		String str="PNPPN";
		char[] c=str.toCharArray();
		int p=0;
		int n=0;
		char P='P';
		char N='N';
		for(int i=0;i<str.length();i++){
			if(c[i]==P){
				p+=arr[i];
			}else{
				n+=arr[i];
			}
		}
		int count=(p-n)*100;
		System.out.println(count);
		

	}

}
