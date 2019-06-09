package javaBasics;

public class IterationTest {

	public static void main(String[] args) {
		int sum=intSum(100);
		System.out.println(Bottles(20, 0, 0));
	}
	/**
	 * use iteration to sum number
	 * @param i: maximum number
	 * @return sum 
	 */
	public static int intSum(int i) {
		if (i>0) {
			int sum=i+intSum(--i);
			System.out.println(sum);
			return sum;
		}
		return 0;
	}
	/**
	 * 
	 * @param i: sum
	 * @param a: empty bottles
	 * @param b: lids
	 */
	public static int Bottles(int i, int a, int b) {
		a+=i;
		b+=i;
		if(a<2 && b<3)
			return i;
		return(i+Bottles(a/2+b/3, a%2, b%3));
	}
}



