package inheritance.access;

public class SavingAccount extends Account{
	public double rates;
	public SavingAccount(String name,int number, double rates) {
		super(name,number);
		this.rates=rates;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount myAccount = new SavingAccount("±Ë≈¬»Ò",23456789,0.34);
		myAccount.deposit(400000);
		myAccount.withdraw(5000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.open);
		}

}
