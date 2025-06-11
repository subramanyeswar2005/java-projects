package javaprojects;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class Breadth_First_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String>> hh=new HashMap<>();
		hh.put("Entrance",Arrays.asList("Reptile House","Bird Sanctuary","Mammal Zone"));
		hh.put("Reptile House",Arrays.asList("Snake Pit"));
		hh.put("Bird Sanctuary",Arrays.asList("Parrot Pavilion"));
		hh.put("Mammal Zone",Arrays.asList("Lion Den,Elepthant Enclouser"));
		hh.put("Snake Pit",new ArrayList<String>());
		hh.put("Parrot Pavilion",new ArrayList<String>());
		hh.put("Lion Den",new ArrayList<String>());
		hh.put("Elephant Enclouser",new ArrayList<String>());
		System.out.println(hh);
		bfs(hh,"Entrance");
	}
	public static void bfs(Map<String,List<String>> y,String start) {
		Queue<String> q=new LinkedList<>();
		Set<String> s=new HashSet<>();
		q.add(start);
		s.add(start);
		while(!q.isEmpty()) {
			String x=q.poll();
			System.out.println("if visited re add :"+x);
			List<String> a=y.get(x);
			if(a==null)continue;
			for(String neighbour:a) {
				if(!s.contains(neighbour)) {
					q.add(neighbour);
					s.add(neighbour);
					}
				
			}
		}
	}
}

