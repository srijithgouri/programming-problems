package stringproblems;

import java.util.*;
public class IbmQuestion
{
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the List size:  ");
	    int n=sc.nextInt();
	   // sc.nextLine();
	    ArrayList<String> list = new ArrayList<>();
	    System.out.println("Enter the List:  ");
	    for(int i=0;i<n;i++){
	        String str=sc.nextLine();
	        list.add(str);
	    }
	    System.out.println("Enter the K value:  ");
	    int k=sc.nextInt();
	    ArrayList<String>list2 = new ArrayList<>(); /// rohith  mani akhil  
	    for(int i=list.size()-1;i>=0;i--){
	        if(list2.size()<k){
	            if(list2.contains(list.get(i))){
	                continue;
	            }else{
	                list2.add(list.get(i));
	            }
	        }else{
	            break;
	        }
	    }
	    System.out.println(list2);
	}
}
