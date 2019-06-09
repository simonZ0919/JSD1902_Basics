package oopBasics;

public class Test_Exercise {
	public static void main(String[] args) {
		Person[] ps=new Person[3];
		ps[0]=new Teacher("Tom", 26, "MO", 6000);
		ps[1]=new Teacher("Dennis", 50, "COMU", 8000);
		ps[2]=new Doctor("Scholl", 60, "NY", 1);
		for (int i = 0; i < ps.length; i++) {
			ps[i].printInfo();
		}
	}
}

class Person{
	String name, address;
	int age;
	Person(String name, int age, String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	void printInfo() {
		System.out.println("name:"+name+"\tage:"+age+
				"\taddress:"+address);
	}
}

class Teacher extends Person{
	int salary;
	Teacher(String name, int age, String address, int salary ){
		super(name, age, address);
		this.salary=salary;
	}
// override printInfo
	void printInfo() {
		System.out.println("name:"+name+"\tage:"+age+
				"\taddress:"+address+"\tsalary:"+salary);
	}
}

class Doctor extends Person{
	int level;
	Doctor(String name, int age, String address, int level){
		super(name, age, address);
		this.level=level;
	}
	void printInfo() {
		System.out.println("name:"+name+"\tage:"+age+
				"\taddress:"+address+"\tlevel:"+level);
	}
}