
public class Item {
	int itemPrice;
	String itm;
	public Item(String itemname, int price) {
		// TODO Auto-generated constructor stub
		itm=itemname;
		itemPrice=price;
	}
	
	public String displayName(){
		return itm;
	}
	
	public int displayPrice(){
		return itemPrice;
	}

	public Object getPrice() {

		// TODO Auto-generated method stub
		return itemPrice;
	}

}
