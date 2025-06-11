package javaprojects;
import java.util.*;
public class Ex{
    public static void main(String[]args){
        int[] nums = {5,3,8,2,6,};
        for (int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("bubble sorting :");
        printarr(nums);
        }
        public static void printarr(int[]nums){
            for(int num : nums){
                System.out.println(num+" ");
            }
            System.out.println();
            
        }
}