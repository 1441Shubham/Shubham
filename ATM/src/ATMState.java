public abstract class ATMState {

	//connect to door class as it needs to change the state 
	ATMMachine atmMachine;

	//these are two abstract methods to  be implemented in subclasses
	public abstract void insertCard(); 
	public abstract void withdrawMoney();
	public abstract void ejectCard();

	//set the door to particular door value
	public void setATMMachine(ATMMachine atmMachine)
	{
		this.atmMachine=atmMachine;
	}
}
