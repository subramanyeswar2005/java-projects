package javaprojects;

import java.util.TreeMap;

public class Treemap {
	public static void main(String[]args) {
		TreeMap <String,String> tre=new TreeMap<String,String>();
		tre.put("INDIA","NEW DELHI");
		tre.put("USA","WASHINGTON");
		tre.put("GERMANY","BERLIN");
		tre.put("JAPAN","TOKYO");
		tre.put("INDIA","DELHI");
		System.out.println(tre);
	}

}
