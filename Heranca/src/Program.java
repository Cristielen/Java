import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 1000.0, 0.01);

		Account x = new Account(1001, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Joice", 1000.0, 0.01);

		x.withdraw(50.0);
		y.withdraw(50.0);

		System.out.println("X - " + x.getBalance());
		System.out.println("Y - " + y.getBalance());

		//--------------------------------------------------------
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

		// DOWNCAST
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

		sc.close();
	}

}
