package chapter7;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm= new HashMap<String,String>();
		
		hm.put("���ѹα�", "����");
		hm.put("�Ϻ�", "����");
		hm.put("�߱�", "�ϰ�");
		hm.put("�±�", "����");
		hm.remove("�±�");
		hm.put("�̱�", "����");
		
		System.out.print(hm.keySet());
		System.out.println(hm.values());
		
		Iterator<String> keys=hm.keySet().iterator();
		while(keys.hasNext()) {
			String key=keys.next();
			String value=hm.get(key);
			System.out.println(key+value);
		}
	}

}
