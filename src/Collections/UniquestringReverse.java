package Collections;
//IBM exam question.
import java.util.ArrayList;
import java.util.Scanner;

public class UniquestringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list size:  ");
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter the List: ");
		for(int i=0;i<n;i++){
			String str=sc.nextLine();
			list.add(str);
		}
//		list.add("srijith");
//		list.add("rohith");
//		list.add("akhil");
//		list.add("main");
//		list.add("srijith");
		System.out.println("Enter K value: ");
		int k=sc.nextInt();
//		int k=3;
		ArrayList<String> list2=new ArrayList<>();
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
