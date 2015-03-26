import java.util.Scanner;
public class TestMyInteger {
	public static void main(String[] args) {

	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int userInteger = input.nextInt();
		
		MyInteger mi = new MyInteger();
		
		System.out.println("isEven: "+mi.getIsEven(userInteger));
		System.out.println("isOdd: "+mi.getIsOdd(userInteger));
		System.out.println("isPrime: "+mi.getIsPrime(userInteger));
	}

}
