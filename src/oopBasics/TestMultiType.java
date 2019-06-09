package oopBasics;

public class TestMultiType {
	public static void main(String[] args) {
		A aoo=new B();
		B boo=(B) aoo; // B is referenced by A
		Inter1 I=(Inter1) aoo;// B implements Inter1
//		C coo=(C) aoo; ClassCast exception, B is not related to C
		if (aoo instanceof C) {// use instanceof first
			C coo =(C) aoo;
		}
	}

}
	interface Inter1{		
	}
	class A {
	}
	class B extends A implements Inter1{		
	}
	class C extends A{	
	}