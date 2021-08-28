package chapter7;

import java.util.ArrayList;

public class MyContainer<E> {
	private ArrayList<E> list;
	
	public MyContainer() {//E타입으로 ArrayList생성
		list = new ArrayList<E>();
	}
	public E get(int index) {
		return list.get(index);
	}
	public void add(E element) {
		list.add(element);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyContainer<String> pl= new MyContainer<String>();
		pl.add("algol");
		pl.add("C");
		pl.add("java");
		System.out.println(pl.get(0));
		System.out.println(pl.get(1));
		System.out.println(pl.get(2));
	}

}
