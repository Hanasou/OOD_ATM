package banksys;

public class ATM {
	private String atmID;
	private int withdrawLimit;
	private Bank bank;
	
	public ATM (String atmID, int withdrawLimit, Bank bank) {
		this.atmID = atmID;
		this.withdrawLimit = withdrawLimit;
		this.bank = bank;
		bank.addATM(this);
	}
	
	public String toString() {
		return "ATM: " + atmID + " |Withdraw Limit: " + withdrawLimit + " |Bank: " + bank.toString();
	}
}
