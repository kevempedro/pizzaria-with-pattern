package State;

import Pizzeria.Pizza;;

public class Doing implements StatusOrder {
	private Pizza pizza;
	
	@Override
	public void changeStatusOrder(Pizza pizza) {
		this.pizza = pizza;
		this.pizza.setStatusOrder("Your pizza is ready!");
	}
}
