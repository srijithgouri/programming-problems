package stringproblems;

import java.util.ArrayList;
import java.util.List;

public class LibaryBooks {

	public static void main(String[] args) {
		String username="Srijith";
//	String username=null;
		List<String> borrowedBooks= new ArrayList<String>();
   borrowedBooks.add("Book1");
   borrowedBooks.add("Book2");
   if(username==""||username==null){
	   System.out.println("Invalid user");
   }
   else if(borrowedBooks.isEmpty()){
	   System.out.println("No books borrowed");
   }else{
  String str="user:"+username+"-";
 int i;
  for( i=0;i<borrowedBooks.size()-1;i++){
		  str+=borrowedBooks.get(i)+",";
  }
  str+=borrowedBooks.get(i);
	   System.out.println(str);
   }
   
	}

}