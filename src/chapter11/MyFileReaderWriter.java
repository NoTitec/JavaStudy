package chapter11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		
		String infname="C:\\연습파일\\rw클래스.txt";
		String outfname="C:\\연습파일\\백업.txt";
		
		try {
			FileReader fr= new FileReader(infname);
			FileWriter fw= new FileWriter(outfname);
			
			while((data=fr.read())!=-1) {
				System.out.println((char)data);
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println("파일생성됨: "+outfname);
		}catch(FileNotFoundException e) {
			System.out.println("읽을파일없음");
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
