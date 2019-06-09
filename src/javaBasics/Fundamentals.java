// Java project->package->class(capital chars)
package javaBasics;//declare a package
import java.util.Scanner;// Include Scanner library
import java.util.Arrays;// operation on arrays
public class Fundamentals {
// main function
	public static void main(String[] args) {
// ""+:concatenate string, println(): new line, print(): same line
	System.out.print(""+10+60+"\n");// 1060
	long tb=System.currentTimeMillis();// current time, long type
// User input through scanner
	Scanner scanner=new Scanner(System.in); 
// -------------------------------------------------
// find leap year, "\t": tab
	System.out.println("Please input a year:");
	int year=scanner.nextInt();	// get  a input
// &&, ||: short circuit principle, &|,
	boolean isLeap=(year%4==0 && year%100!=0 ||year %400==0);
// boolean ? option1: option2
	System.out.println(year+" "+(isLeap ? "is":"is not")+" leap year");
//---------------------------------------------------
// find prime number between 2-100
	boolean isprime;
	for (int i = 2; i < 100; i++) {
		isprime=true;
		for (int j = 2; j!=i; j++) {
			if (i%j==0) {
				isprime=false;
				break;
				}
		}
		if (isprime)
			System.out.print(i+" ");
	}
	System.out.println();
//---------------------------------------------------
// array: reference type, type[] array=new type[n], default initialize to 0
	int[] arr1=new int[10];// or int arr1[]...
	int[] arr2= {2,6,5,8};	
	int [] arr3=new int[] {2,3,5,8};
	arr3=new int[] {3,5,9};   // error: arr2={3,5,9}	
// -------------------------------------------------
// Exercise1, find and print the minimum number in first place 
// traverse arr1, arr1.length: size of array, 0<=index<=arr1.length-1
	for (int i = 0; i < arr1.length; i++) {
		arr1[i]=(int)(Math.random()*100+1);// random number between 1-100, Math.random(): 0-0.999...
		System.out.print(arr1[i]+"\t");
	}
// find minimum number
	int min=arr1[0];
// range for: for each 
	for (int ia : arr1) {
		if (min>ia)
			min=ia;
	}
	System.out.println("\nMinium number: "+min);
// copy array, System.arraycopy(more efficient), Arrays.copyOf(change length)
	int[] arrNew=new int[arr1.length+1];
	System.arraycopy(arr1, 0, arrNew, 1, arr1.length);// copy to arrNew[1]
	arrNew[0]=min;
	for (int a : arrNew) {
		System.out.print(a+"\t");
	}
//-------------------------------------------------------------
// sort array: Arrays.sort(arr), ascending order, bubble sort
	arr1=Arrays.copyOf(arr1, arr1.length+2); // enlarge size +2
	for (int i = 0; i < arr1.length-1; i++) {
		for (int j = 0; j < arr1.length-1-i; j++) {
			if (arr1[j]>arr1[j+1]) {
				int tmp=arr1[j];
				arr1[j]=arr1[j+1];
				arr1[j+1]=tmp;
			}
		}
	}
	System.out.println();
	for (int j : arr1) {
		System.out.print(j+"\t");
	}	
// print ellapsed time 
	long te=System.currentTimeMillis();
	System.err.println("ellapse time: "+(te-tb));
	scanner.close();
	}
}
