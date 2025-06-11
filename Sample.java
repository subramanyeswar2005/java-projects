package javaprojects;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("===============");
		String s=sc.next();
		int x=sc.nextInt();
		for (int i=0;i<3;i++) {
			System.out.printf("%-15s%03d%n",s,x);
		}
		System.out.println("===============");
		sc.close();

	}

}
