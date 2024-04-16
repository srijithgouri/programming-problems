package Arraysproblems;

public class Maxandminin2_Darrays {

	public static void main(String[] args) {
		int[][] array={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(get_matrix(array));
	}
public static String get_matrix(int[][] array) {
	String result="";
	for(int i=0;i<array.length;i++) {
		int max=array[i][0];
		int min=array[i][0];
		for(int j=0;j<array[i].length;j++) {	
			result+=array[i][j]+" ";
			if(array[i][j]>max){
				max=array[i][j];
			}
			if(array[i][j]<min){
				min=array[i][j];
			}
		}
		result+=" "+"The max is:"+max+"  "+"The min is:"+min;
		result+="\n";
	}
	return result;
}
}