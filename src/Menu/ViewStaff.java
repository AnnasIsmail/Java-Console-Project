package Menu;
import Inventory.fillInventory;

public class ViewStaff extends fillInventory {

	public void view() {
		if(CategoryName.size() == 0) {
			System.out.println("No Availabe item");
		}else {
		System.out.println("===================================================================================");
		System.out.println("| No | ID    | Menu Name                                | Price           | Stock |");
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(0));
		System.out.println("===================================================================================");
		for (int i=0;i<CoffeeID.size();i++) {
		 System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,CoffeeID.get(i),CoffeeName.get(i),CoffeePrice.get(i),CoffeeStock.get(i));
		}
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(1));
		System.out.println("===================================================================================");
		for (int i=0;i<NonCoffeeID.size();i++) {
			 System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,NonCoffeeID.get(i),NonCoffeeName.get(i),NonCoffeePrice.get(i),NonCoffeeStock.get(i));
		}
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(2));
		System.out.println("===================================================================================");
		for (int i=0;i<SnackID.size();i++) {
			System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,SnackID.get(i),SnackName.get(i),SnackPrice.get(i),SnackStock.get(i));
		}
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(3));
		System.out.println("===================================================================================");
		for (int i=0;i<HeavyMealID.size();i++) {
			 System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,HeavyMealID.get(i),HeavyMealName.get(i),HeavyMealPrice.get(i),HeavyMealStock.get(i));
		}
		
		System.out.println("===================================================================================");
		System.out.printf("|   %-78s|%n",CategoryName.get(4));
		System.out.println("===================================================================================");
		for (int i=0;i<DessertsID.size();i++) {
			 System.out.printf("| %-3d| %-6s| %-41s| RP. %-12s| %-6s|%n",i+1,DessertsID.get(i),DessertsName.get(i),DessertsPrice.get(i),DessertsStock.get(i));
		}
		System.out.println("===================================================================================");
	}
		}
	
	
	

}

