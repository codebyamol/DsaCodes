package com.amol.basic.math;

//Problem Statement: Given an integer N, return true if it is a palindrome else return false.
public class PalimdromeIntegerCheck {
	public static void main(String[] args) {
		int num=121;
		boolean isPalindrome=isPalindrome(num);
		System.out.println(" Is given number Palindrome : "+isPalindrome);
	}

    public static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		// 121 - inp , If num is negative then num is not palindrome, because everese is like 121-
		// true - out
        if(num<0) {
			return false;
		}
		int currentNumber =num;
		int reverseNumber=0;
		while(num!=0) {
			int lastDigit=num%10; //5
			//System.out.println("Reverse Number: "+reverseNumber);
			num=num/10;
			reverseNumber=reverseNumber*10+lastDigit; //5, 50+6, 560+7, 5670+8;
		}
		
		return (currentNumber == reverseNumber);
    }
}
