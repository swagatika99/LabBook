package com.cg.iter;


import java.util.function.*;

import java.util.Scanner;

public class LambdaEx2 {

	public static void main(String[] args) {
		new LambdaEx2();
	}

	public LambdaEx2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = sc.nextLine();
		Function<String,String> fn = str->str.replaceAll("", " ").trim();
		System.out.println(fn.apply(s));
	}

}
