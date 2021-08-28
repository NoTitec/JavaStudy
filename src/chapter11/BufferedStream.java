package chapter11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class BufferedStream {

	public BufferedStream() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis;
		BufferedOutputStream bos;
		String fname="C:\\楷嚼颇老\\what";
		
		try {
			bos=new BufferedOutputStream(new FileOutputStream(fname));
			byte data[]= {'A','B'};
			bos.write(data, 0,2);//data
			bos.close();
			System.out.println("颇老 积己");
			
			bis=new BufferedInputStream(new FileInputStream(fname));
			data=new byte[10];
			bis.read(data, 0, 10);//destination buffer
			bis.close();
			System.out.println(Arrays.toString(data));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
