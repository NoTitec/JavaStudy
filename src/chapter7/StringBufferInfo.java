package chapter7;

public class StringBufferInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer pg= new StringBuffer("Java");
		
		System.out.println(pg.capacity());
		System.out.println(pg.append(" language"));//�ǵں��� �߰�
		System.out.println(pg.insert(5, "programming"));//index��ġ���� �߰�
		System.out.println(pg.capacity());
		System.out.println(pg);
		System.out.println(pg.replace(0, 4, "Objective-C"));// first index���� second index���� ���ڿ� ��ü
		System.out.println(pg.substring(0, 9));//first index���� second index���� ���ڿ� ������
		System.out.println(pg);
		System.out.println(pg.charAt(10));
		pg.setCharAt(10, 'D');
		System.out.println(pg);
	}

}
