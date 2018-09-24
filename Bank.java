package banksys;

import java.util.ArrayList;
public class Bank {
	private String bankID;
	private ArrayList<Account> accounts;
	private ArrayList<ATM> ATMs;
	private ArrayList<Card> cards;
	
	public Bank (String bankID) {
		this.bankID = bankID;
		this.accounts = new ArrayList<Account>();
		this.ATMs = new ArrayList<ATM>();
		this.cards = new ArrayList<Card>();
	}
	
	public void addAccount(Account a) {
		accounts.add(a);
	}
	public void addATM(ATM a) {
		ATMs.add(a);
	}
	public void addCard(Card c) {
		cards.add(c);
	}
	public ArrayList<Card> getCardList() {
		return cards;
	}
	public ArrayList<ATM> getATMList() {
		return ATMs;
	}
	public String toString() {
		return bankID;
	}
}
