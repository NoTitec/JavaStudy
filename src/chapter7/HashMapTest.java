package chapter7;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm= new HashMap<String,String>();
		
		hm.put("대한민국", "서울");
		hm.put("일본", "동경");
		hm.put("중국", "북경");
		hm.put("태국", "방콕");
		hm.remove("태국");
		hm.put("미국", "서울");
		
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
