package vehicleState;

public class Vehicle {
	private vehicleState vehicleState;
	public void applyBrake() {
		System.out.println("applyBrake called on vehicle");
		vehicleState.applyBrake();
	}
	
	public Vehicle()
	{
		System.out.println("Driver Set in the Vehicle");
		this.vehicleState = moving.createMovingState(this);  //this is ex of singlton factory method that creates closed door and assigns closed state
	}
	public void changeState(vehicleState v) //set the state to arguments
	{
		this.vehicleState=v;
	}


}
