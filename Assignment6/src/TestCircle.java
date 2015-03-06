import java.util.Scanner;
public class TestCircle {
	public static void main(String[] args){
		
	Scanner input=new Scanner(System.in);
	System.out.println("Enter radius");
	double radius=input.nextInt();
	
	Circle c1 =new Circle();
	
	c1.radius=radius;
	System.out.println("The area is " +c1.getArea());
	System.out.println("The diameter is " +c1.getDiameter());
	System.out.println("The circumferrence is " +c1.getCircumference());
	}
}
