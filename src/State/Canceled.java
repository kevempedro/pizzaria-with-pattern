package State;

import Pizzeria.Pizza;

public class Canceled implements StatusOrder {
	private Pizza pizza;
	
	@Override
	public void changeStatusOrder() {
		this.pizza.setStatusOrder("Your pizza has been canceled!");
	}
}
