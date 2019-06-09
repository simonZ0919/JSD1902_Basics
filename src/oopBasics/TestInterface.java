package oopBasics;

import oopBasics.TestInterface.Inter4;

// Interface: data type(reference)
public class TestInterface {
	public static void main(String[] args) {
		Inter4 o1=new Eoo();// upcasting
	}
	interface Inter1{
		double PI=3.14; // default: public static final
		void show();// default: abstract method
	}
	interface Inter2{
		void a();
		void b();
	}
	class Aoo implements Inter2{
		public void a() {}	// must be public method
		public void b() {}
	}
	interface Inter3{
		void c();
	}
// implement multiple interfaces
	class Boo implements Inter2, Inter3{
		public void a() {}
		public void b() {}
		public void c() {}
	}
	abstract class Coo{
		abstract void d();
	}
// inherit first, then implement
	class Doo extends Coo implements Inter2, Inter3{
		public void a() {}
		public void b() {}
		void d() {}		
		public void c() {}		
	}
	interface Inter4 extends Inter2,Inter3{
		void e();
	}
}
	class Eoo implements Inter4{
		public void a() {}
		public void b() {}
		public void c() {}
		public void e() {}
	}
