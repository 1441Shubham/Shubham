package newFlipkart;

public class EcomClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecomsite ecom=new Ecomsite();
		
		Item itm=new Item("Book",40);
		
		ecom.choosePayment("Cash");

		ecom.makePayment(itm);
	}

}
