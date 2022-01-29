package com.amol.basic;

public class Palimdrone {

	public static void main(String[] args) {
		String str="AMADMA";
		System.out.println(str+" is palimdrone?: "+isPalimdrone(str));
	}

	public static boolean isPalimdrone(String str) {

		//decide start end end position
		int start=0;
		int end=str.length()-1;
		int count=0;
		int compare=str.length()/2;
		while(start<=compare) {
			if(str.charAt(start)!=str.charAt(end)) {
				System.out.println("String is not palimdrone:");
				return false;
			}
			start++;
			end--;
			//count++;
		}
		System.out.println("String is palimdrone");
		return true;		
	}
}
