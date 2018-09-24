package banksys;
import java.time.LocalDate;
import java.util.Scanner;

public class ATMSystem {
	public static void main (String[] args) {
		Bank bankA = new Bank("A");
		Bank bankB = new Bank("B");
		ATM atmA = new ATM("A", 5000, bankA);
		ATM atmB = new ATM("B", 5000, bankB);
		Card cardA1 = new Card("A1", "swordfish", LocalDate.parse("2020-08-20"), bankA);
		Card cardB1 = new Card("B1", "crawfish", LocalDate.parse("2020-09-15"), bankB);
		System.out.println("Bank A cards and ATMs");
		for (Card c : bankA.getCardList()) {
			System.out.println(c.toString());
		}
		for (ATM a : bankA.getATMList()) {
			System.out.println(a.toString());
		}
		System.out.println("Bank B cards and ATMs");
		for (Card c : bankB.getCardList()) {
			System.out.println(c.toString());
		}
		for (ATM a : bankB.getATMList()) {
			System.out.println(a.toString());
		}
		System.out.println("Create an Account. Enter username:");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String username = sc.nextLine();
			System.out.println("Enter card id for the designated cash card: ");
			String cardID = sc.nextLine();
			System.out.println("Enter starting balance: ");
			String balance = sc.nextLine();
			int index = 0;
			Account checking = null;
			for (Card c : bankA.getCardList()) {
				if (cardID.equals(c.getID())) {
					index = bankA.getCardList().indexOf(c);
					checking = new Account(username, bankA.getCardList().get(index), Integer.parseInt(balance));
				}
			}
			for (Card c : bankB.getCardList()) {
				if (cardID.equals(c.getID())) {
					index = bankB.getCardList().indexOf(c);
					checking = new Account(username, bankB.getCardList().get(index), Integer.parseInt(balance));
				}
			}
			System.out.println("New Account: " + checking.toString());
		}
		sc.close();
	}
}
