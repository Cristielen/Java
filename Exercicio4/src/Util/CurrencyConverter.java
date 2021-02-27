package Util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double ConverteDolar(double dollarPrice, double dollarBuy) {
		double calc = dollarPrice * dollarBuy;
		double result = IOF * 100 * calc;
		return (result / 100) + calc;	
	}



}
