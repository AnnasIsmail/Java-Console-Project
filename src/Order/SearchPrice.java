package Order;

import Inventory.fillInventory;

public class SearchPrice extends fillInventory{
	
public int SearchPrice1(String name) {
	
	boolean coffe,Noncoffe,Snack,HeavyMeal,Desserts;
	int price = 0;

	 coffe = CoffeeName.contains(name);
	 
	 if (coffe == true) {
		 int lokasi = CoffeeName.indexOf(name);
		price = CoffeePrice.get(lokasi);
	 }
	 
	 Noncoffe = NonCoffeeName.contains(name);
	if (Noncoffe == true) {
		 int lokasi = NonCoffeeName.indexOf(name);
		 price = NonCoffeePrice.get(lokasi);
	}
	
		 Snack = SnackName.contains(name);
		if (Snack == true) {
			int lokasi = SnackName.indexOf(name);
			price = SnackPrice.get(lokasi);
		}
			 HeavyMeal = HeavyMealName.contains(name);
			if (HeavyMeal == true) {
				int lokasi = HeavyMealName.indexOf(name);
				price = HeavyMealPrice.get(lokasi);
			}	 
				 Desserts =  DessertsName.contains(name);
				if (Desserts == true) {
					int lokasi = DessertsName.indexOf(name);
					price = DessertsPrice.get(lokasi);
				}
	return price;
	
}
}
