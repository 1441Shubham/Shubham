package proxyBank;

public class client {
	
	   public static void main(String[] args) {
		   ProxyBank bank = new ProxyBank();
		   
		   //RealBank bank1 = new RealBank();

		   bank.getBalance();
		   bank.setlogin("logged");
	      
		   bank.getBalance();
		   bank.withdraw(50);
		   bank.getBalance();
		   bank.deposit(100);
		   bank.getBalance();
	   }
	}