package com.amol.basic;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayIntoShortArray {

	public static void main(String[] args) {
		//		int[] nums= {0,0,1,2,4,5,7,8,10};
		int[] nums= {-1};

		List<String> list=giveShortArrayIndexList(nums);
	}

	private static List<String> giveShortArrayIndexList(int[] nums) {
		List<String> shortedIndexList=new ArrayList<String>();
		int start=0;
		int end=0;
		int i=0;
		int j=1;
		int len=nums.length;
		if(len==1) {
			System.out.println(nums[start]);
			shortedIndexList.add(nums[start]+"");
		}else {
			
			while(j<len) {

				if(nums[j]==nums[i]+1) {
					//rotate
					end=j;
					if(j==len-1) {
						end=j;
						System.out.println(nums[start]+"->"+nums[end]);
						shortedIndexList.add(nums[start]+"->"+nums[end]);
					}
					i++;
					j++; 

				}else {
					//end the array and start new array
					if(start==end) {
						System.out.println(nums[start]);
						shortedIndexList.add(nums[start]+"");
					}else {
						System.out.println(nums[start]+"->"+nums[end]);
						shortedIndexList.add(nums[start]+"->"+nums[end]);
					}
					start=j;
					end=j;
					i++;
					j++;
				}
			}

			if(start==end && start!=0) {
				System.out.println(nums[start]);
				shortedIndexList.add(nums[start]+"");
			}
		}
		return shortedIndexList;
	}
}
