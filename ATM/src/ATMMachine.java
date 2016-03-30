
public class ATMMachine {
	private ATMState atmstate;
	public ATMMachine()
	{
		System.out.println("ATM is Created.");
		this.atmstate = noCardState.createNoCardState(this);  //this is ex of singlton factory method that creates closed door and assigns closed state
	}
	
	public void insertCard(){
		System.out.println("Card insert selected");
		this.atmstate = hasCardState.createHasCardState(this);
	} 
	public void withdrawMoney(){
		System.out.println("withdrawMoney selected .");
		atmstate.withdrawMoney();
		
	}
	public void ejectCard(){
		System.out.println("ejectCard selected");
		atmstate.ejectCard();
		this.atmstate = noCardState.createNoCardState(this);
	}

	public void changeState(ATMState atmState) //set the state to arguments
	{
		this.atmstate=atmState;
	}
	
		
}
