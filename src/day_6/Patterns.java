package day_6;

public class Patterns {

		public static void main(String[] args) {
			System.out.println(getRightangle(5));
			System.out.println(getReverseRightangle(5));
			System.out.println(getPyramid(5));
			System.out.println(getRightangle123(5));
			System.out.println(get_A(5));
			System.out.println(get_B(5));
			System.out.println( get_Patters_1_0(5));

		}
	public static String getRightangle(int n) {
		String result="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				result=result+"*";
			}
			result=result+"\n";
		}
		return result;
	}
	public static String getReverseRightangle(int n) {
		String result="";
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				result=result+"*";
			}
			result=result+"\n";
		}
	              return result;
	}
	public static String getPyramid(int n) {
		String  result="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				result=result+" ";
			}
				for(int j=1;j<=i;j++) {
					result=result+"*"+" ";
			
			}	
			result=result+"\n";	
		}
		return result;
	}
	public static String getRightangle123(int n) {
		String  result="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				result=result+" ";
			}
				for(int j=1;j<=i;j++) {
					result=result+j;
			
			}	
			result=result+"\n";	
		}
		return result;
	}
	public static String get_A(int n) {
		String result="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if(i==1||j==1||j==5||(i==n/2+1)) {
					result=result+"A";
				}else {
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String get_B(int n) {
		String result="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if((i==1&&j<n)||(i==5&&i<n)||j==1||j==5||(i==n/2+1&&i<n)) {
					result=result+"*";
				}else {
					result+=" ";
				}
			}
			result+="\n";
	}
		return result;
	}
	public static String get_Patters_1_0(int n) {
		String result="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i){
					result=result+" * ";
				}else{
					result+=" 0 ";
				}
			}
			result=result+"\n";
		}
		return result;
	}
}
