public class MyInteger {
		int userInteger;
		int number;
		static boolean isEven;
		static boolean isOdd;
		static boolean isPrime;

	public boolean getIsEven(int userInteger){
		
		if(userInteger%2==0){
			return true;
		}
		return false;
	}
	public boolean getIsOdd(int userInteger){
		if(userInteger%2!=0){
		return true;
		}	
		return false;
		
	}
	public boolean getIsPrime(int userInteger){
		for(number=2; number<userInteger; number++){
			if (userInteger%number==0)
		return false;}
		return true;
	}
}
