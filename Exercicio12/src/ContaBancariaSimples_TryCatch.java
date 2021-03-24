import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.entities.exception.DomainException;

public class ContaBancariaSimples_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withDrawLimit = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		double amountWithDraw = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withDrawLimit);
		account.withdraw(amountWithDraw);
		
		System.out.println();
		
		System.out.print(account.toString());
		
		
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Saldo inicial apenas aceita números.");
		}
		
		sc.close();
	}

}
