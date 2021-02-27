import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;


public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double dollarBuy = sc.nextDouble();
		
		double dollar = CurrencyConverter.ConverteDolar(dollarPrice, dollarBuy);
		
		System.out.printf("Amount to be paid in reais = " + dollar);
		

	}

}
