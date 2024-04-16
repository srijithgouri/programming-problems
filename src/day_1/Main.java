package day_1;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello Srijith");
		Main animals=new Main();
		animals.eat();
		animals.walk();
		Birds sp = new Birds();
		sp.fly();
		sp.wings();
	}
	public void eat(){
	    System.out.println("Animals can eat");
	}
	public void walk(){
	    System.out.println("Animals can walk");
	}
}
 class Birds{
    public void fly(){
        System.out.println("Birds can fly");
    }
    public void wings(){
        System.out.println("Birds can wings");
    }
}