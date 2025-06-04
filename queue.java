package javaprojects;

import java.util.Queue;
import java.util.LinkedList;


public class queue {
	public static void main(String[]args) {
		Queue<String> st=new LinkedList<>();
		st.add("std 1");
		st.add("std 2");
		st.add("std 3");
		st.add("std 4");
		System.out.println("stds:"+ st);
		/*for (int i=1;i<=4;i++) {
			System.out.println("\n pricessing state:"+st.poll());
			System.out.println("updated state:"+st);
		
			
		}
		//System.out.println("\n pricessing state:"+st.poll());
		//
		System.out.println("updated state:"+st);*/
		while(!st.isEmpty()) {
			String user=st.poll();
			System.out.println("\n pricessing state:"+user);
			System.out.println("updated state:"+st);
		
		}
	}

}
