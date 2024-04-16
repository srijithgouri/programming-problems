package stringproblems;

public class Abc {

	public static void main(String[] args) {
		System.out.println(getvalues("Abdgt"));
		System.out.println(getvalues1("Abdgt"));

	}
	public static String getvalues(String str){
		String s="";
		for(int i=0;i<str.length();i++){
		 s=s+(char)(str.charAt(i)+1);
			
		}
		return s;
	}
	public static String getvalues1(String str){
		String s="";
		for(int i=0;i<str.length();i++){
			char c=(char)(str.charAt(i)+1);
			s+=c;
		}
		return s;
	}
}
