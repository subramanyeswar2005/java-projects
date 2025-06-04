package javaprojects;
import java.io.*;
import java.util.Scanner;

public class polindrome {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a string");
	String a=sc.next();
	String reverse = new StringBuilder(a).reverse().toString();
	if(a.equals(reverse)) {
		System.out.println("\n it is a polindrome");
	}
	else {
		System.out.println("\n not a polindrme");
	}
	
	}
}
