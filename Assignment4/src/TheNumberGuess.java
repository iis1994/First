import java.util.Scanner;
public class TheNumberGuess {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int generator = (int)( (Math.random()*100)+1);
		int user;
		
		System.out.println("Choose a number between 1 and 100");
		user = scanner.nextInt();
		
		while (user != generator)
		{
			if (user < generator)
			{
			System.out.println("Guess higher");
			user = scanner.nextInt();
			}
			else if (user>generator)
			{
				System.out.println("Guess Lower");
				user = scanner.nextInt();
			}
		}
		if (user == generator){
			System.out.println("You guessed right");
		}
		
		
	}

}

