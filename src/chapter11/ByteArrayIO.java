package chapter11;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		byte b[]= {'a','b','c','d'};
		
		ByteArrayInputStream binput=new ByteArrayInputStream(b);//inputstream은 소스로부터 단위별로 읽어옴
		ByteArrayOutputStream boutput=new ByteArrayOutputStream();//outputstream은 버퍼마냥 별개공간
		
		System.out.println("문자읽어 대문자 출력");
		while((c= binput.read())!=-1) {//b 소스에서 한개문자가져옴
			System.out.print(c);//가져온 문자 출력
			boutput.write(Character.toUpperCase((char)c));//가져온문자 출력스트림에 저장
		}
		
		System.out.println();
		System.out.println(boutput);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(boutput.toByteArray()));
	}

}
