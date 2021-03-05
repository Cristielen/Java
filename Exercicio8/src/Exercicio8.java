import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Exercicio8 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Enter client data: ");

		System.out.print("Name: ");
		String nameClient = sc.nextLine();

		System.out.print("Email: ");
		String emailClient = sc.nextLine();

		System.out.print("Birth date: ");
		Date contractDate = sdf1.parse(sc.next());

		Client client = new Client(nameClient, emailClient, contractDate);

		System.out.println("---------------------");

		System.out.println("Enter order data: ");

		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

		Date oM = new Date();
		String orderMoment = sdf2.format(oM);
		Order order = new Order(oM, orderStatus, client);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		System.out.println("---------------------");

		OrderItem orderItem = new OrderItem();

		Product product = new Product();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");

			System.out.print("Product name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Product price: ");
			double price = sc.nextDouble();

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			System.out.println();
			
			product = new Product(name, price);
			orderItem = new OrderItem(quantity, price, product);
			order.addOrderItem(orderItem);
		}

		System.out.println();
		System.out.println(order);
		
		sc.close();

	}

}
