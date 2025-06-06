package javaprojects;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_of_cartoons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<>();
		name.add("subbu");
		name.add("nithin");
		name.add("sreedhar");
		name.add("shiva");
		name.add("mohan");
		System.out.println(name);
		System.out.println(name.remove("subbu"));
		name.set(3,"sai");
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
		
	}

}
