package vehicleState;

public class moving extends vehicleState{

private static moving movinginstance;

private moving(Vehicle v)
{
	super();
	this.vehicle = v;
}

	@Override
	public void applyBrake() {
		System.out.println("The car is stopped");
		vehicle.changeState(idle.createIdleState(vehicle));
	}
	
	public static moving createMovingState(Vehicle v)
	{
		if(movinginstance == null){
			movinginstance = new moving(v);
			System.out.println("Moving State Instance Created");
		}
			
		System.out.println("The car is now in moving state");
		return movinginstance;
	}

}
