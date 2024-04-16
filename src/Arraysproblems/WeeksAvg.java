	package Arraysproblems;

public class WeeksAvg {
public static void main(String[] args) {
	int[] steps={5000,6000,7000,8000,5500,4000,7200};
	System.out.println(getAvg(steps));
}
public static String getAvg(int[] steps){
	int sum=0;
	float max=0;
	int index=0;
	String[] weeks={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	for(int i=0;i<steps.length;i++){
		sum=sum+steps[i];
		if(steps[i]>max){
			max=steps[i];
     		index=i;
		}
	}
	float avg=sum/steps.length;
	return "Average:"+String.format("%.2f",avg)+" "+"steps."+" "+"Max on"+" "+weeks[index]+" "+"with"+" "+String.format("%.2f",max)+" "+"steps";
}
}

