package oopBasics;

public class Student {
// class members
	String name,address;
	int age;
// constructor: initialize object, this: this object
	Student(String name,int age, String address){
//this.name: member variable, name: local variable
		this.name=name;
		this.age=age;
		this.address=address;
	}
// overload constructor, this(): call the class constructor
	Student(String name, int age){
		this(name, age, null);
	}
	Student(String name) {
		this(name, 0, null);
}
// class method
	void printInfo() {
		System.out.println("name:"+name+"\tage:"+age+
				"\taddress:"+address);
	}
	
// generate getters and setters automatically
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
