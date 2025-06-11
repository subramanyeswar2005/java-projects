package javaprojects;

import java.util.Arrays;

public class BubblaSorting {
	public static void main(String[]args) {
		int[]nums= {7,2,4,1,5,6,3,8};
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if (nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println("sorted list");
		for(int num:nums) {
			System.out.println(num);
		}
		System.out.println(Arrays.toString(nums));
		
	}
	
}