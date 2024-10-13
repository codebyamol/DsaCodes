package com.amol.basic.math;

//https://leetcode.com/subscribe/?ref=qd3_pq&eventName=question_slug&event=armstrong-number
public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		boolean isArmstrongNumber =isNumArmstromg(num);
		System.out.println("Is num armstrong: "+isArmstrongNumber);
	}

	private static boolean isNumArmstromg(int num) {
		// TODO Auto-generated method stub
		int actualNum=num;
		int newNum=0;
		while(num!=0) {
			int digit =num%10;
			newNum=(digit*digit*digit)+newNum;
			num/=10;
		}
		return actualNum==newNum;
	}
}
