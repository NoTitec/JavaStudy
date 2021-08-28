package inheritance.typecast;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person she=new Person("what",2056432);
		System.out.println(she.name+" "+she.number);
		
		Faculty f= new Faculty("김영배",112344,"연한대학교",3456);
		Person p=f;
		System.out.println(p.name+" "+p.number);//부모 name number출력
		System.out.println(f.name+" "+((Person)f).number);//자식 name찾고 없으면 부모name 출력 부모형으로 타입바꾸고 부모 number출력
		System.out.println(f.univ+" "+f.number);
		
		Staff s= new Staff("김상기",118743,"강서대학교",3456);
		s.division="교학처";
		Person pn=s;
		Faculty ft=s;
		System.out.println(pn.name+" "+pn.number+" ");
		System.out.println(ft.univ+" "+ft.number+" ");
		System.out.println(s.division);
	}

}
