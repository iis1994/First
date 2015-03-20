import java.util.Date;
public class Account {
	int id;
	double balance;
	double anualInterestRate;
	Date dateCreated;
	
	public Account(){
		Date dateCreated = new Date();
		id=001;
		balance=000;
		anualInterestRate=0.00;
	}
	public Account(int id, double balance,double anualInterestRate){
		this.id=id;
		this.balance=balance;
		this.anualInterestRate=anualInterestRate;
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnualInterestRate(){
		return anualInterestRate;
	}
	public double getMonthlyInterestRate(){
		return anualInterestRate/12;
	}
	public void withdraw(double withdraw){
		balance-=withdraw;
	}
	public void deposit(double deposit){
		balance+=deposit;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
}
