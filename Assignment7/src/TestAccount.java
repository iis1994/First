import java.util.Date;
public class TestAccount {
	public static void main(String[] args){
		
		Account a1 = new Account(1122,20000, 0.045);
		
		
		System.out.println("The Account number is "+a1.id+"\nThe Account balance is "+a1.balance+"\nThe interest Rate is "+a1.anualInterestRate);
		
		a1.withdraw(2000);
		System.out.println("The account balance after withdraw is: $ " +a1.getBalance());
		a1.deposit(3000);
		System.out.println("The account balance after deposit is: $"+a1.getBalance());
		System.out.println ("The monthly interest is: $" +a1.getBalance() * a1.getAnualInterestRate());
		a1.getDateCreated();
        System.out.println ("The account was created on: \n" +a1.getDateCreated());

	}
}
