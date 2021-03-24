import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Tax payer # " + i + " data: ");

			System.out.print("Individual or company (i/c): ");
			char ch = sc.next().charAt(0);

			System.out.print("Nome");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExp = sc.nextDouble();

				Person person = new Individual(name, anualIncome, healthExp);
				list.add(person);

			} else if (ch == 'c') {
				System.out.println("Number of employees: ");
				int numberEmplo = sc.nextInt();

				Person person = new Company(name, anualIncome, numberEmplo);
				list.add(person);
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		
		double sum = 0;
		for(Person person : list) {
			System.out.println(person.getName() +": $ "+ String.format("%.2f", person.taxPayers()));
			sum += person.taxPayers();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", sum));
		
		sc.close();

	}

}
