package banksys;

import java.time.LocalDate;

public class Account {
	private String username;
	private Card card;
	private int balance;
	
	public Account (String username, Card card, int balance) {
		this.username = username;
		this.card = card;
		this.balance = balance;
	}
	
	public String toString() {
		return username + " " + card.getID() + " " + balance;
	}
}
