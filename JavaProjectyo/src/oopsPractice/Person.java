package oopsPractice;

public class Person {
	
	// Oops concept - 1. Encapsulation 

 private String name;
 private int age;
 

  
 public String getName() {
	return name;
}
 public void setName(String name) {
	this.name = name;
}
 public int getAge() {
	return age;
}
 public void setAge(int age) {
	this.age = age;
}

 public static void main(String[] args) {
	
	 Person obj = new Person();
	 obj.setName ("Sudya");
	 obj.setAge (25);
	 System.out.println(obj.getName());
	 System.out.println(obj.getAge());
}
 
 }
 

