package newFlipkart;

public class Ecomsite{
	paymentMethod pay=null;
	
	public void choosePayment(String mode){
		if(mode=="Credit"){
			pay =new CreditCardPayment();
		}else if(mode=="Debit"){
			pay =new DebitCardPayment();
		}else if(mode=="Net"){
			pay =new NetBankingPayment();
		}else{
			pay =new CashonDelivery();
		}
	}
	
	public void makePayment(Item itm){
		pay.makePayment(itm);
	}
}
