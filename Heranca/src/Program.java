import java.util.ArrayList;
import java.util.List;
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

		//Account x = new Account(1001, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Joice", 1000.0, 0.01);

		//x.withdraw(50.0);
		y.withdraw(50.0);

		//System.out.println("X - " + x.getBalance());
		System.out.println("Y - " + y.getBalance());
		
		System.out.println();
		
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002,  "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n ", sum);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		for(Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n ", acc.getNumber(), acc.getBalance());
		}

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
