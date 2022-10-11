package Menu;

import Order.*;

import java.util.Scanner;

import Inventory.*;
import etc.*;

public class MenuCustomer {
	Scanner input = new Scanner(System.in);
public MenuCustomer() {
	fillInventory FI = new fillInventory();
	System.out.println();
	System.out.print("Welcome to LESMANA CAFE\n=======================\nWhat do you want?\n1. View Menu\n2. Add Order\n3. View my Order\n4. Exit\n>>");
	int choose = input.nextInt();
	if (choose == 1) {
		FI.view();
		new MenuCustomer();
	}else if (choose == 2) {
		FI.view();
		new NewOrder();
		new MenuCustomer();
	}else if (choose == 3) {
		new ViewOrderCustomer();
		new MenuCustomer();
	}else if (choose == 4) {
		new MenuUtama();
	}else {
		new salahangka();
	}
}
}
