package proxyBank;

public class RealBank implements bank {
	public int balance = 500;

	@Override
	public void getBalance() {
		System.out.println("Your balance is: "+balance );
	}

	@Override
	public void withdraw(int amount) {
		
		//System.out.println("Withdraw operation done successfully.");
		balance = balance - amount;
		
	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
		
	}
	}