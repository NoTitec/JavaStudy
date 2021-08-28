package inheritance.typecast;

public class Staff extends Faculty{
	public String division;
	
	Staff(String name,long number,String univ,long idnumber){
		super(name,number,univ,idnumber);
	}

}
