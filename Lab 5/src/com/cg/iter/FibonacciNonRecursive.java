package com.cg.iter;

/*Non Recursive Solution*/
import java.util.Scanner;
class FibonacciNonRecursive {
	
	
	public static void main(String args[ ]) {
		Scanner sc=new Scanner(System.in);
		int i,a=1,b=1,n;
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		System.out.println(n+"th value of the series is: "+fibo(n));

	}

	private static int fibo(int n) {
		if(n<=1)
		return n;
		if(n==2)
			return 1;
		int i,a=1,b=1;
		for(i=0;i<n-2;i++) {
		int c=a+b;
			a=b;
			b=c;
		}
		return b;
		
	}
}