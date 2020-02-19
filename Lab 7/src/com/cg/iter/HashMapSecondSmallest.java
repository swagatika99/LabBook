package com.cg.iter;

import java.util.ArrayList;
import java.util.Collections;

public class HashMapSecondSmallest {

	public static void main(String[] args) {
		int arr[]= {12,5,64,78,1,48,95};
        int output =getSecondSmallest(arr);
        //print the sorted values List
        System.out.println("Second Smallest Element : "+output);
    }
	private static int getSecondSmallest(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		//System.out.println(list);
		return list.get(1);
		
	}

	
    
}