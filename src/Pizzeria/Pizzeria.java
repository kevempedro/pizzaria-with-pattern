package Pizzeria;

import State.*;

public class Pizzeria {
	
	private StatusOrder statusOrder;
	
	public void changeStatusOrder(String status, Pizza pizza) {
		if(status.equalsIgnoreCase("Doing")) {
			this.statusOrder = new Doing();
			this.statusOrder.changeStatusOrder(pizza);
			
		} else if(status.equalsIgnoreCase("Done")) {
			this.statusOrder = new Done();
			this.statusOrder.changeStatusOrder(pizza);
			
		} else if(status.equalsIgnoreCase("Canceled")) {
			this.statusOrder = new Canceled();
			this.statusOrder.changeStatusOrder(pizza);
			
		} else {
			this.statusOrder = new Doing();
			this.statusOrder.changeStatusOrder(pizza);
		}
	}
}
