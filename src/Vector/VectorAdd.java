package Vector;

import java.util.Vector;

public class VectorAdd {

	public static void main(String[] args) {
		Vector v1= new Vector();
		v1.add("srijith");
		v1.add("Rohith");
		v1.add("sumanth");
		v1.add("Giri");
		Vector v2 = new Vector();
		v2.add("Akhil");
		v2.add("mani");
		for(int i=0;i<v1.size();i++){
		    v2.add(v1.get(i));
		    
		}
		System.out.println(v2);
	

	}


}
