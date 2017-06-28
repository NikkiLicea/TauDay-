
public class BankAccount {
	private int dollar;
	private int cent;
	private int ID;
	private String name;
	
	public BankAccount(int dDollar, int dCent, int dID, String dName){
		dollar = dDollar;
		cent = dCent;
		ID = dID;
		name = dName;
	}
	
	public int getDollar(){
		return dollar;
	}
	
	public int getCent(){
		return cent;
	}
	
	public int getID(){
		return ID;
	}
	
	public String getName(){
		return name;
	}
	
	public void setID(int newID){
		ID = newID;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public void maxCent(){
		if(cent > 99){
			cent -= 100;
			dollar += 1;
		}
	}
	
	public void deposit(int depositDollar, int depositCent){
		cent += depositCent;
		dollar += depositDollar;
	}
	
	public void withdraw(int wDollar, int wCent){
		cent -= wCent;
		dollar -= wDollar;
	}

}
