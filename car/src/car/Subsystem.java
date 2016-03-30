package car;

import java.util.ArrayList;

public class Subsystem implements Car{
	String name;
	int totalPrice = 0;
	
	ArrayList<Car> subSystemsPartsArrayList=new ArrayList<Car>();
	
	public Subsystem(String subSystemName) {
		this.name=subSystemName;
	}
	

	public void addPart(Car subsystem) {
		subSystemsPartsArrayList.add(subsystem);
	}
		
	public void getChilds() {
		// TODO Auto-generated method stub
		// /for(Part p:subSystemsPartsArrayList)
		// /totalPrice=totalPrice+p.getPrice();
		
		System.out.println(subSystemsPartsArrayList);
		//return totalPrice;;
	}
	
	public ArrayList<Car> getList(){
		for(int i=0;i<=subSystemsPartsArrayList.size();i++){
			subSystemsPartsArrayList.get(i);
		}
		return subSystemsPartsArrayList;
	}


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
