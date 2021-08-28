package inheritance.access;

import java.util.Date;

public class Account {
	public String name;
	protected Date open;
	int number;
	private long balance;
	
	protected Account(String name, int number) {
		this.name=name;
		this.number=number;
		this.open=new Date();
	}
	
	public long deposit(long amount) {
		return balance+=amount;
	}
	public long withdraw(long amount) {
		return balance-=amount;
	}
	public long checkBalance() {
		System.out.println(name+" "+number+" "+balance);
		return balance;
	}
}
