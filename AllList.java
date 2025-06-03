package javaprojects;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


class student{
	public void arrayList(){
		ArrayList<String> a =new ArrayList<String>();
		a.add("nithin");
		a.add("subbu");
		a.add("sreedhar");
		System.out.println(a);
	}
	public void linkedList(){
		LinkedList<String> b=new LinkedList<String>();
		b.add("nithaya");
		b.add("sai");
		b.add("raghu");
		System.out.println(b);
	}
	public void hashMap() {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"virat");
		hm.put(2,"salt");
		hm.put(3,"rajat");
		System.out.println(hm);
	}
	public void hashset(){
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(4);
		hs.add(5);
		hs.add(6);
		System.out.println(hs);
	}
}
public class AllList {
	public static void main(String[] args) {
		student s=new student();
		s.arrayList();
		s.linkedList();
		s.hashMap();
		s.hashset();
		System.out.println(s);
	}

}
