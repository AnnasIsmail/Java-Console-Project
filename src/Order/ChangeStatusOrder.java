package Order;

import java.util.Scanner;

import Menu.MenuStaff;

public class ChangeStatusOrder extends ListOrder{
		public ChangeStatusOrder() {
			String finish = "";
			int number = 0;
			Scanner input = new Scanner(System.in);
			System.out.print("what number do you want to change status : ");
			number = input.nextInt();
			input.nextLine();
			do {
			System.out.print("is the order finished? ['N' to No and 'Y' to Yes] :");
			finish = input.nextLine();
			}while(!finish.equalsIgnoreCase("y") && !finish.equalsIgnoreCase("n"));
			
			if(finish.equalsIgnoreCase("y")) {
				
				String ID = CustomerOrderID .get(number-1); 
				String Name = CustomerOrderName.get(number-1); 
				String[] item = CustomerOrderItem.get(number-1);  
				Integer[] Quantity = CustomerOrderQuantity.get(number-1);  
				String TD = CustomerOrderTD.get(number-1);  
				String Payment = CustomerOrderPayment.get(number-1);  
				String Status = "Done";  
				String Date = CutomerOrderDate.get(number-1);
				
				
				 OrderID.add(ID); 
				 OrderName.add(Name);
				 OrderItem.add(item); 
				 OrderQuantity.add(Quantity);  
				 OrderTD.add(TD);  
				 OrderPayment.add(Payment);
				 OrderStatus.add(Status);  
				 OrderDate.add(Date);
				 
				 
				
				System.out.println("Successfully Update status order to 'Done' ");
				new MenuStaff();
			}else {
				new MenuStaff();
			}
		}
		public static void main(String[] args) {
			new ChangeStatusOrder();
		}
}
