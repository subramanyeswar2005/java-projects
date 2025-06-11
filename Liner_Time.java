package javaprojects;

public class Liner_Time {

	public static void printFirstElement(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.println("element "+ i +" :"+ arr[i]);
		}
	}
	public static void main(String[]args) {
		int [] nums= {48,42,38,59,78,46,95,84,66,82};
		printFirstElement(nums);
	}

}
