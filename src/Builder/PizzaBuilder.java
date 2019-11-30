package Builder;

import Pizzeria.Pizza;

public class PizzaBuilder {
	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}
	
	public PizzaBuilder hasTomato(boolean tomato) {
		this.pizza.setTomato(tomato);
		return this;
	}
	
	public PizzaBuilder hasOnion(boolean onion) {
		this.pizza.setOnion(onion);
		return this;
	}
	
	public PizzaBuilder hasPepper(boolean pepper) {
		this.pizza.setPepper(pepper);
		return this;
	}
	
	public PizzaBuilder hasCatupiry(boolean catupiry) {
		this.pizza.setCatupiry(catupiry);
		return this;
	}
	
	public PizzaBuilder isNome(String name) {
		this.pizza.setName(name);
		return this;
	}
	
	public PizzaBuilder isSize(String size) {
		this.pizza.setSize(size);
		return this;
	}
	
	public Pizza build() {
		return this.pizza;
	}
}
