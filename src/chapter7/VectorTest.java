package chapter7;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> data = new Vector<Object>(3);
		
		data.addElement(2012);
		data.add("�⵵");
		data.addElement(4.35);
		data.add(2,"��ǥ ����");
		data.insertElementAt("�ڹ� ����",0);
		System.out.println(data.size());
		System.out.println(data.capacity());
		System.out.println(data.toString());
		System.out.println("e ���");
		Enumeration e=data.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
