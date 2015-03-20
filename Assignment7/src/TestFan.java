import java.util.Scanner;
public class TestFan {
	public static void main(String[] args){
		Fan f1= new Fan();
		System.out.println(f1);
		
		Fan f2= new Fan();
		
	     f2.toString();
		System.out.println("Enter the fan speed:");
		Scanner input=new Scanner(System.in);
		int speed= input.nextInt();
		
		System.out.println("Enter the fan color: ");
		String color=input.next();
		
		System.out.println("Enter the fan's radius: ");
		double radius=input.nextDouble();
		
		System.out.println("Enter the fan Status ");
		boolean fanStatus= input.nextBoolean();
	 
	        System.out.println(f2.toString());
	}
}
