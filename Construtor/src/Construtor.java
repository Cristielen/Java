import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto product = new Produto();

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.printf("Product data: " + product);
		System.out.println();

		System.out.println("Enter the number of product to be added in stock:");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		System.out.println();

		System.out.printf("Update data: " + product);

		System.out.println();
		System.out.println("Enter the number of product to be remove in stock:");
		quantity = sc.nextInt();
		product.removeProduct(quantity);

		System.out.printf("Update data: " + product);

		sc.close();
	}

}
