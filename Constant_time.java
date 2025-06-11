package javaprojects;

public class Constant_time {
	public static void printFirstElement(int[] arr) {
		if(arr.length > 0) {
			System.out.println("first element : "+arr[9]);
		}
		else {
			System.out.println("Array is empty");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,85,30,56,36,95,39,57,2,38,48,59,1};
		printFirstElement(num);

	}

}
