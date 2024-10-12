package com.amol.basic.math;

//Problem Statement: Given an integer N, return the number of digits in N.
public class CountDigits {

	public static void main(String[] args) {
		int num=12120;
		int countdigits=getCounts3(num);
	}

	//brute force
	private static int getCounts(int num) {
		// TODO Auto-generated method stub
		
		int cnt=1;
		while(num>0) {
			int digit=num%10; //5
			cnt=cnt+1;
			num=num/10;
		}
		System.out.println("Count of numbers: "+cnt);
		return cnt;
	}
	
	//best
	private static int getCounts2(int num) {
		// TODO Auto-generated method stub
		
	    
	    if (num == 0) {
	        return 1; // 0 has one digit
	    }
	    
	    if (num < 0) {
	        num = -num; // Convert negative to positive for counting digits
	    }
	    
	    int cnt = (int)(Math.log10(num)) + 1;
		System.out.println("Count of numbers: "+cnt);
		return cnt;
	}
	
	//best
	private static int getCounts3(int num) {
		// TODO Auto-generated method stub
		//included leading 0's also
	    String nums=String.valueOf(num);
	    int cnt=nums.length();
	    
		System.out.println("Count of numbers: "+cnt);
		return cnt;
	}
}
