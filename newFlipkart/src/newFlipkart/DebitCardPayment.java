package newFlipkart;

public class DebitCardPayment implements paymentMethod {

	@Override
	public void makePayment(Item itm) {
		// TODO Auto-generated method stub
		System.out.println("Debit Card Payment Successfully Done for Item: ");
		System.out.println(itm.name + " of price: "+itm.price);
		System.out.println("Thank You..");
	}

}
