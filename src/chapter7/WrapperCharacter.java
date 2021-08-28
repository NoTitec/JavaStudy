package chapter7;

public class WrapperCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ch='@';
		
		System.out.println(ch);
		System.out.println(ch.charValue());
		System.out.println(ch.toString());
		System.out.println(ch.compareTo('@'));
		System.out.println(ch.hashCode());
		System.out.println();
		
		
		System.out.println(Character.toUpperCase('d'));
		System.out.println(Character.toLowerCase('F'));
		System.out.println(Character.getName('@'));
		System.out.println(Character.getName('|'));
		System.out.println(Character.getName('^'));
		System.out.println(Character.isDigit('$'));
		System.out.println(Character.isDigit('5'));
	}

}
