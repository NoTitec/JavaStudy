package chapter7;

import java.util.Random;

public class RendomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		
		for (int i = 0; i<6; i++) {
			System.out.println(rd.nextInt());
		}
		System.out.println();
		
		for (int i = 0; i < 6; i++) {
			System.out.println(rd.nextInt(44));
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("%.2f",rd.nextDouble());
		}
	}

}
