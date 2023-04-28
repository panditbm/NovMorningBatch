package oopsPractice;

public class Car extends Vehicle {

	private String engine= "SI engine";


public static void main(String args []) {
	
	Car obj = new Car();
	obj.honk();
	System.out.println(obj.brand+","+obj.engine);

}

}
	
	

