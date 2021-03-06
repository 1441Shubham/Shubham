package vehicleState;

public class idle extends vehicleState{

private static idle idleinstance;

	private idle(Vehicle v)
	{
		setVehicle(v);
	}

	@Override
	public void applyBrake() {
		System.out.println("The car is in Idle state. Applying Break will have no effect.");
		
	}
	
	public static idle createIdleState(Vehicle v)
	{
		if(idleinstance == null){
			idleinstance = new idle(v);
			System.out.println("Idle State Instance Created");
		}
			
		System.out.println("The car is now in Idle state");
		return idleinstance;
	}

}
