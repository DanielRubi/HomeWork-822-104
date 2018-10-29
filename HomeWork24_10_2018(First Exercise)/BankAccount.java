package HomeWork24_10_2018;

import java.util.Scanner;

public class BankAccount {
	
	private String accountName;
	private String accountNum;
	private double balance;
	private boolean isOverDraftAllowed;
	private double overDraftSum;
	
	// constructor
	
	public BankAccount() {
		this.accountName = "Account";
		this.accountNum = "000001";
		this.balance = 0;
		this.isOverDraftAllowed = false;
		this.overDraftSum = 0;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = overDraftSum;
	}
	
	public double deposit (double cash) {
		if(cash > 0) {
			cash += this.getBalance();
			this.setBalance(cash);
			return cash;
		}else {
			System.out.println("is not possible to deposit a negative figure, the balance of the account is " + this.getBalance());
		}
			
		return cash;
	}
	
	public double withdrawal(double withDrawCash) {
		
		if(withDrawCash >0 && withDrawCash < this.getBalance()) {
			
			this.balance -= withDrawCash; 
			System.out.println("withdraw of " + withDrawCash + " was approved!" );
			
		} else if(withDrawCash >0 &&  withDrawCash > this.balance && this.isOverDraftAllowed == false) {
			boolean approv = false;
			Scanner input = new Scanner(System.in);
			System.out.println("you don't have enought funds for complete this withdraw!");
			System.out.println("you may withdraw " + this.getBalance());
			System.out.print("would lile to withdraw? (true/false)");
			approv = input.nextBoolean();
			if(approv) {
				this.balance = 0;
			}else {
				System.out.println("withdraw was canceled!");
			}
			
			
		}else if(withDrawCash > this.getBalance() && withDrawCash >0 && this.isOverDraftAllowed == true ) {
			Scanner input = new Scanner(System.in);
			boolean approv = false;
			System.out.println("you don't have enought funds to withdraw " + withDrawCash);
			System.out.print(" you can use a special loan to withdraw, would you like to proceed?(true/false)" );
			approv = input.nextBoolean();
			if(approv && withDrawCash < this.getOverDraftSum() && withDrawCash < (this.getBalance()+ this.getOverDraftSum())) {
				
				this.balance -= withDrawCash;
				System.out.println("the balance of the account is: "+ this.getBalance() );
					
				
			}else {
				
				System.out.println("withdraw was canceled, the value requested is bigger than the special loan approved! ");
				
			}
			
			
			
		}else {
			System.out.println("error!");
		}
		
		
		
		return withDrawCash;
		
	}

	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + "\naccountNum=" + accountNum + "\nbalance=" + balance + "]";
	}
	
	
	
	
	
	
	
	
}
