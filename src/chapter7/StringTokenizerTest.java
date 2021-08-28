package chapter7;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "public static void main(String[] args) {";

		StringTokenizer st1 = new StringTokenizer(str);// /t,/n과 같은 기본 분리자로 구분
		printToken(st1);
		StringTokenizer st2 = new StringTokenizer(str," ()");// ""내부 모든 문자열을 분리자로사용
		printToken(st2);
		StringTokenizer st3 = new StringTokenizer(str," ()[]{");
		printToken(st3);
		
		StringTokenizer st4= new StringTokenizer(str,"()[]{",true);//분리자도 토큰에 포함
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
	
	public static void printToken(StringTokenizer st,String delim) {//6개 토큰가질걸 받아도 
		
		int c=0;
		while(st.hasMoreTokens()) {
			System.out.print(++c+st.nextToken(delim));//여기서 delim기준으로 토큰반환함
		}
		System.out.println();
	}
}
