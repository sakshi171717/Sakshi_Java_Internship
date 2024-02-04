package classtask1;

public class BankAccount {
	
	private int accNumber;
	private int bankBalance;
	
	
	public void setNumber(int accNumber) {
		this.accNumber=accNumber;
	}
	
	public void setBalance(int bankBalance) {
		this.bankBalance=bankBalance;
	}
	
	public void getNumber() {
		System.out.println("Account number= "+accNumber);
	}
	
	public void getBalance() {
		System.out.println("Deposit money= "+bankBalance);
	}

}
