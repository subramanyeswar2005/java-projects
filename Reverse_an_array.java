package javaprojects;

import java.util.Arrays;

public class Reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,8,3,9,5,4};
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println("sorted array : "+Arrays.toString(arr));

	}

}
