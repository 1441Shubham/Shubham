package vehicleState;

public abstract class vehicleState { 
Vehicle vehicle;

public abstract void applyBrake();

public void setVehicle(Vehicle v)
{
	this.vehicle=v;
}
}