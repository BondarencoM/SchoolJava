
public class Ex1_2 {
	public static void main(String[] args) {
		Account c = new Account(1122,20000);
		c.setAnnualInterestRate(4.5);	
		c.deposit(3000);
		System.out.println("Contul numarul "+c.getId()+" are in cont "+c.getBalance()+", suma dobanzii lunare e: "
				+c.getMonthlyInterest()+"; Contul a fost creat la data de "+c.getDateCreated());	
	}
}
