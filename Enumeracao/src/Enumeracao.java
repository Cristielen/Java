import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Orders;
import entities.enums.OrderStatus;

public class Enumeracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Orders order = new Orders(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order); 
		
		//Conversão de String para enum
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
