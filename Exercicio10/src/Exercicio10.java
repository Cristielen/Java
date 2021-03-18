import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Exercicio10 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("product #" + i + " data: ");

			System.out.print("Common, used or imported (c/u/i)");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product pro = new ImportedProduct(name, price, customsFee);
				list.add(pro);

			} else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product pro = new UsedProduct(name, price, manufactureDate);
				list.add(pro);
			} else {
				list.add(new Product(name, price));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product pro : list) {
			System.out.println(pro.priceTag());
		}

	}

}
