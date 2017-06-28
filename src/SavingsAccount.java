
public class SavingsAccount extends BankAccount{
	private double interestRate;
	

	public SavingsAccount(int dDollar, int dCent, int dID, String dName, double dInterestRate) {
		super(dDollar, dCent, dID, dName);
		interestRate = dInterestRate;
	}
	
	public void addInterest(){
		double balance = getDollar() + (getCent() * 0.01);
		balance += balance * interestRate;
	}

}
