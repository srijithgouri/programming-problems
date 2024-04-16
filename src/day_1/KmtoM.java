package day_1;

public class KmtoM {

	public static void main(String[] args) {
		System.out.println(getkm(10000));
		System.out.println(getmeters(30));
			}
			public static String getkm(double x) {
				double km=x/1000;
				return km+" = Killometers";
			}
			public static String getmeters(double y) {
				double meters=y*1000;
				return meters+" = meters";
	}

}
