package com.amol.basic;

public class Armstrong_Cube {
//153= 1^3+5^3+3^3;
	
	public static void main(String[] args) {
		int num=370;
        chkArmstrong(num);
	}
	
	static boolean chkArmstrong(int num) {
		
		int sum=0;
		int temp=num;
		
		while(num>0) {
			int rem=num%10;
			sum+=rem*rem*rem;
			num/=10;

		}
		if(sum==temp) {
			System.out.println("Num is Armstrong");
			return true;
		}else {
			System.out.println("Num is not Armstrong");
		}
		return false;
	}
}
