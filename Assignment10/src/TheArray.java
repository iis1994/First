import java.util.Scanner;
public class TheArray {
	
	public static void main(String[] args) {
		int t=0;
		Scanner input=new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int n = input.nextInt();

		int myArray[]= new int[n];
		System.out.println("Enter a series of "+myArray.length+" numbers");
		for(int index=0; index<myArray.length;index++){
			System.out.println("Enter number "+(index+1));
			myArray[index]=input.nextInt();
			getTotal(myArray);
		}
		System.out.println("Sum is "+getTotal(myArray));
		System.out.println("Average is "+getAverage(myArray));
		System.out.println("Highest value is "+getHighest(myArray));
		System.out.println("Lowest value is "+getLowest(myArray));

	}
	public static int getTotal(int[] myArray){
		int sum = 0;

		for (int i = 0; i < myArray.length; i++)
		{
		  sum = sum + myArray[i];
		}
		return sum;
	}
	public static double getAverage(int[] myArray){
		int sum = 0;
		double average=0;

		for (int i = 0; i < myArray.length; i++)
		{	int count=1;
			count++;
		  sum = sum + myArray[i];
		  average=sum/(myArray.length+1);
		}
		return average;
	}
	public static int getHighest(int[] myArray){
		int highest=0;
		for (int i = 0; i < myArray.length; i++){
			    if (myArray[i] > highest){
			        highest = myArray[i];
			}
		}
		return highest;
	}
	public static int getLowest(int[] myArray){
		int lowest = getHighest(myArray);
		for (int i = 0; i < myArray.length; i++){
			    if (myArray[i] < lowest){
			    lowest = myArray[i];
			}
		}
		return lowest;
	}

}
