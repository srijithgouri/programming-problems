package stringproblems;

public class UpperCaseToLowerCase {
    public static void main(String[] args) {
    	
//    	Approch -1
        String str = "hjfrgFLIWgWjlsjk";
        System.out.println(getUpper(str));
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            result.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }

        System.out.println(result.toString());
    }
//    APproch -2
    public static String getUpper(String str){
    	String s="";
    	for(int i=0;i<str.length();i++){
    		if(Character.isUpperCase(str.charAt(i))){
    			s+=Character.toLowerCase(str.charAt(i));
    		}else{
    			s+=Character.toUpperCase(str.charAt(i));
    		}
    	}
    	return s;
    }
}

