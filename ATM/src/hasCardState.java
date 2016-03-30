
public class hasCardState extends ATMState{
	//singlton closed door instance
private static hasCardState hasCardStateinstance;

//private constructor 
private hasCardState(ATMMachine atmMachine)
{
	setATMMachine(atmMachine);
}

//singleton method creates instance of closed door

public static ATMState createHasCardState(ATMMachine atmMachine) {
	if(hasCardStateinstance == null){
		hasCardStateinstance = new hasCardState(atmMachine);
		System.out.println("hasCardStateinstance created");
	}
		
	System.out.println("The ATM is now in hasCardState");
	return hasCardStateinstance;
}

@Override
public void insertCard() {
	// TODO Auto-generated method stub
	System.out.println("Cannot perform Insert. Card already present.");
	
}

@Override
public void withdrawMoney() {
	// TODO Auto-generated method stub
	System.out.println("withdraw is successfull ");
	
}

@Override
public void ejectCard() {
	// TODO Auto-generated method stub
	System.out.println("Card Ejected.");
	//this.atmstate = noCardState.createoCardState(this);
	
}
}
