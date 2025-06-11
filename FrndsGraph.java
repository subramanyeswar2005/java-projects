package javaprojects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrndsGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String>>graph=new HashMap<>();
		graph.put("alice",Arrays.asList("bob"));
		graph.put("bob",Arrays.asList("alice","charile"));
		graph.put("Charlie",Arrays.asList("bob"));
		for(String person:graph.keySet()) {
			System.out.println(person+" "+" is friends with"+graph.get(person));
		}
	}

}
