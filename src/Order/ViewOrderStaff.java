package Order;

import java.util.ArrayList;

public class ViewOrderStaff extends ListOrder{
	public static ArrayList<Integer> amountitemview = new ArrayList<Integer>();
	public static ArrayList<Integer> amountpriceview = new ArrayList<Integer>();
public ViewOrderStaff() {
	 if (OrderID.size() == 0) {
		 System.out.println("There no Ongoing order.");
	 }else {
	
	System.out.println();
	 for(int i = 0; i < OrderID.size(); i++) {
		 System.out.println("No."+(i+1));
		 System.out.println("==================================================================================");
		 System.out.println("|                                  Lesmana Cafe                                  |");
		 System.out.println("==================================================================================");
		 System.out.printf("| Order ID : %-38s Date : %-21s |%n",OrderID.get(i),OrderDate.get(i));
		 System.out.println("----------------------------------------------------------------------------------");
		 System.out.printf("| Customer Name : %-62s |%n",OrderName.get(i));
		 System.out.println("==================================================================================");
		 System.out.println("|                  Menu Name                  | Item | Price    | Amount  Price  |");
		 System.out.println("----------------------------------------------------------------------------------");
		 for( int j = 0; j<OrderItem.get(i).length; j++) {
			 SearchPrice sp = new SearchPrice();
			 int item = OrderQuantity.get(i)[j];
				int price = sp.SearchPrice1(OrderItem.get(i)[j]);
			  int amountprice = item*price;
		 System.out.printf("| %-43s | %-4d | %-8d | %-14d |%n",OrderItem.get(i)[j],item,price, amountprice);
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
		 System.out.printf("| Payment By : %-65s |%n",OrderPayment.get(i));
		 System.out.println("----------------------------------------------------------------------------------");
		 System.out.printf("| Status Order : %-63s |%n",OrderStatus.get(i));
		 System.out.println("==================================================================================");

		 }}
	}
public static void main(String[] args) {
	new ViewOrderStaff();
}
}

