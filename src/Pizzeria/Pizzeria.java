package Pizzeria;

import State.*;
import Util.ExceptionPizza;

public class Pizzeria {
	
	private StatusOrder statusOrder;

	public void selldPizza(String flavor) {
		
	}
	
	public void changeStatusOrder(String status) throws ExceptionPizza {
		if(status.equalsIgnoreCase("doing")) {
			this.statusOrder = new Doing();
			this.statusOrder.changeStatusOrder();
			
		} else if(status.equalsIgnoreCase("done")) {
			this.statusOrder = new Done();
			this.statusOrder.changeStatusOrder();
			
		} else if(status.equalsIgnoreCase("canceled")) {
			this.statusOrder = new Canceled();
			this.statusOrder.changeStatusOrder();
		}
		
		throw new ExceptionPizza();
	}
}
