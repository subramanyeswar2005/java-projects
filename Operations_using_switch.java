package javaprojects;
import java.util.*;
import java.util.Scanner;

public class Operations_using_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number : ");
		int a=sc.nextInt();
		System.out.println("enter the second number : ");
		int b=sc.nextInt();
		boolean flag = true;
		while(flag) {
		System.out.println("arithmetic operations");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.multiply");
		System.out.println("4.div");
		System.out.println("5.exiting the program");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("result :" + (a+b));
				break;
			case 2:
				System.out.println("result :" + (a-b));
				break;
			case 3:
				System.out.println("result :" + (a*b));
				break;
			case 4:
				if(b!=0) {
				System.out.println("result :" + (a/b));
				}
				else {
					System.out.println("zero division error");
				}
				break;
			case 5:
				System.out.println("exiting the program");
				flag=false;
				break;
			default:
				System.out.println("er");
				break;
		}
		}
		if(!flag) {
			System.out.println("Exited");
	}
	}

}
