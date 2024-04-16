package stringproblems;

public class HighestCharacterArray {

	public static void main(String[] args) {
		String arr[]={"a","b","c","z","f","g","m"};
		
		int max=0;
		String str="";
		for(int i=0;i<arr.length;i++){
			String s=arr[i];
			int sum=0;
			for(int j=0;j<s.length();j++){
				char c=s.charAt(j);
				sum+=(int)c;
				}
			if(sum>max){
				max=sum;
				str=s;
				
			}
			
		}
		System.out.println(str);

	}

}