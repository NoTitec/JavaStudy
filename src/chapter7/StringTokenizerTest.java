package chapter7;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "public static void main(String[] args) {";

		StringTokenizer st1 = new StringTokenizer(str);// /t,/n�� ���� �⺻ �и��ڷ� ����
		printToken(st1);
		StringTokenizer st2 = new StringTokenizer(str," ()");// ""���� ��� ���ڿ��� �и��ڷλ��
		printToken(st2);
		StringTokenizer st3 = new StringTokenizer(str," ()[]{");
		printToken(st3);
		
		StringTokenizer st4= new StringTokenizer(str,"()[]{",true);//�и��ڵ� ��ū�� ����
		printToken(st4);
		StringTokenizer st5= new StringTokenizer(str);
		printToken(st5,"()");
	}

	public static void printToken(StringTokenizer st) {
	System.out.println("token count:"+st.countTokens());
	int c=0;
	while(st.hasMoreTokens()) {
		System.out.print(++c+st.nextToken());
	}
	System.out.println();
	}
	
	public static void printToken(StringTokenizer st,String delim) {//6�� ��ū������ �޾Ƶ� 
		
		int c=0;
		while(st.hasMoreTokens()) {
			System.out.print(++c+st.nextToken(delim));//���⼭ delim�������� ��ū��ȯ��
		}
		System.out.println();
	}
}
