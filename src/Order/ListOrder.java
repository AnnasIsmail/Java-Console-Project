package Order;

import java.util.ArrayList;
import Inventory.*;

public abstract class ListOrder extends fillInventory{
	public static ArrayList<String> OrderID = new ArrayList<String>();
	public static ArrayList<String> OrderName = new ArrayList<String>();
	public static ArrayList<String[]> OrderItem = new ArrayList<String[]>();
	public static ArrayList<Integer[]> OrderQuantity = new ArrayList<Integer[]>();
	public static ArrayList<String> OrderTD = new ArrayList<String>();
	public static ArrayList<String> OrderPayment = new ArrayList<String>();
	public static ArrayList<String> OrderStatus = new ArrayList<String>();
	public static ArrayList<String>  OrderDate = new ArrayList<String>();
	private static ArrayList<String>  OrderNoCard = new ArrayList<String>();
	
	public static ArrayList<String>  CustomerOrderID = new ArrayList<String>();
	public static ArrayList<String> CustomerOrderName = new ArrayList<String>();
	public static ArrayList<String[]> CustomerOrderItem = new ArrayList<String[]>();
	public static ArrayList<Integer[]> CustomerOrderQuantity = new ArrayList<Integer[]>();
	public static ArrayList<String> CustomerOrderTD = new ArrayList<String>();
	public static ArrayList<String>  CustomerOrderPayment = new ArrayList<String>();
	public static ArrayList<String>  CustomerOrderStatus = new ArrayList<String>();
	public static ArrayList<String>  CutomerOrderDate = new ArrayList<String>();
	private static ArrayList<Integer>  CutomerOrderNoCard = new ArrayList<Integer>();
	
	public ListOrder() {
		if (OrderID.size()>0) {
			
		}else {
			String[] one = {"Roti Bakar","Fried Rice","Ice Cream"};
			Integer[] two = {2,2,2};
			
			OrderID.add("SF10012");OrderName.add("Sandrio");OrderItem.add(one);OrderQuantity.add(two);OrderTD.add("Dine In");OrderPayment.add("Card");OrderStatus.add("Done");OrderDate.add("18:38:10 10-11-2021");

		}
	}
	
   public void setCutomerOrderNoCard(int no) {
		CutomerOrderNoCard.add(no);
	}
	
	public int getCutomerOrderNoCard(int i) {
	 return 	CutomerOrderNoCard.get(i);
	}
	
	

}
