package newFlipkart;

public class NetBankingPayment implements paymentMethod {

	@Override
	public void makePayment(Item itm) {
		// TODO Auto-generated method stub
		System.out.println("Net Banking Payment Successfully Done!!!");
		System.out.println("Thank You..");
	}

}