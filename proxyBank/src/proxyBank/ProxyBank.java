package proxyBank;

public class ProxyBank implements bank{

 String login = null;
	String bal = null;
 public RealBank obj;

	public void setlogin(String l){
		this.login = l;
	}
	
	public String getlogin(){
		return login;
	}
	
	public void getBalance() {
		String lgin = getlogin();
		if(lgin == null){
			System.out.println("Please Login!!");
		}else{
			if(obj == null){
				obj = new RealBank();
		      }
			obj.getBalance();
		}
		
	}

	@Override
	public void withdraw(int amount) {
		if(login == null){
			System.out.println("Please Login!!");
		}else{
			if(obj == null){
				obj = new RealBank();
		      }
			System.out.println("You are logged in, Permitted to withdraw: ");
			 obj.withdraw(amount);
		}
		
	}

	@Override
	public void deposit(int amount) {
		if(login == null){
			System.out.println("Please Login!!");
		}else{
			if(obj == null){
				obj = new RealBank();
		      }
			System.out.println("You are logged in, Permitted to deposit: ");
			 obj.deposit(amount);
		}
	}
}