package inheritance.typecast;

public class Faculty extends Person {
	public String univ;
	public long number;
	
	Faculty(String name,long number,String univ,long idnumber) {
		super(name,number);
		this.univ=univ;
		this.number=idnumber;
	}
	
	

	public long getSnumber() {
		return super.number;
	}
}
