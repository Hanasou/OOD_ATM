package banksys;

import java.time.LocalDate;
public class Card {
	private String cardID;
	private String password;
	private LocalDate expiration;
	private Bank bank;
	
	public Card (String cardID, String password, LocalDate expiration, Bank bank) {
		this.cardID = cardID;
		this.password = password;
		this.expiration = expiration;
		this.bank = bank;
		bank.addCard(this);
	}
	
	public String getID() {
		return cardID;
	}
	public Bank getBank() {
		return bank;
	}
	public String toString() {
		return "Card: " + cardID + " |Expiration: " + expiration.toString() + " |Bank: " + bank.toString();
	}
}
