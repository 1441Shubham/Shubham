
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// assume that item details such as price are defined in class Item.

		Item item1= new Item("Shoes",2500);
		
		int pr=item1.displayPrice();
		
		String itemName=item1.displayName();
		
		System.out.println("itemName "+itemName+" itemPrice "+pr);

		EComsite flipkart = new EComsite();

		//provide "cash/Cash,net/Net,Credit/credit,Debit/debit" as an argument in chosePaymentMethod() below
		String payMode=flipkart.chosePaymentMethod("Cash");

		System.out.println("payMode Chosen "+payMode);
		//X specifies the chosen method

		flipkart.makePayment(item1.getPrice(), payMode);
		//System.out.println("payMode "+price);
		//similarly you can show different payment method for different items…

	}

}
