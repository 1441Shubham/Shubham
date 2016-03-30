package vehicleFuelTank;

public class Vehicle {
	String engineType;
	FeulType fuel=null;
	
	public void setEngineType(String engine){
		this.engineType = engine;
	}
	
	public String getEngineType(){
		return engineType;
	}
	
	public void getFuel(){
		String eng = getEngineType();
		if( eng =="spark ignition"){
			fuel =new Petrol();
		}else if( eng =="compression ignition"){
			fuel =new Diesel();
		}
	}

	public void fillTank() {
		fuel.fillTank();
		
	}
}
