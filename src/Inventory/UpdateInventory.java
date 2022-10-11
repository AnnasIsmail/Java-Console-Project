package Inventory;
import java.util.Locale.Category;
import java.util.Scanner;

import Menu.MenuStaff;
import etc.salahangka;

public class UpdateInventory extends fillInventory {
	static Scanner sc = new Scanner(System.in);
	
	void viewcategorycoffee() {
		System.out.println("===================================================================================");
		System.out.println("| No | ID    | Menu Name                                | Price           | Stock |");
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(0));
		System.out.println("===================================================================================");
		for (int i=0;i<CoffeeID.size();i++) {
		 System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,CoffeeID.get(i),CoffeeName.get(i),CoffeePrice.get(i),CoffeeStock.get(i));
		}
	
		System.out.println("===================================================================================");
	}
	
	void viewcategorynoncoffee() {
		System.out.println("===================================================================================");
		System.out.println("| No | ID    | Menu Name                                | Price           | Stock |");
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(1));
		System.out.println("===================================================================================");
		for (int i=0;i<NonCoffeeID.size();i++) {
			 System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,NonCoffeeID.get(i),NonCoffeeName.get(i),NonCoffeePrice.get(i),NonCoffeeStock.get(i));
		}
		
		System.out.println("===================================================================================");
	}
	
	void viewcategorysnack() {
		System.out.println("===================================================================================");
		System.out.println("| No | ID    | Menu Name                                | Price           | Stock |");
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(2));
		System.out.println("===================================================================================");
		for (int i=0;i<SnackID.size();i++) {
			System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,SnackID.get(i),SnackName.get(i),SnackPrice.get(i),SnackStock.get(i));
		}
	
		System.out.println("===================================================================================");
	}
	
	void viewcategoryheavymeal() {
		System.out.println("===================================================================================");
		System.out.println("| No | ID    | Menu Name                                | Price           | Stock |");
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(3));
		System.out.println("===================================================================================");
		for (int i=0;i<HeavyMealID.size();i++) {
			 System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,HeavyMealID.get(i),HeavyMealName.get(i),HeavyMealPrice.get(i),HeavyMealStock.get(i));
		}
		
		System.out.println("===================================================================================");
	}
	
	void viewcategorydesserts() {
		System.out.println("===================================================================================");
		System.out.println("| No | ID    | Menu Name                                | Price           | Stock |");
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(4));
		System.out.println("===================================================================================");
		for (int i=0;i<DessertsID.size();i++) {
			 System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,DessertsID.get(i),DessertsName.get(i),DessertsPrice.get(i),DessertsStock.get(i));
		}
		System.out.println("===================================================================================");
	}
	
	
public UpdateInventory() {
	
	System.out.println("What do you want ?");
	System.out.println("1. Update Stock");
	System.out.println("2. Update Inventory");
	System.out.println("3. Add Inventory");
	System.out.println("4. Delete Inventory");
	System.out.println("5. Exit");
	System.out.print(">>");
	int opt = sc.nextInt();
	sc.nextLine();
	String category ;
	String tempCoffeeeeid, tempCoffeeeename = "";
	int  tempCoffeeeeprice, tempCoffeeeestock = 0;
	
	String tempnonCoffeeeeid, tempnonCoffeeeename = "";
	int  tempnonCoffeeeeprice, tempnonCoffeeeestock = 0;
	
	String tempsnackid, tempsnackname = "";
	int  tempsnackprice, tempsnackstock = 0;
	
	String hmid, hmname = "";
	int  hmprice, hmstock = 0;
	
	String dsid, dsname = "";
	int  dsprice, dsstock = 0;
	
	switch (opt) {
	case 1:
		do {
			System.out.print("Category : Coffee, Non Coffee, Snack, Heavy Meal, Desserts \nChoose Category that you want to update Stock : ");
		category = sc.nextLine(); 
	}while(!(category.equalsIgnoreCase("Coffee")) && !(category.equalsIgnoreCase("Non Coffee")) && !(category.equalsIgnoreCase("Snack")) && !(category.equalsIgnoreCase("Heavy meal")) && !(category.equalsIgnoreCase("Desserts")));
	
		if(category.equalsIgnoreCase("Coffee")) {
			viewcategorycoffee();
			System.out.print("Input menu number that you want to update: ");
			int update = sc.nextInt();
			
			System.out.print("Input Coffee Stock: ");
			tempCoffeeeestock = sc.nextInt();
			CoffeeStock.set(update-1,tempCoffeeeestock);
			
		}else if(category.equalsIgnoreCase("Non Coffee")) {
			viewcategorynoncoffee();

			System.out.print("Input menu number that you want to update: ");
			int update = sc.nextInt();
			
			System.out.println("Input Non Coffee Stock: ");
			tempnonCoffeeeestock = sc.nextInt();

			NonCoffeeStock.set(update-1,tempnonCoffeeeestock);
		
		}else if(category.equalsIgnoreCase("Snack")) {
			viewcategorysnack();
		
			System.out.print("Input menu number that you want to update: ");
			int update = sc.nextInt();
			
			
			System.out.print("Input Snack Stock: ");
			tempsnackstock = sc.nextInt();
			SnackStock.set(update-1,tempsnackstock);
		
		}else if(category.equalsIgnoreCase("Heavy meal")) {
			viewcategoryheavymeal();
			System.out.print("Input menu number that you want to update: ");
			int update = sc.nextInt();
			
			System.out.print("Input Heavy Stock: ");
			hmstock = sc.nextInt();
			HeavyMealStock.set(update-1,hmstock);
		
		}else if(category.equalsIgnoreCase("Desserts")) {
			viewcategorydesserts();
			System.out.print("Input menu number that you want to update: ");
			int update = sc.nextInt();
			
			System.out.print("Input Desserts Stock: ");
			dsstock = sc.nextInt();
			DessertsStock.set(update-1,dsstock);
			
		}
		new UpdateInventory();
		
		break;
	case 2:
		do {
			System.out.print("Category : Coffee, Non Coffee, Snack, Heavy Meal, Desserts \nChoose Category that you want to update : ");
			category = sc.nextLine(); 
		}while(!(category.equalsIgnoreCase("Coffee")) && !(category.equalsIgnoreCase("Non Coffee")) && !(category.equalsIgnoreCase("Snack")) && !(category.equalsIgnoreCase("Heavy meal")) && !(category.equalsIgnoreCase("Desserts")));
			
			if(category.equalsIgnoreCase("Coffee")) {
				viewcategorycoffee();
				System.out.print("Input menu number that you want to update: ");
				int update = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Input Coffee ID: ");
				tempCoffeeeeid = sc.nextLine();
				System.out.print("Input Coffee Name: ");
				tempCoffeeeename = sc.nextLine();
				System.out.print("Input Coffee Price: ");
				tempCoffeeeeprice = sc.nextInt();
				System.out.print("Input Coffee Stock: ");
				tempCoffeeeestock = sc.nextInt();
				CoffeeID.set(update-1, tempCoffeeeeid);
				CoffeeName.set(update-1,tempCoffeeeename);
				CoffeePrice.set(update-1,tempCoffeeeeprice);
				CoffeeStock.set(update-1,tempCoffeeeestock);
				
			}else if(category.equalsIgnoreCase("Non Coffee")) {
				viewcategorycoffee();
				System.out.print("Input menu number that you want to update: ");
				int update = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Input Non Coffee ID: ");
				tempnonCoffeeeeid = sc.nextLine();
				System.out.print("Input Non Coffee Name: ");
				tempnonCoffeeeename = sc.nextLine();
				System.out.print("Input Non Coffee Price: ");
				tempnonCoffeeeeprice = sc.nextInt();
				System.out.print("Input Non Coffee Stock: ");
				tempnonCoffeeeestock = sc.nextInt();
				NonCoffeeID.set(update-1,tempnonCoffeeeeid);
				NonCoffeeName.set(update-1,tempnonCoffeeeename);
				NonCoffeePrice.set(update-1,tempnonCoffeeeeprice);
				NonCoffeeStock.set(update-1,tempnonCoffeeeestock);
			
			}else if(category.equalsIgnoreCase("Snack")) {
				viewcategorysnack();
				System.out.print("Input menu number that you want to update: ");
				int update = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Input Snack ID: ");
				tempsnackid = sc.nextLine();
				System.out.print("Input Snack Name: ");
				tempsnackname = sc.nextLine();
				System.out.print("Input Snack Price: ");
				tempsnackprice = sc.nextInt();
				System.out.print("Input Snack Stock: ");
				tempsnackstock = sc.nextInt();
				SnackID.set(update-1,tempsnackid);
				SnackName.set(update-1,tempsnackname);
				SnackPrice.set(update-1,tempsnackprice);
				SnackStock.set(update-1,tempsnackstock);
			
			}else if(category.equalsIgnoreCase("Heavy meal")) {
				viewcategoryheavymeal();
				System.out.print("Input menu number that you want to update: ");
				int update = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Input Heavy Meal ID: ");
				hmid = sc.nextLine();
				System.out.print("Input Heavy Meal Name: ");
				hmname = sc.nextLine();
				System.out.print("Input Heavy Meal Price: ");
				hmprice = sc.nextInt();
				System.out.print("Input Heavy Stock: ");
				hmstock = sc.nextInt();
				HeavyMealID.set(update-1,hmid);
				HeavyMealName.set(update-1,hmname);
				HeavyMealPrice.set(update-1,hmprice);
				HeavyMealStock.set(update-1,hmstock);
			
			}else if(category.equalsIgnoreCase("Desserts")) {
				viewcategorydesserts();
				System.out.print("Input menu number that you want to update: ");
				int update = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Input Desserts ID: ");
				dsid = sc.nextLine();
				System.out.print("Input Desserts Name: ");
				dsname = sc.nextLine();
				System.out.print("Input Desserts Price: ");
				dsprice = sc.nextInt();
				System.out.print("Input Desserts Stock: ");
				dsstock = sc.nextInt();
				DessertsID.set(update-1,dsid);
				DessertsName.set(update-1,dsname);
				DessertsPrice.set(update-1,dsprice);
				DessertsStock.set(update-1,dsstock);
				
			}
			new UpdateInventory();
		break;
		
	case 3:
		do {
			System.out.print("Category : Coffee, Non Coffee, Snack, Heavy Meal, Desserts \nChoose Category that you want to add : ");
			category = sc.nextLine();
			}while(!category.equalsIgnoreCase("Coffee") && !category.equalsIgnoreCase("Non Coffee") && !category.equalsIgnoreCase("Snack") && !category.equalsIgnoreCase("Heavy meal") && !category.equalsIgnoreCase("Desserts" ));
			
			if(category.equalsIgnoreCase("Coffee")) {
				System.out.print("Input Coffee ID: ");
				tempCoffeeeeid = sc.nextLine();
				System.out.print("Input Coffee Name: ");
				tempCoffeeeename = sc.nextLine();
				System.out.print("Input Coffee Price: ");
				tempCoffeeeeprice = sc.nextInt();
				System.out.print("Input Coffee Stock: ");
				tempCoffeeeestock = sc.nextInt();
				CoffeeID.add(tempCoffeeeeid);
				CoffeeName.add(tempCoffeeeename);
				CoffeePrice.add(tempCoffeeeeprice);
				CoffeeStock.add(tempCoffeeeestock);
				
			}else if(category.equalsIgnoreCase("Non Coffee")) {
				System.out.print("Input Non Coffee ID: ");
				tempnonCoffeeeeid = sc.nextLine();
				System.out.print("Input Non Coffee Name: ");
				tempnonCoffeeeename = sc.nextLine();
				System.out.print("Input Non Coffee Price: ");
				tempnonCoffeeeeprice = sc.nextInt();
				System.out.print("Input Non Coffee Stock: ");
				tempnonCoffeeeestock = sc.nextInt();
				NonCoffeeID.add(tempnonCoffeeeeid);
				NonCoffeeName.add(tempnonCoffeeeename);
				NonCoffeePrice.add(tempnonCoffeeeeprice);
				NonCoffeeStock.add(tempnonCoffeeeestock);
			
			}else if(category.equalsIgnoreCase("Snack")) {
				System.out.print("Input Snack ID: ");
				tempsnackid = sc.nextLine();
				System.out.print("Input Snack Name: ");
				tempsnackname = sc.nextLine();
				System.out.print("Input Snack Price: ");
				tempsnackprice = sc.nextInt();
				System.out.print("Input Snack Stock: ");
				tempsnackstock = sc.nextInt();
				SnackID.add(tempsnackid);
				SnackName.add(tempsnackname);
				SnackPrice.add(tempsnackprice);
				SnackStock.add(tempsnackstock);
			
			}else if(category.equalsIgnoreCase("Heavy meal")) {
				System.out.print("Input Heavy Meal ID: ");
				hmid = sc.nextLine();
				System.out.print("Input Heavy Meal Name: ");
				hmname = sc.nextLine();
				System.out.print("Input Heavy Meal Price: ");
				hmprice = sc.nextInt();
				System.out.print("Input Heavy Stock: ");
				hmstock = sc.nextInt();
				HeavyMealID.add(hmid);
				HeavyMealName.add(hmname);
				HeavyMealPrice.add(hmprice);
				HeavyMealStock.add(hmstock);
			
			}else if(category.equalsIgnoreCase("Desserts")) {
				System.out.print("Input Desserts ID: ");
				dsid = sc.nextLine();
				System.out.print("Input Desserts Name: ");
				dsname = sc.nextLine();
				System.out.print("Input Desserts Price: ");
				dsprice = sc.nextInt();
				System.out.print("Input Desserts Stock: ");
				dsstock = sc.nextInt();
				DessertsID.add(dsid);
				DessertsName.add(dsname);
				DessertsPrice.add(dsprice);
				DessertsStock.add(dsstock);
				
			}
			System.out.println("Item added successfully!!");
			new UpdateInventory();
		break;
	case 4:
		String remove = "";
		int removeisi = 0;
		do {
			System.out.print("Category : Coffee, Non Coffee, Snack, Heavy Meal, Desserts \nChoose Category that you want to remove : ");
		remove = sc.nextLine();
		}while(!remove.equalsIgnoreCase("Coffee") && !remove.equalsIgnoreCase("Non Coffee") && !remove.equalsIgnoreCase("Snack") && !remove.equalsIgnoreCase("Heavy meal") && !remove.equalsIgnoreCase("Desserts" ));
		
		
		
		if(remove.equalsIgnoreCase("Coffee")) {
			viewcategorycoffee();
			System.out.print("Input menu number that you want to delete: ");
			removeisi = sc.nextInt();
			CoffeeID.remove(removeisi-1);
			CoffeeName.remove(removeisi-1);
			CoffeePrice.remove(removeisi-1);
			CoffeeStock.remove(removeisi-1);
			System.out.println("Menu deleted successfull!");
			

			
			
		}else if(remove.equalsIgnoreCase("Non Coffee")) {
			viewcategorynoncoffee();
			System.out.print("Input menu number that you want to delete: ");
			removeisi = sc.nextInt();
			NonCoffeeID.remove(removeisi-1);
			NonCoffeeName.remove(removeisi-1);
			NonCoffeePrice.remove(removeisi-1);
			NonCoffeeStock.remove(removeisi-1);
			System.out.println("Menu deleted successfull!");

		
		}else if(remove.equalsIgnoreCase("Snack")) {
			viewcategorysnack();
			System.out.print("Input menu number that you want to delete: ");
			removeisi = sc.nextInt();
			SnackID.remove(removeisi-1);
			SnackName.remove(removeisi-1);
			SnackPrice.remove(removeisi-1);
			SnackStock.remove(removeisi-1);
			System.out.println("Menu deleted successfull!");

		
		}else if(remove.equalsIgnoreCase("Heavy meal")) {
			viewcategoryheavymeal();
			System.out.print("Input menu number that you want to delete: ");
			removeisi = sc.nextInt();
			HeavyMealID.remove(removeisi-1);
			HeavyMealName.remove(removeisi-1);
			HeavyMealPrice.remove(removeisi-1);
			HeavyMealStock.remove(removeisi-1);
			System.out.println("Menu deleted successfull!");

		
		}else if(remove.equalsIgnoreCase("Desserts")) {
			viewcategorydesserts();
			System.out.print("Input menu number that you want to delete: ");
			removeisi = sc.nextInt();
			DessertsID.remove(removeisi-1);
			DessertsName.remove(removeisi-1);
			DessertsPrice.remove(removeisi-1);
			DessertsStock.remove(removeisi-1);
			System.out.println("Menu deleted successfull!");
		
		}
		
		new UpdateInventory();
		break;
	case 5:
new MenuStaff();
	default:
		new salahangka();
		new UpdateInventory();
		break;
	}
}
}
