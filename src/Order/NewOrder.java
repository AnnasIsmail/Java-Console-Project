package Order;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 
import java.util.Scanner;


public class NewOrder extends ListOrder{
	SearchPrice sp = new SearchPrice();
	Scanner input = new Scanner(System.in);

	public NewOrder() {
		
		
		ArrayList<String> menuorder = new ArrayList<String>(); 
		ArrayList<Integer> amountorder = new ArrayList<Integer>(); 
		
		
		String payment,extra,TD,order = "";
		boolean Coffee,NonCoffee,Snack,HeavyMeal,Desserts;
		String orderID = "";
		int quantitymenu,stock = 0;
		
		System.out.print("Input Your Name : ");
		String namecustomer = input.nextLine();
		CustomerOrderName.add(namecustomer);
		do {
			
			do {
		System.out.print("Input Menu Name (Case Sensitive) : ");
		order = input.nextLine();
		 Coffee = CoffeeName.contains(order);
		 
		 if (Coffee == true) {
			 int lokasi = CoffeeName.indexOf(order);
			 System.out.println("Price of "+order+" : "+sp.SearchPrice1(order));
			 stock = CoffeeStock.get(lokasi);
			 System.out.print("Input Quantity : ");
			 quantitymenu = input.nextInt();
			 if(stock < quantitymenu) {
			 do {
				 System.out.println("Available Stock : "+stock);
			 System.out.print("Input Quantity : ");
				 quantitymenu = input.nextInt();
			 }while ( stock < quantitymenu);}
			 int stocksetelah = stock-quantitymenu;
			 CoffeeStock.set(lokasi, stocksetelah);
			 amountorder.add(quantitymenu);
		 }
		 
		 NonCoffee = NonCoffeeName.contains(order);
		if (NonCoffee == true) {
			 int lokasi = NonCoffeeName.indexOf(order);
			 System.out.println("Price of "+order+" : "+sp.SearchPrice1(order));
			 stock = NonCoffeeStock.get(lokasi);
			 System.out.print("Input Quantity : ");
			 quantitymenu = input.nextInt();
			 if(stock < quantitymenu) {
			 do {
				 System.out.println("Available Stock : "+stock);
			 System.out.print("Input Quantity : ");
				 quantitymenu = input.nextInt();
			 }while ( stock < quantitymenu);}
			 int stocksetelah = stock-quantitymenu;
			 NonCoffeeStock.set(lokasi, stocksetelah);
			 amountorder.add(quantitymenu);
		}
			 Snack = SnackName.contains(order);
			if (Snack == true) {
				int lokasi = SnackName.indexOf(order);
				System.out.println("Price of "+order+" : "+sp.SearchPrice1(order));
				stock = SnackStock.get(lokasi);   
				 System.out.print("Input Quantity : ");
				 quantitymenu = input.nextInt();
				 if(stock < quantitymenu) {
				 do {
					 System.out.println("Available Stock : "+stock);
				 System.out.print("Input Quantity : ");
					 quantitymenu = input.nextInt();
				 }while ( stock < quantitymenu);}
				 int stocksetelah = stock-quantitymenu;
				 SnackStock.set(lokasi, stocksetelah);
				 amountorder.add(quantitymenu);
			}
				 HeavyMeal = HeavyMealName.contains(order);
				if (HeavyMeal == true) {
					int lokasi = HeavyMealName.indexOf(order);
					System.out.println("Price of "+order+" : "+sp.SearchPrice1(order));
					stock = HeavyMealStock.get(lokasi);
					 System.out.print("Input Quantity : ");
					 quantitymenu = input.nextInt();
					 if(stock < quantitymenu) {
					 do {
						 System.out.println("Available Stock : "+stock);
					 System.out.print("Input Quantity : ");
						 quantitymenu = input.nextInt();
					 }while ( stock < quantitymenu);}
					 int stocksetelah = stock-quantitymenu;
					 HeavyMealStock.set(lokasi, stocksetelah);
					 amountorder.add(quantitymenu);
				}	 
					 Desserts =  DessertsName.contains(order);
					if (Desserts == true) {
						int lokasi = DessertsName.indexOf(order);
						System.out.println("Price of "+order+" : "+sp.SearchPrice1(order));
						stock = DessertsStock.get(lokasi);
						 System.out.print("Input Quantity : ");
						 quantitymenu = input.nextInt();
						 if(stock < quantitymenu) {
						 do {
							 System.out.println("Available Stock : "+stock);
						 System.out.print("Input Quantity : ");
							 quantitymenu = input.nextInt();
						 }while ( stock < quantitymenu);}
						int stocksetelah = stock-quantitymenu;
						 DessertsStock.set(lokasi, stocksetelah);
						 amountorder.add(quantitymenu);
					}
		
			}while(Coffee == false && NonCoffee == false && Snack == false && HeavyMeal == false && Desserts == false);
		
			input.nextLine();
		
		System.out.print("are there any extras [ 'Y' for Yes / N for 'No' ]: ");
		extra = input.nextLine();
		menuorder.add(order);
		}while((extra.equalsIgnoreCase("y")));
		
		if(!extra.equals("n")) {
			do {
				System.out.print("are there any extras [ 'Y' for Yes / N for 'No' ]: ");
				extra = input.nextLine();
				menuorder.add(order);
				}while((extra.equalsIgnoreCase("y")));	
			}else {
		
		
		String[] allmenuorder = menuorder.toArray(new String[0]);
		Integer[] allamountorder = amountorder.toArray(new Integer[0]);
		CustomerOrderItem.add(allmenuorder);
		CustomerOrderQuantity.add(allamountorder);
			}
		
		do {
		System.out.print("'T' for Take Away / 'D' for Dine In : ");
		 TD = input.nextLine();
		}while(!(TD.equalsIgnoreCase("t")) &&  !(TD.equalsIgnoreCase("d")));
		CustomerOrderTD.add(TD);
		
		 int amountprice = 0;
		 
			for(int k = 0; k< amountorder.size(); k++) {
				int item = amountorder.get(k);
				int price = sp.SearchPrice1(menuorder.get(k));
				amountprice = amountprice + price*item;
			}
			
		
		System.out.println("Your Total Purchase Bill : "+amountprice);
		do {
		System.out.print("Payment By [Only Card and Cash] : " );
		payment = input.nextLine();
		}while(!(payment.equalsIgnoreCase("cash")) && !(payment.equalsIgnoreCase("card")));
		
		LocalDateTime Date = LocalDateTime.now();  
		DateTimeFormatter FormatDate = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy"); 
		String DateAfter = Date.format(FormatDate);  
		
		String hurufrandom = namecustomer.substring(0,2);
		double angkarandom =  Math.random();
		String randomString = String.valueOf(angkarandom); 
		orderID = hurufrandom + randomString.substring(2,7);
		int Card = 0;
		if(payment.equalsIgnoreCase("card")) {
			System.out.print("Enter your card Number : ");
			Card = input.nextInt();
			System.out.print("Enter the pin of your Card : ");
			int Pin = input.nextInt();
		}
		
		System.out.println("Your Order ID : " + orderID);
		
		
		setCutomerOrderNoCard(Card);
		CustomerOrderID.add(orderID);
		CustomerOrderPayment.add(payment);
		CustomerOrderStatus.add("On Going");
		CutomerOrderDate.add(DateAfter);
		
	}
	public static void main(String[] args) {
		new NewOrder();
	}
}
