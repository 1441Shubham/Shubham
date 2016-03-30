
public class noCardState extends ATMState {
	
//singlton closed door instance
private static noCardState noCardStateinstance;

//private constructor 
private noCardState(ATMMachine atmMachine)
{
	setATMMachine(atmMachine);
}

//singleton method creates instance of closed door

public static ATMState createNoCardState(ATMMachine atmMachine) {
	if(noCardStateinstance == null){
		noCardStateinstance = new noCardState(atmMachine);
		System.out.println("noCardStateinstance created");
	}
		
	System.out.println("The ATM is now in noCardState");
	return noCardStateinstance;
}

@Override
public void insertCard() {
	// TODO Auto-generated method stub
	System.out.println("Card Inserted.");
	
}

@Override
public void withdrawMoney() {
	// TODO Auto-generated method stub
	System.out.println("Please Insert Card to withdrawMoney");
	
}

@Override
public void ejectCard() {
	// TODO Auto-generated method stub
	System.out.println("No Card Inserted. Eject operation Failed.");
	
}
}
