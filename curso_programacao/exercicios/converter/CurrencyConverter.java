package converter;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	
	public static double dollarToReal (double priceDollar, double quantDollar) {
		
		return priceDollar * quantDollar * (1.0 + IOF);
		
	}	
	
}
