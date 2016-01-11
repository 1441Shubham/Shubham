package newFlipkart;

public class Ecomsite{
	paymentMethod pay=null;
	
	public paymentMethod choosePayment(String mode){
		if(mode=="Credit"){
			pay =new CreditCardPayment();
		}else if(mode=="Debit"){
			pay =new DebitCardPayment();
		}else if(mode=="Net"){
			pay =new NetBankingPayment();
		}else if(mode=="Cash"){
			pay =new CashonDelivery();
		}else{
			// addd someyhing
		}
		return pay;
	}
	
	public void makePayment(Item itm){
		pay.makePayment(itm);
	}
}
