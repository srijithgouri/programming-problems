package day_3;

public class Speedanddistance {

	public static void main(String[] args) {
		getMpersec(10000,1,2,60);
        getkmperhr(10,1,2,60);
        getMileperkm(8,1,2,60);
	}
	public static void getMpersec(double meters,double h,double m,double s) {
		double total_sec=(h*3600)+(m*60)+(s);
		double speed=meters/total_sec;
		System.out.println(speed+": Meter/sec");
	}
	public static void getkmperhr(double km,double h,double m,double s) {
		double total_hours=(h/1)+(m/60)+(s/3600);
		double speed=km/total_hours;
		System.out.println(speed+": KMPH");
	}
	public static void getMileperkm(double meters,double h,double m,double s) {
		double total_hours=(h/1)+(m/60)+(s/3600);
		double speed=(meters/1609)/total_hours;
		System.out.println(speed+":Mile/hour");

	}

}
