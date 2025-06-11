package javaprojects;
import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//min heap (default behaviour of priority queue)//
		PriorityQueue<Integer> minhp=new PriorityQueue<>();
		minhp.add(476);
		minhp.add(74);
		minhp.add(572);
		minhp.add(786);
		
		System.out.println("min heap output :"+minhp);
		
		while(!minhp.isEmpty()) {
			System.out.println(minhp.poll());
		}
		
		PriorityQueue<Integer> maxhp=new PriorityQueue<Integer>(Collections.reverseOrder());
		maxhp.add(37);
		maxhp.add(478);
		maxhp.add(4387);
		maxhp.add(3855);
		System.out.println("max heap output :"+maxhp);
		while(!maxhp.isEmpty()) {
			System.out.println(maxhp.poll());
			}
		}

}
