package Order;
import java.util.ArrayList;

public class ViewOrderCustomer extends ListOrder{
	
	public static ArrayList<Integer> amountitemview = new ArrayList<Integer>();
	public static ArrayList<Integer> amountpriceview = new ArrayList<Integer>();
	
 public ViewOrderCustomer() {
	 if (CustomerOrderID.size() == 0) {
		 System.out.println("There no Ongoing order.");
	 }else {
	 
	 System.out.println();
	 for(int i = 0; i < CustomerOrderID.size(); i++) {
	System.out.println("No."+(i+1));
	 System.out.println("==================================================================================");
	 System.out.println("|                                  Lesmana Cafe                                  |");
	 System.out.println("==================================================================================");
	 System.out.printf("| Order ID : %-38s Date : %-21s |%n",CustomerOrderID.get(i),CutomerOrderDate.get(i));
	 System.out.println("----------------------------------------------------------------------------------");
	 System.out.printf("| Customer Name : %-62s |%n",CustomerOrderName.get(i));
	 System.out.println("==================================================================================");
	 System.out.println("|                  Menu Name                  | Item | Price    | Amount  Price  |");
	 System.out.println("----------------------------------------------------------------------------------");
	 for( int j = 0; j<CustomerOrderItem.get(i).length; j++) {
		 SearchPrice sp = new SearchPrice();
		 int item = CustomerOrderQuantity.get(i)[j];
			int price = sp.SearchPrice1(CustomerOrderItem.get(i)[j]);
		  int amountprice = item*price;
	 System.out.printf("| %-43s | %-4d | %-8d | %-14d |%n",CustomerOrderItem.get(i)[j],item,price, amountprice);
	 amountitemview.add(item);amountpriceview.add(amountprice);
	 }
	 int amountitem = 0 , amountprice = 0;
	for(int k = 0; k< amountitemview.size(); k++) {
		int item = amountitemview.get(k);
		amountitem = amountitem + item;
	}
	for(int k = 0; k< amountpriceview.size(); k++) {
		int item = amountpriceview.get(k);
		amountprice = amountprice + item;
	}
	amountitemview.removeAll(amountitemview);
	amountpriceview.removeAll(amountpriceview);
	 System.out.println("==================================================================================");
	 System.out.printf("|                          Amount Item : %-5d|  Amount Transaction : %-10d |%n",amountitem,amountprice);
	 System.out.println("----------------------------------------------------------------------------------");
	 System.out.printf("| Payment By : %-65s |%n",CustomerOrderPayment.get(i));
	 System.out.println("----------------------------------------------------------------------------------");
	 System.out.printf("| Status Order : %-63s |%n",getCutomerOrderNoCard(i));
	 System.out.println("----------------------------------------------------------------------------------");
	 System.out.printf("| Status Order : %-63s |%n",CustomerOrderStatus.get(i));
	 System.out.println("==================================================================================");

	 }}
}
 
 
public static void main(String[] args) {
	new ViewOrderCustomer();
}
}

