package Menu;
import java.util.*;
import Menu.*;
import Inventory.*;
import etc.*;

public class MenuUtama {
	Scanner input = new Scanner(System.in);
public MenuUtama() {
	System.out.print("Welcome to LESMANA CAFE\n=======================\nEnter as : \n1. Customer\n2. Staff\n3. Exit\n>>");
	int who = input.nextInt();
	if (who == 1) {
new MenuCustomer();
	}else if (who == 2) {
		System.out.print("Please Enter Access Code : ");
		String akses = input.next();
		if (!(akses.equals("lesmanastaff"))) {
			System.out.println("\nAccess Denied, Please Re-login\n\n");
			new MenuUtama();
		}else {
			new MenuStaff();
		}
	}else if (who == 3) {
		new exit();
	
	}else {
		new salahangka();
		new MenuUtama();
	}
}
}
