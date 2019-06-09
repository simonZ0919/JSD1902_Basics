package javaBasics;

import java.util.Scanner;

public class GuessingGame {
//-------------------------------------------
// generate unique random chars
	public static char[] generate(int level) {
		char[] keys=new char[level];
		boolean[] flags=new boolean[26];
		for (int i = 0; i < keys.length; i++) {
			int index;
			do {
				index=(int)(Math.random()*26);
			} while (flags[index]);
			flags[index]=true;
			keys[i]=(char)(65+index);			
		}
		return keys;	
	}		
// --------------------------------------------
// compare correct chars and sent result
	public static int[] check(char[] keys,char[] input) {
// result[0]=total correct chars, result[1]= correct locations
		int[] result=new int[2];
		for (int i = 0; i < keys.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (keys[i]==input[j]) {
					result[0]++;
					if(i==j)
						result[1]++;
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to gussing game!");
		int level=5,count=0;
// user select level(array length)
		do {
			System.out.print("Please enter game level(5,7,9): ");
			level=scanner.nextInt();
		} while (level!=5&&level!=7&&level!=9);
		char[] keys=generate(level);
		System.out.println(keys);// println can print char[]
		while (true) {
			System.out.println("Please guess:  (quit--exit game)");
			String str=scanner.next().toUpperCase();// convert to upper case
			if (str.equals("QUIT")) {
				System.out.println("exit game");
				break;
			}
			char[] input=str.toCharArray();// convert string to char[]
			int[] result=check(keys, input);
			if(result[0]==keys.length) {
				int score=50*keys.length-count*10;
				System.out.println("Answer is correct!"+"\t"+
				"Your score is:"+score);
				break;
			}
			else {
				count++;
				System.out.println("Correct chars:"+result[0]+"\t"+
						"correct positions:"+result[1]);
			}
		}
		scanner.close();
	}
}
