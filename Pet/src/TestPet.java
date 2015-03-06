import java.util.Scanner;
public class TestPet {
	public static void main(String[] args){
	Pet p1 =new Pet();
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter pet name " +p1.getName());
	String name= input.next();
	
	System.out.println("Enter pet Age " +p1.getAge());
	int age = input.nextInt();
	
	System.out.println("Enter Pet type " +p1.getType());
	String type = input.next();
}
}