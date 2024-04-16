package stringproblems;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String arr[]={"flower","flow","flight","flash"};
		if(arr.length==0){
			System.out.println("");
		}
		String prefix=arr[0];
		for(int i=1;i<arr.length;i++){
			while(arr[i].indexOf(prefix)!=0){
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
System.out.println(prefix);
	}
}