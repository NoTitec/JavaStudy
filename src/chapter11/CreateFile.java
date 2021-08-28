package chapter11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname="C:\\연습파일\\ahah.txt";
		
		File f= new File(fname);
		
		if(! f.exists()) {
			System.out.println("파일없음");
			
		}
		
		try {
			f.createNewFile();
			if(f.exists()) {
				System.out.println("make file");
			}
			FileWriter fr=new FileWriter(f);
			fr.write("이거 넣는다아아아");
			fr.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
