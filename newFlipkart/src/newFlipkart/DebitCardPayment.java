package newFlipkart;

public class DebitCardPayment implements paymentMethod {

	@Override
	public void makePayment(Item itm) {
		// TODO Auto-generated method stub
		System.out.println("Debit Card Payment Successfully Done!!!");
		System.out.println("Thank You..");
	}

}
