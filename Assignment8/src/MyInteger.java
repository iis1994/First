public class MyInteger {
		int u;
		static int number;
		static boolean isEven;
		static boolean isOdd;
		static boolean isPrime;
		int value;
		
		public MyInteger() {
			this.value=value;
		}
		public int getValue(){
			return value;
		}
		
		public boolean isEven(){
			if (value%2==0){
				return true;
			}
			return false;
		}
		public boolean isOdd(){
			if(value%2!=0){
				return true;
			}
			return false;
		}
		
		public boolean isPrime(){
			for(number=2; number<value; number++){
				if(value%number==0)
				return false;
			}
			return true;
		}
	public static boolean isEven(int u){
		
		if(u%2==0){
			return true;
		}
		return false;
	}
	public static boolean isOdd(int u){
		if(u%2!=0){
		return true;
		}	
		return false;
		
	}
	public static boolean isPrime(int u){
		for(number=2; number<u; number++){
			if (u%number==0)
		return false;}
		return true;
	}
	public boolean isEven(MyInteger u){
		
		if(u.getValue()%2==0){
			return true;
		}
		return false;
	}
	public boolean isOdd(MyInteger u){
		if(u.getValue()%2!=0){
		return true;
		}	
		return false;
		
	}
	public boolean isPrime(MyInteger u){
		for(number=2; number<u.getValue(); number++){
			if (u.getValue()%number==0)
		return false;}
		return true;
		}
	public boolean equals(int u){
		if(value==u){
			return true;}
			return false;
		}
	public boolean equals(MyInteger u){
		if(value==u.getValue()){
			return true;
		}
		return false;
	}
	public static int parseInt(String u){
		return Integer.parseInt(u);
	}
}