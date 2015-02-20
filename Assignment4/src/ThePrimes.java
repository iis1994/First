import java.util.Scanner;
public class ThePrimes {
	public static void main(String[] args) {

		System.out.println("Enter a number. The system will find the prime numbers smaller than this number");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		int prime;
		int divisor;
		int totalNumberOfPrimes = 0;
		for (prime = 2; prime < userInput; prime++) {
			boolean primeNumber = true;
			for (divisor = 2; divisor < prime; divisor++) {
				if (prime % divisor == 0) {
					primeNumber = false;
				}
			}
			if (primeNumber) {
				totalNumberOfPrimes++;
				System.out.print(prime + " \n");
			}
		}
		System.out.println("There are a total number of " + totalNumberOfPrimes
				+ " prime numbers");
	}

}
