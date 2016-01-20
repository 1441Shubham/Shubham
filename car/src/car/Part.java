package car;

public class Part implements Car {
	String name;
	int price;
	public Part(String partName, int partPrice) {
		this.name=partName;
		this.price=partPrice;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		
		return price;
	}

}
