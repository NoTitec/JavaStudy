package chapter7;

public class StringBufferInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer pg= new StringBuffer("Java");
		
		System.out.println(pg.capacity());
		System.out.println(pg.append(" language"));//맨뒤부터 추가
		System.out.println(pg.insert(5, "programming"));//index위치부터 추가
		System.out.println(pg.capacity());
		System.out.println(pg);
		System.out.println(pg.replace(0, 4, "Objective-C"));// first index부터 second index까지 문자열 교체
		System.out.println(pg.substring(0, 9));//first index부터 second index까지 물자열 가져옴
		System.out.println(pg);
		System.out.println(pg.charAt(10));
		pg.setCharAt(10, 'D');
		System.out.println(pg);
	}

}
