
public class ATMClient {
	public static void main(String[]args){
		ATMMachine atmMachine = new ATMMachine();
		atmMachine.insertCard();
		atmMachine.withdrawMoney();
		atmMachine.ejectCard();
	}
}
