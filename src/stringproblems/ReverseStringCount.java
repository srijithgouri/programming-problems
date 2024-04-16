package stringproblems;

public class ReverseStringCount {

	public static void main(String[] args) {
		String str="srijith";
		int count=0;
		 int index=0;
		String s="";
		String str1="";
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==sb.charAt(i)){
				count++;
			}
		}
		System.out.println(count);
//		Second approch;
		for(int i=0;i<str.length();i++){
			s=str.charAt(i)+s;
		}
		for(int j=0;j<s.length();j++){
			if(s.charAt(j)==str.charAt(j)){
				index++;
				str1=s.charAt(j)+str1;
			}
			
		}
		System.out.println(index);
		System.out.println(str1);
	}
	

}