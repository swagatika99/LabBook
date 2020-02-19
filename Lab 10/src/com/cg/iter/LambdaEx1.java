package com.cg.iter;


import java.util.function.*;
import java.util.Scanner;

public class LambdaEx1{

	public static void main(String[] args) {
		new LambdaEx1();
	}

	public LambdaEx1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x :");
		int x = sc.nextInt();
		System.out.println("Enter the value of y :");
		int y = sc.nextInt();
		BiFunction <Integer,Integer,Integer> fn = (a,b)-> (int)Math.pow(a,b);
		System.out.println("x^y = "+ fn.apply(x,y));
	}

}
