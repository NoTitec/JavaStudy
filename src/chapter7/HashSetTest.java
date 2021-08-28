package chapter7;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> setA= new HashSet<Integer>();
		HashSet<Integer> setB= new HashSet<Integer>();
		
		setA.add(3);
		setA.add(5);
		setA.add(7);
		setA.add(8);
		setA.add(7);
		setA.add(9);
		print(setA);
		
		System.out.println(setA);
		
		setB.add(5);
		setB.add(3);
		setB.add(2);
		print(setB);
		System.out.println(setB);
		boolean isChange= setA.removeAll(setB);
		if(isChange) {
			System.out.println(setA);
		}
	}
	public static void print(HashSet<Integer> s) {
		Iterator<Integer> i= s.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}
}
