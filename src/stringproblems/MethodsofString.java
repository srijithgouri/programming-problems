package stringproblems;

public class MethodsofString {

	public static void main(String[] args) {
		String names[]= {" srijith is good boy","rohith","giri","sumanth"};
		String name1="srijith";
//		System.out.println(get_sum(names));
		System.out.println(names[0].length());
		System.out.println(names[0].charAt(2));
		System.out.println(names[0].substring(0,3));
		System.out.println("srij".equals(name1.substring(0,4)));
		System.out.println(names[0].toUpperCase());
		System.out.println(names[0].toLowerCase());
//		trim method will remove the spaces at tail and head positions
		System.out.println(names[0].trim());
//		split function will print till u give any character ex:srijith split(j) =sri will be printed
		String[] d=names[0].split("d");
		System.out.println(d[0]);
//		it will give boolean values it will check whether it will starts will that character or not 
		System.out.println(names[0].startsWith(" "));
//		it will give boolean values it will check whether it will ends will that character or not 
		System.out.println(names[0].endsWith("y"));
		System.out.println(names[0].indexOf("g"));
		System.out.println(names[0].replace("i","ee"));
		System.out.println(names[0].isEmpty());
	}
}