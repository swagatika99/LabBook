package com.cg.iter;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter numbers to array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        HashMap<Integer, Integer> hMap =getSquares(arr);
        //print the sorted values List
        System.out.println(hMap);
    }
	private static HashMap<Integer, Integer> getSquares(int[] arr) {
		
		HashMap<Integer, Integer> hMap= new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hMap.put(arr[i], arr[i]*arr[i]);
		}
		return hMap;
		
	}
	
    
}