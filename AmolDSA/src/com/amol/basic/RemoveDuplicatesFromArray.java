package com.amol.basic;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int arr[]= {0,0,1,1,1,2,2,2,2,2,3,3,4};
//		int duplicateNumbers=getArrayWithoutDuplicates(arr);
//		System.out.println("Arr is: "+Arrays.toString(arr));

		System.out.println("Duplicates Number: "+removeDuplicates(arr));
		System.out.println("Arr is: "+Arrays.toString(arr));
	}

	private static int getArrayWithoutDuplicates(int[] arr) {
		int left=1;
		int dupliacateNumber=0;
		int arrLength= arr.length;
		for (int right =1 ; right < arrLength; right++) {
			if(arr[right]!=arr[right-1]) {
				arr[left]=arr[right];
				left++;
			}else {
				dupliacateNumber++;
				System.out.println("Duplicate No is: "+arr[right]);
			}
		}
		
		System.out.println("Duplicate Numbers are: "+dupliacateNumber);
		return dupliacateNumber;
	}
	
	
	   public static int removeDuplicates(int[] nums) {
		    if (nums.length == 0) return 0;
		    int i = 0;
		    for (int j = 1; j < nums.length; j++) {
		        if (nums[j] != nums[i]) {
		            i++;
		            nums[i] = nums[j];
		        }
		    }
		    return i + 1;
		}
}
