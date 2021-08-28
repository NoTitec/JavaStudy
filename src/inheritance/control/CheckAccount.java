package inheritance.control;

import inheritance.access.Account;
import inheritance.access.SavingAccount;

public class CheckAccount extends Account{
	long mininum;
	
	public CheckAccount(String name,int number,long mininum) {
		super(name,number);
		this.mininum=mininum;
		super.deposit(mininum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount myAccount= new SavingAccount("±Ë≈¬»Ò",23456789,0.34);
		myAccount.deposit(250000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		CheckAccount cAccount= new CheckAccount("¿ÃπŒ¡§",87654321,50000);
		cAccount.deposit(25000);
		cAccount.withdraw(500);
		cAccount.checkBalance();
		System.out.println(cAccount.open);
	}

}
