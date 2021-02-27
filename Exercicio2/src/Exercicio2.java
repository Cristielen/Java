import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Employee: " + funcionario);
		
		System.out.println("Which percentaage to increase salary? ");
		double percent = sc.nextDouble();
		funcionario.increaseSalary(percent);
		
		System.out.println("Update data: " + funcionario );
		
	}

}
