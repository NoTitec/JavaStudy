package chapter7;

public class WrapperInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age = 20;
		Integer snum=20121105;
		
		System.out.println(age.intValue());
		System.out.println(snum.intValue());
		System.out.println(age.equals(snum));
		System.out.println(Integer.parseInt("24567"));
		System.out.println(Integer.parseInt("ff",16));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toString(255,16));
		
		
	}

}
