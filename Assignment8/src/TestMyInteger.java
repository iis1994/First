import java.util.Scanner;
public class TestMyInteger {
	public static void main(String[] args) {

		MyInteger mi = new MyInteger();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int u = input.nextInt();
		
		System.out.println("isEven: "+mi.isEven(u));
		System.out.println("isOdd: "+mi.isOdd(u));
		System.out.println("isPrime: "+mi.isPrime(u));
		
		MyInteger m2 = new MyInteger();
		System.out.println("Enter another positive integer");
		int value = input.nextInt();
		System.out.println("\nisEven: "+MyInteger.isEven(value));
		System.out.println("isOdd: "+MyInteger.isOdd(value));
		System.out.println("isPrime: "+MyInteger.isPrime(value));
	
		System.out.println("\nEquals? "+m2.equals(mi));
		System.out.println(MyInteger.parseInt(u));
	}

}
