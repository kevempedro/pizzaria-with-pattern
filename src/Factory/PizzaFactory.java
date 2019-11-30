package Factory;

import Builder.PizzaBuilder;
import Pizzeria.*;

public class PizzaFactory implements AbstractFactory {
	@Override
	public Pizza buildPizza(String flavor) {
		if(flavor.equalsIgnoreCase("Pepperoni")) {
			return new PizzaBuilder()
					.isNome("Pepperoni")
					.hasPepper(false)
					.hasCatupiry(true)
					.hasOnion(false)
					.isSize("M")
					.hasTomato(true)
					.build();
			
		} else if(flavor.equalsIgnoreCase("Mozzarella")) {
			return new PizzaBuilder()
					.isNome("Mozzarela")
					.hasPepper(true)
					.hasCatupiry(false)
					.hasOnion(true)
					.isSize("M")
					.hasTomato(false)
					.build();
		}
		
		return new PizzaBuilder()
				.isNome("Mozzarela")
				.hasPepper(false)
				.hasCatupiry(false)
				.hasOnion(true)
				.isSize("P")
				.hasTomato(true)
				.build();
	}
}
