package chapter11;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		byte b[]= {'a','b','c','d'};
		
		ByteArrayInputStream binput=new ByteArrayInputStream(b);//inputstream�� �ҽ��κ��� �������� �о��
		ByteArrayOutputStream boutput=new ByteArrayOutputStream();//outputstream�� ���۸��� ��������
		
		System.out.println("�����о� �빮�� ���");
		while((c= binput.read())!=-1) {//b �ҽ����� �Ѱ����ڰ�����
			System.out.print(c);//������ ���� ���
			boutput.write(Character.toUpperCase((char)c));//�����¹��� ��½�Ʈ���� ����
		}
		
		System.out.println();
		System.out.println(boutput);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(boutput.toByteArray()));
	}

}
