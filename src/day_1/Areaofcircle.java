package day_1;

public class Areaofcircle {


	public static void main(String[] args) {
		System.out.println(getArea(5));
		System.out.println(getAreas(4));
getarea(4);
	}
	public static String getArea(double R) {
		double area=R*R*3.14;
		return "The area is:"+area;
	}
	public static void getarea(double r) {
		double area=r*r*3.14;
		System.out.println("The area is:" +area);
	}
	public static String getAreas(double R) {
		double area=R*R*3.14;
		return ""+area;
	}
}
