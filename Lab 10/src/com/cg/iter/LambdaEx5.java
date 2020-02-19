package com.cg.iter;

import java.util.Scanner;
import java.util.function.*;

public class LambdaEx5 {
	static int fact(int num) {
		if(num==0)return 1;
		return num*fact(num-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		Function<Integer,Integer> fn = LambdaEx5::fact;
		System.out.println("Factorial of "+n+" = "+fn.apply(n));
		

	}

}
