package javaprojects;

import java.util.Arrays;
import java.util.Scanner;

public class Srerch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]names= {"Amit","Divya","Karan","Priya","Zoya"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the namesto search");
		String subbu=sc.next();
		int index=Arrays.binarySearch(names,subbu);
		if (index>=0) {
			System.out.println(subbu+" "+" found at index"+index);
		}
		else {
			System.out.println(subbu+" "+"not found at index.");
		}

	}

}
