package HomeWork24_10_2018;

import java.util.Scanner;

public class TestBankAccount {
	
	
	
	public static void testWithdraw() {
		Scanner input = new Scanner(System.in);
		BankAccount test = new BankAccount();
		System.out.print("type balance of account:");
		test.setBalance(input.nextDouble());
		System.out.print("would like to activate loan?(true/false)");
		test.setOverDraftAllowed(input.nextBoolean());
		if(test.isOverDraftAllowed()) {
			System.out.print("how much money would like to allocate to loan?");
			test.setOverDraftSum(input.nextDouble());
			System.out.print("how much money would you like to withdraw?");
			test.withdrawal(input.nextDouble());
			System.out.println("balance is: " + test.getBalance());
		}else {
			System.out.println("how much money would you like to withdraw?");
			test.withdrawal(input.nextDouble());
			System.out.println("balance is: " + test.getBalance());
			
		}
		
		
	}
	
	public static void deposit() {
		Scanner input = new Scanner(System.in);
		BankAccount test = new BankAccount();
		System.out.print("type balance of account:");
		test.setBalance(input.nextDouble());
		System.out.print("how much money would you like to deposit?");
		test.deposit(input.nextDouble());
		System.out.println("balance is: " + test.getBalance());
	}

}
