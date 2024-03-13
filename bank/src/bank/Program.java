package bank;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		/* Primeiro os dados para o usuario inserir */

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		Account account;
		
		
		System.out.print("is there a initial deposit(y/n)");
		char response = sc.next().charAt(0);
		
		if(response == 'y' || response == 'Y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(account);

		/* Alteração de dados conforme o desejo do usuário */
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("");
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("");
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
		sc.close();
	}

}
