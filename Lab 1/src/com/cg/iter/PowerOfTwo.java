package com.cg.iter;

import java.util.Scanner;

class PowerOfTwo {

	static boolean checkNumber(int n) {
		if((n&(n-1))==0  &&  n!=0)return true;
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (checkNumber(n))
			System.out.println("It's a power of 2");
		else
			System.out.println("It's not a power of 2");

	}
}
