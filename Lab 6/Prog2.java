package com.cg.iter;

import java.util.*;
import java.io.*;

class Prog2 {
	public static void main(String args[]) throws IOException {
		int j = 1;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter File name: ");
		String str = sc.next();
		FileInputStream f1 = new FileInputStream(str);
		System.out.println("\nContents of the file are-");
		int n = f1.available();
		System.out.print(j + ": ");
		for (int i = 0; i < n; i++) {
			//System.out.print(j + ": "+ch);
		//System.out.print(j + ": ");
			ch = (char) f1.read();
			System.out.print(ch);
			
			if (ch == '\n') {
				System.out.print(++j + ": ");
				//j++;

			}
			//else break;

		}
	}
}