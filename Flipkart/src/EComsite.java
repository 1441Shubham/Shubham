
public class EComsite {
	

	public void makePayment(Object price, String payMode) {
		// TODO Auto-generated method stub
		if(payMode=="Credit Card"){
			System.out.println("Credit Card payment Successfully made.");
			System.out.println("Thank You!!!");
		}else if(payMode=="Debit Card"){
			System.out.println("Debit Card payment Successfully made.");
			System.out.println("Thank You!!!");
		}else if(payMode=="Net-Banking"){
			System.out.println("Net-Banking payment Successfully made.");
			System.out.println("Thank You!!!");
		}else if(payMode=="Cash on Delivery"){
			System.out.println("Your Ordered Item will be Delivered to you shortly.");
			System.out.println("Thank You!!!");
		}else{
			
		}
	}

	public String chosePaymentMethod(String paymentMode) {
		// TODO Auto-generated method stub
		if(paymentMode=="credit" || paymentMode=="Credit"){
			return "Credit Card";
		}else if(paymentMode=="debit" || paymentMode=="Debit"){
			return "Debit Card";
		}else if(paymentMode=="Net" || paymentMode=="net"){
			return "Net-Banking";
		}else if(paymentMode=="Cash" || paymentMode=="cash"){
			return "Cash on Delivery";
		}else{
			return "Woung Choice.";
		}
	}

}
