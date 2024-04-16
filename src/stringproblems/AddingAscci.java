package stringproblems;

public class AddingAscci {

	public static void main(String[] args) {
//System.out.println(getAscii("talent"));
System.out.println(getAccii("talent"));
	}
	public static String getAscii(String str){
		int temp=0;
		int sum=0;
		for(int i=0;i<str.length();i++){
			temp=(int)(str.charAt(i));
			sum+=temp;
		}
		return sum+"";
	}
	public static String getAccii(String str){
		int sum=0;
		for(int i=0;i<str.length();i++){
			sum+=str.charAt(i);
		}
		return sum+" ";
				}

}
