package javaprojects;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;

public class DFS_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String>> de=new HashMap<>();
		de.put("Entrance",Arrays.asList("reptile","bird sanctuary","mammal zone"));
		de.put("reptile house",Arrays.asList("snake pit"));
		de.put("bird sanctuary",Arrays.asList("parrot pavilion"));
		de.put("mammal zone",Arrays.asList("lion den","elephant enclouser"));
		de.put("snake pit",new ArrayList<String>());
		de.put("parrot pavilion",new ArrayList<String>());
		de.put("lion den",new ArrayList<String>());
		de.put("elephant",new ArrayList<String>());
		System.out.println(de);
		dfs(de,"entrance");

	}
	public static void dfs(Map<String,List<String>> ex,String start) {
		Queue<String> q=new LinkedList<>();
		Set<String> s=new HashSet<>();
		q.add(start);
		s.add(start);
		while(!q.isEmpty()) {
			String item=q.poll();
			System.out.println("visited :"+item);
			List<String> neighbours=ex.get(item);
			if(neighbours==null)continue;
			for(String neighbour:neighbours) {
				if(!s.contains(neighbour)) {
					q.add(neighbour);
					s.add(neighbour);
					}
			}
		}
	}

}
