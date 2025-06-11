package javaprojects;

import java.util.Arrays;

public class Bubble_sort_on_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]names= {"a","u","t","h","s","i","o","d"};
		for(int i=0;i<names.length-1;i++) {
			for(int j=0;j<names.length-i-1;j++) {
				if(names[j].compareTo(names[j+1])>0) {
				String temp=names[j];
				names[j]=names[j+1];
				names[j+1]=temp;
			}
			}
			System.out.println("sorted list of Strings : "+Arrays.toString(names));
			//for(String name : names) {
			//System.out.println(names+" ");
			}
		}
	}
