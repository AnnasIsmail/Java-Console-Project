package Inventory;
import java.util.*;

public class fillInventory {
	public static ArrayList<String> CategoryName = new ArrayList<String>();
	
	public static ArrayList<String> CoffeeID = new ArrayList<String>();
	public static ArrayList<String> CoffeeName = new ArrayList<String>();
	public static ArrayList<Integer> CoffeePrice = new ArrayList<Integer>();
	public static ArrayList<Integer> CoffeeStock = new ArrayList<Integer>();
	
	public static ArrayList<String> NonCoffeeID = new ArrayList<String>();
	public static ArrayList<String> NonCoffeeName = new ArrayList<String>();
	public static ArrayList<Integer> NonCoffeePrice = new ArrayList<Integer>();
	public static ArrayList<Integer> NonCoffeeStock = new ArrayList<Integer>();
	
	public static ArrayList<String> SnackID = new ArrayList<String>();
	public static ArrayList<String> SnackName = new ArrayList<String>();
	public static ArrayList<Integer> SnackPrice = new ArrayList<Integer>();
	public static ArrayList<Integer> SnackStock = new ArrayList<Integer>();
	
	public static ArrayList<String> HeavyMealID = new ArrayList<String>();
	public static ArrayList<String> HeavyMealName = new ArrayList<String>();
	public static ArrayList<Integer> HeavyMealPrice = new ArrayList<Integer>();
	public static ArrayList<Integer> HeavyMealStock = new ArrayList<Integer>();
	
	public static ArrayList<String> DessertsID = new ArrayList<String>();
	public static ArrayList<String> DessertsName = new ArrayList<String>();
	public static ArrayList<Integer> DessertsPrice = new ArrayList<Integer>();
	public static ArrayList<Integer> DessertsStock = new ArrayList<Integer>();
	
	public fillInventory() {
		if(CategoryName.size()>0) {
			
		}else {
		CategoryName.add("Coffee");CategoryName.add("Non Coffee");CategoryName.add("Snack");CategoryName.add("Heavy Meal");CategoryName.add("Desserts");
		
		CoffeeID.add("CF001");CoffeeName.add("Espresso");CoffeePrice.add(12000);CoffeeStock.add(15);
		CoffeeID.add("CF002");CoffeeName.add("Caramel Latte");CoffeePrice.add(13000);CoffeeStock.add(10);
		CoffeeID.add("CF003");CoffeeName.add("Vanilla Latte");CoffeePrice.add(13000);CoffeeStock.add(4);
		CoffeeID.add("CF004");CoffeeName.add("Pandan Latte");CoffeePrice.add(15000);CoffeeStock.add(6);
		CoffeeID.add("CF005");CoffeeName.add("Americano");CoffeePrice.add(10000);CoffeeStock.add(7);
		CoffeeID.add("CF006");CoffeeName.add("Affogato");CoffeePrice.add(10000);CoffeeStock.add(8);
		CoffeeID.add("CF007");CoffeeName.add("Long Black");CoffeePrice.add(10000);CoffeeStock.add(10);
		CoffeeID.add("CF008");CoffeeName.add("Matcha Espresso");CoffeePrice.add(11000);CoffeeStock.add(2);
		CoffeeID.add("CF009");CoffeeName.add("Cappucino");CoffeePrice.add(15000);CoffeeStock.add(4);
		CoffeeID.add("CF010");CoffeeName.add("Hazelnut Espresso");CoffeePrice.add(14000);CoffeeStock.add(3);
		
		NonCoffeeID.add("NC001");NonCoffeeName.add("Milk");NonCoffeePrice.add(8000);NonCoffeeStock.add(5);
		NonCoffeeID.add("NC002");NonCoffeeName.add("Tea");NonCoffeePrice.add(5000);NonCoffeeStock.add(6);
		NonCoffeeID.add("NC003");NonCoffeeName.add("Boba Milk Tea");NonCoffeePrice.add(12000);NonCoffeeStock.add(7);
		NonCoffeeID.add("NC004");NonCoffeeName.add("Matcha");NonCoffeePrice.add(13000);NonCoffeeStock.add(5);
		NonCoffeeID.add("NC005");NonCoffeeName.add("Orange Juice");NonCoffeePrice.add(10000);NonCoffeeStock.add(9);
		NonCoffeeID.add("NC006");NonCoffeeName.add("Mango Juice");NonCoffeePrice.add(20000);NonCoffeeStock.add(5);
		NonCoffeeID.add("NC007");NonCoffeeName.add("Red Velvet");NonCoffeePrice.add(15000);NonCoffeeStock.add(7);
		NonCoffeeID.add("NC008");NonCoffeeName.add("Taro");NonCoffeePrice.add(15000);NonCoffeeStock.add(8);
		NonCoffeeID.add("NC009");NonCoffeeName.add("Mineral Water");NonCoffeePrice.add(3000);NonCoffeeStock.add(10);
		NonCoffeeID.add("NC010");NonCoffeeName.add("Fruit Punch");NonCoffeePrice.add(12000);NonCoffeeStock.add(7);
		
		SnackID.add("SC001");SnackName.add("French Fries");SnackPrice.add(20000);SnackStock.add(10);
		SnackID.add("SC002");SnackName.add("Potato Wedges");SnackPrice.add(20000);SnackStock.add(8);
		SnackID.add("SC003");SnackName.add("Roti Bakar");SnackPrice.add(15000);SnackStock.add(9);
		SnackID.add("SC004");SnackName.add("Chicken Wings");SnackPrice.add(25000);SnackStock.add(5);
		SnackID.add("SC005");SnackName.add("Beef Burger");SnackPrice.add(20000);SnackStock.add(11);
		SnackID.add("SC006");SnackName.add("Cheese Burger");SnackPrice.add(23000);SnackStock.add(15);
		SnackID.add("SC007");SnackName.add("Prawn Salad");SnackPrice.add(22000);SnackStock.add(6);
		SnackID.add("SC008");SnackName.add("Pancake");SnackPrice.add(18000);SnackStock.add(4);
		SnackID.add("SC009");SnackName.add("Roti Canai");SnackPrice.add(15000);SnackStock.add(8);
		SnackID.add("SC010");SnackName.add("Hot Dog");SnackPrice.add(20000);SnackStock.add(3);
		
		HeavyMealID.add("HM001");HeavyMealName.add("Fried Rice");HeavyMealPrice.add(25000);HeavyMealStock.add(9);
		HeavyMealID.add("HM002");HeavyMealName.add("Fried Noodle");HeavyMealPrice.add(25000);HeavyMealStock.add(6);
		HeavyMealID.add("HM003");HeavyMealName.add("Beef Bowl");HeavyMealPrice.add(35000);HeavyMealStock.add(8);
		HeavyMealID.add("HM004");HeavyMealName.add("Chicken Katsu");HeavyMealPrice.add(35000);HeavyMealStock.add(8);
		HeavyMealID.add("HM005");HeavyMealName.add("Sop Iga");HeavyMealPrice.add(45000);HeavyMealStock.add(1);
		HeavyMealID.add("HM006");HeavyMealName.add("Nasi Bakar");HeavyMealPrice.add(20000);HeavyMealStock.add(7);
		HeavyMealID.add("HM007");HeavyMealName.add("Honey Chicken Rice");HeavyMealPrice.add(35000);HeavyMealStock.add(15);
		HeavyMealID.add("HM008");HeavyMealName.add("Ramen");HeavyMealPrice.add(30000);HeavyMealStock.add(2);
		HeavyMealID.add("HM009");HeavyMealName.add("Ramyeon");HeavyMealPrice.add(30000);HeavyMealStock.add(3);
		HeavyMealID.add("HM010");HeavyMealName.add("Sushi");HeavyMealPrice.add(25000);HeavyMealStock.add(4);
		
		DessertsID.add("DS001");DessertsName.add("Ice Cream");DessertsPrice.add(15000);DessertsStock.add(7);
		DessertsID.add("DS002");DessertsName.add("Banana Split");DessertsPrice.add(15000);DessertsStock.add(8);
		DessertsID.add("DS003");DessertsName.add("Cheese Cake");DessertsPrice.add(15000);DessertsStock.add(9);
		DessertsID.add("DS004");DessertsName.add("Chocolate Cake");DessertsPrice.add(15000);DessertsStock.add(12);
		DessertsID.add("DS005");DessertsName.add("Rainbow Cake");DessertsPrice.add(15000);DessertsStock.add(3);
		DessertsID.add("DS006");DessertsName.add("Matcha Cake");DessertsPrice.add(15000);DessertsStock.add(4);
		DessertsID.add("DS007");DessertsName.add("Apple Pie");DessertsPrice.add(15000);DessertsStock.add(6);
		DessertsID.add("DS008");DessertsName.add("Lemon Chiffon");DessertsPrice.add(15000);DessertsStock.add(6);
		DessertsID.add("DS009");DessertsName.add("Lapis Legit");DessertsPrice.add(15000);DessertsStock.add(8);
		DessertsID.add("DS010");DessertsName.add("Chocolate Custard");DessertsPrice.add(15000);DessertsStock.add(4);
		}

	}
	
	public void view() {
		System.out.println("===================================================================");
		System.out.println("| No | Menu Name                                | Price           |");
		int j =1;
		System.out.println("===================================================================");
		System.out.printf("|   %-62s|%n",CategoryName.get(0));
		System.out.println("===================================================================");
		for (int i=0;i<CoffeeID.size();i++) {
		 System.out.printf("| %-3d| %-41s| RP. %-12s|%n",j,CoffeeName.get(i),CoffeePrice.get(i));
		 j++;
		}
		
		System.out.println("===================================================================");
		System.out.printf("|   %-62s|%n",CategoryName.get(1));
		System.out.println("===================================================================");
		for (int i=0;i<NonCoffeeID.size();i++) {
			 System.out.printf("| %-3d| %-41s| RP. %-12s|%n",j,NonCoffeeName.get(i),NonCoffeePrice.get(i));
			 j++;
		}
		
		System.out.println("===================================================================");
		System.out.printf("|   %-62s|%n",CategoryName.get(2));
		System.out.println("===================================================================");
		for (int i=0;i<SnackID.size();i++) {
			System.out.printf("| %-3d| %-41s| RP. %-12s|%n",j,SnackName.get(i),SnackPrice.get(i));
			j++;
		}
		
		System.out.println("===================================================================");
		System.out.printf("|   %-62s|%n",CategoryName.get(3));
		System.out.println("===================================================================");
		for (int i=0;i<HeavyMealID.size();i++) {
			 System.out.printf("| %-3d| %-41s| RP. %-12s|%n",j,HeavyMealName.get(i),HeavyMealPrice.get(i));
			 j++;
		}
		
		System.out.println("===================================================================");
		System.out.printf("|   %-62s|%n",CategoryName.get(4));
		System.out.println("===================================================================");
		for (int i=0;i<DessertsID.size();i++) {
			 System.out.printf("| %-3d| %-41s| RP. %-12s|%n",j,DessertsName.get(i),DessertsPrice.get(i));
			 j++;
		}
		System.out.println("===================================================================");
	}
	
}


