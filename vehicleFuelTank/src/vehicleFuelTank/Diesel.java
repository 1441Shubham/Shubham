package vehicleFuelTank;
public class Diesel implements FeulType{

	@Override
	public void fillTank() {
		System.out.println("Your Car engine is of type compression ignition. Your Car tank is being filled with Diesel.");
		
	}

}
