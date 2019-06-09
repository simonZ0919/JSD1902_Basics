package oopBasics;

public class TestMain {

	public static void main(String[] args) {
// create a object and use class members
		Student Josh=new Student("Josh",22,"Shanghai");
		Student Mary=new Student("Mary", 20);
		Student Bob=new Student("Bob");
		Josh.printInfo();
// ------------------------------
		Bob=Mary;		// point to same object in heap
		Mary.age=25;
		System.out.println(Bob.age);
		Mary=null;		// null:point to no object 
		System.out.println(Mary.age);// throw NullPointerException 
// -------------------------------------
// reference array
		Student[] stduArr=new Student[3];
		stduArr[0]=new Student("Josh",22,"Shanghai");
		stduArr[1]=new Student("Mary",20);
		stduArr[2]=new Student("Bob");
// alternative way
		Student[] stduArrAll=new Student[] {
				new Student("Josh", 22, "Shanghai"),
				new Student("Mary",20),
				new Student("Bob")};
// arrays of array
		int [][] arr=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
// traverse the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=2;
			}
		}
// -----------------------------------------
		Aoo obj=new Boo(); // obj has members of Aoo
		int num=6;
// create anonymous inner subclass, object c1, {}:class body
		Coo c1=new Coo() {
// must override abstract super class
			void show() {
				System.out.println(num);// jdk<1.8, num:final
			}		
		};

	}
}
//---------------------------------------------
	class Aoo {
		int val;
		Aoo(int val){
			this.val=val;
		}
	}
// Boo inherits Aoo
	class Boo extends Aoo{
		int num;
		Boo() {
			super(3);// implicit super() not exist, must define given constructor
		}
	}
// abstract class: must be inherited, can not create instant object 
abstract class Coo {
	abstract void show();
}
