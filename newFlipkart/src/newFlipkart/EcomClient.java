package newFlipkart;

public class EcomClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecomsite ecom=new Ecomsite();
		
		Item itm=new Item("Book",40);
		
		paymentMethod mode = ecom.choosePayment("Credit");
		
		//System.out.println(mode);	

		ecom.makePayment(itm);
	}

}