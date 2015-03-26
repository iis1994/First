import java.util.Scanner;
public class TestDistance {
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter x1");
		double x1 = input.nextInt();
		
		System.out.println("Enter x2");
		double x2 = input.nextInt();
		
		System.out.println("Enter y1");
		double y1 = input.nextInt();
		
		System.out.println("Enter y2");
		double y2 = input.nextInt();
		
		
		TheDistance td = new TheDistance(x1,x2,y1,y2);
		
		System.out.println("Total Distance is: "+td.getTotalDistance(x1,x2,y1,y2));
	}
}
