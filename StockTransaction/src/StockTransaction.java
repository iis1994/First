//OK. Ozgur Aktunc
public class StockTransaction {
	public static void main(String[] args){
		
		
		final double COMISSION_RATE =0.02;
		
		int sharesPurchased = 1000;
		
		double stockPrice = 32.87;
		double beforesellstockpay = stockPrice*sharesPurchased;
		
		System.out.println("The amount Joe paid for the stock is " +beforesellstockpay);
		
		double sellprice = 33.92;
		double aftersellstockpay = sharesPurchased*sellprice;
		
		System.out.println("He sold the stock for "+aftersellstockpay);
		
		double brokerPay = (stockPrice*sharesPurchased*COMISSION_RATE);
		
		System.out.println("The amount of commission Joe paid his broker when he bought the stock is "+brokerPay);
		double secondbrokerpay = sharesPurchased*sellprice*COMISSION_RATE; 
		System.out.println("He paid his broker "+secondbrokerpay+ ", after he sold the stock");
		
		double totalcomission = brokerPay+secondbrokerpay;
		double profitbeforecomission = aftersellstockpay-beforesellstockpay;
		double lastprofit = profitbeforecomission - totalcomission;
		
		System.out.println("Joe's profit was "+lastprofit);
		
	}

}
