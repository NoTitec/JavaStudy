package chapter11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class MyInputStreamReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		
		String fname="C:\\��������\\rwŬ����.txt";
		
		try {
			InputStreamReader isr=new InputStreamReader(new FileInputStream(fname));
			
			System.out.println(isr.getEncoding());
			
			BufferedReader br= new BufferedReader(isr);
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			isr.close();
		}
		catch(FileNotFoundException e){
			System.out.println("���Ͼ���");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
