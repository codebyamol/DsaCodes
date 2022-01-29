package com.amol.basic;

import java.util.Arrays;

public class SumPlusArray {
	public static void main(String[] args) {
		int nums[]= {9,9};
		System.out.println("Changed Array: "+Arrays.toString(plusOne(nums)));
	}

	public static int[] plusOne(int[] digits) {
		int length=digits.length;
		int num=0;
		int[] arrResponse = null;
		for (int i = length-1; i >=0; i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}else {
				digits[i]=0;
			}
		}
		arrResponse=new int[length+1];
		arrResponse[0]=1;
        
		return arrResponse;

	}




	//if {9,9} then it failed
	/*
	 * public static int[] plusOne(int[] digits) {
	 * 
	 * int[] arrResponse; int len=digits.length;
	 * 
	 * if(digits[len-1]==9) { arrResponse=new int[len+1]; arrResponse[len-1]=1;
	 * arrResponse[len]=0; }else { arrResponse=new int[len];
	 * arrResponse[len-1]=digits[len-1]+1; }
	 * 
	 * for (int i = 0; i < len-1; i++) { arrResponse[i]=digits[i]; } return
	 * arrResponse;
	 * 
	 * }
	 */
}
