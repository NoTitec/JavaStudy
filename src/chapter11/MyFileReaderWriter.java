package chapter11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		
		String infname="C:\\��������\\rwŬ����.txt";
		String outfname="C:\\��������\\���.txt";
		
		try {
			FileReader fr= new FileReader(infname);
			FileWriter fw= new FileWriter(outfname);
			
			while((data=fr.read())!=-1) {
				System.out.println((char)data);
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println("���ϻ�����: "+outfname);
		}catch(FileNotFoundException e) {
			System.out.println("�������Ͼ���");
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
