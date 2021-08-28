package chapter11;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname="C:\\연습파일\\rw클래스";
		
		File f= new File(fname);
		
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.isDirectory());
		System.out.println(new Date(f.lastModified()));
		System.out.println(f.length());
	}

}
