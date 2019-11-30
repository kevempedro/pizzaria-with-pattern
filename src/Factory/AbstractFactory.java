package Factory;

import Pizzeria.Pizza;

public interface AbstractFactory {
	public Pizza buildPizza(String flavor);
}
