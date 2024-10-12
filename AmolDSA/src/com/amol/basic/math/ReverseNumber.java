package com.amol.basic.math;

//Problem Statement: Given an integer N return the reverse of the given number.
public class ReverseNumber {

	public static void main(String[] args) {
		//int num=-2147483412;  // if you add any 0 leading then it will be octal
		int num=-2147483648;//2147483647;
		int reverseNumber=getReverseNumber(num);
		
		System.out.println("Reverse Number: "+reverseNumber);
	}

	private static int getReverseNumber(int num) {
		// TODO Auto-generated method stub
		// 8765 - inp
		// 5678 - out
		int reverseNumber=0;
		while(num!=0) {
			int lastDigit=num%10; //5
			//System.out.println("Reverse Number: "+reverseNumber);
			num=num/10;
			// Check if reversing the number will cause overflow
	        if (reverseNumber > Integer.MAX_VALUE / 10 || reverseNumber < Integer.MIN_VALUE/10) {
	            System.out.println("Overflow detected!");
	            return 0;  // Return 0 if overflow is detected
	        }
			reverseNumber=reverseNumber*10+lastDigit; //5, 50+6, 560+7, 5670+8;
			
		}

		return reverseNumber;
	}
}
