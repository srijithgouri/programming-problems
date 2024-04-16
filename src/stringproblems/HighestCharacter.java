package stringproblems;

public class HighestCharacter {

	public static void main(String[] args) {
		String str="talzent";
		int sum=0;
		int max=0;
		char c='a';
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			sum=(int)arr[i];
			if(sum>max){
				max=sum;
				c=arr[i];
			}
		}
		System.out.println(c);

	}

}