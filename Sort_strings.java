package javaprojects;
import java.util.ArrayList;
import java.util.*;
public class Sort_strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<>();
		al.add("subbu");
		al.add("amith");
		al.add("balu");
		al.add("nikhil");
		al.add("mohan");
		al.add("dada");
		Collections.sort(al);
		System.out.println(al);
	}
}
