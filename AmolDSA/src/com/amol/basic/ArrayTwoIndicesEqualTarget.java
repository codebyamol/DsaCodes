package com.amol.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwoIndicesEqualTarget {

	public static void main(String[] args) {
		System.out.println("Enter the suze of Array: ");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		System.out.println("Enter the array number: ");
		int arr[]= new int[size];

		for (int i = 0; i < arr.length; i++) {
           arr[i]=scanner.nextInt();
		}
		System.out.println("Array is : "+Arrays.toString(arr));
        
		System.out.println("Target Number is : ");
		int target=scanner.nextInt();
		int twoSumArr[]=twoSum(arr,target);
		
	}
	
    public static int[] twoSum(int[] nums, int target) {
		int[] arr=new int[2];
        for (int i = 0; i < nums.length; i++) {
			 int temp=nums[i];
        	for (int j = i+1; j < nums.length; j++) {
        		int add=temp+nums[j];
				if(add==target) {
					System.out.println("Target and add variable is same: "+add);
					System.out.println("Two Indices are: "+i+" and: "+j);
					arr[0]=i;
					arr[1]=j;
					return arr;
				}
			}
		}
        System.out.println("No sum of two indices equal to target");
    	return arr;
    }

}
