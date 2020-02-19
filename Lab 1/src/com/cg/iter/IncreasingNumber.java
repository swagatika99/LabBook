package com.cg.iter;

import java.util.*;

public class IncreasingNumber {
	static boolean checkNumber(String input)
	{
		 
	        char array[]=input.toCharArray();
	        Arrays.sort(array);
	        String check = String.valueOf(array);
	        if(input.equals(check)){
	        	
	            return true;
	        }
	        else{
	            
	            return false ;
	        }
			
	       
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = sc.nextLine();
       
       if(checkNumber(input))
    	   System.out.println("Its a increasing number");
       else
    	   System.out.println("Its a non increasing number");
        
    }
}