package chapter11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname="C:\\��������\\ahah.txt";
		
		File f= new File(fname);
		
		if(! f.exists()) {
			System.out.println("���Ͼ���");
			
		}
		
		try {
			f.createNewFile();
			if(f.exists()) {
				System.out.println("make file");
			}
			FileWriter fr=new FileWriter(f);
			fr.write("�̰� �ִ´پƾƾ�");
			fr.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
