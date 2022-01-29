package com.amol.basic;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		int[] nums= {0,1,2,3,2,4,2};
		int val=2;
		System.out.println("Without value number count: "+removeElement(nums, val));

	}

	public static int removeElement(int[] nums, int val) {

		int i=0;
		int len= nums.length;
		for (int j = 0; j <len; j++) {
			if(nums[j]!=val) {
				nums[i]=nums[j];
				i++;
			}
		}

		return i;

	}
}
