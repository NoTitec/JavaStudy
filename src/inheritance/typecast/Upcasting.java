package inheritance.typecast;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person she=new Person("what",2056432);
		System.out.println(she.name+" "+she.number);
		
		Faculty f= new Faculty("�迵��",112344,"���Ѵ��б�",3456);
		Person p=f;
		System.out.println(p.name+" "+p.number);//�θ� name number���
		System.out.println(f.name+" "+((Person)f).number);//�ڽ� nameã�� ������ �θ�name ��� �θ������� Ÿ�Թٲٰ� �θ� number���
		System.out.println(f.univ+" "+f.number);
		
		Staff s= new Staff("����",118743,"�������б�",3456);
		s.division="����ó";
		Person pn=s;
		Faculty ft=s;
		System.out.println(pn.name+" "+pn.number+" ");
		System.out.println(ft.univ+" "+ft.number+" ");
		System.out.println(s.division);
	}

}
