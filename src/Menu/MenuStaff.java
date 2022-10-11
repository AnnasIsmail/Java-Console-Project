package Menu;

import Order.*;

import java.util.Scanner;

import Inventory.*;
import etc.*;

public class MenuStaff {
	Scanner input = new Scanner(System.in);
public MenuStaff() {
	fillInventory FI = new fillInventory();
	System.out.print("Welcome to LESMANA CAFE\n=======================\nWhat do you want?\n1. Update Inventory \n2. View Inventory\n3. View ongoing Order\n4. View order History\n5. Exit\n>>");
	int choose = input.nextInt();
	if (choose == 1) {
		new UpdateInventory();
	}else if (choose == 2) {
		FI = new ViewStaff();
		FI.view();
		new MenuStaff();
	}else if (choose == 3) {
		ViewOrderCustomer VO =  new ViewOrderCustomer();
		 if (VO.CustomerOrderID.size() == 0) {
			 new MenuStaff();
		 }else {
		new ChangeStatusOrder();
		new MenuStaff();}
	}else if (choose == 4) {
		new ViewOrderStaff();
		new MenuStaff();
	}else if (choose == 5) {
		new MenuUtama();
	}else {
		new salahangka();
	}
	
}


}
