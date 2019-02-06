import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0; 
	private Date dateCreated;
	
	public Account() {
		setDateCreated(new Date());
	}
	
	public Account(int id, double ballance) {
		this.id = id;
		this.balance = ballance;
		setDateCreated(new Date());
	}

	public boolean withdraw(double sum) {
		if (sum <= balance ) {
			balance -= sum;
			return true;
		}
		return false;
	}
	
	public boolean deposit(double sum) {
		if (sum>=0) {
			balance += sum;
			return true;
		}
		else return false;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() / 100;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	
}
