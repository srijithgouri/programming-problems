package Arraysproblems;

public class DuplicateBetweenSlace {

	public static void main(String[] args) {
		String str="aasbbhjkkmngggl";
		String s="";
		for(int i=0;i<str.length()-1;i++){
			System.out.println(i);
			if(str.charAt(i)==str.charAt(i+1)){
				s+=str.charAt(i)+"-"+str.charAt(i+1);
				
                i++;
             // System.out.println(i);
				if(str.length()-2==i){
					s+=str.charAt(i+1);
				}
			}
			else{
				s+=str.charAt(i);
			}
			}
		System.out.println(s.toString());

	}

}
