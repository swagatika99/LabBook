package com.cg.iter;

import java.util.Scanner;

public class SumOfCubes {

	public static int Sum(int number) {
		int sum=0,c=0;
		while(number>0){
		    int t= number%10;
		    sum=sum+(t*t*t);
		    c = c+1;
		    number = number/10;

		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many digit number you want to take :");
		int n=sc.nextInt();
		System.out.println("Enter that " + n + " digit number :");
		int  number=sc.nextInt();
		System.out.println("The sum of the cubes of the digits of an " + n + " digit number :" +Sum(number));
	}

}
