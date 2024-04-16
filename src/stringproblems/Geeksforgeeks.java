package stringproblems;

public class Geeksforgeeks{
	
public static void main(String[] args) {
String s = "geeksforgeeks";
char ch = 'a';
for(int i = 0;i<s.length();i++){
  int c = 0;
   for(int j=i+1;j<s.length();j++){
       if(s.charAt(i)==s.charAt(j)){
           c++;
       }
   }
   if(c==0){
       ch = s.charAt(i);
       break;
   }
}
System.out.println(ch);
}
}