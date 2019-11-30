package Pizzeria;

public class Pizza {
	private boolean tomato;
	private boolean onion;
	private String name;
	private String size;
	private boolean pepper;
	private boolean catupiry;
	private String statusOrder = "Your pizza is wating";
	
	public boolean isTomato() {
		return tomato;
	}
	
	public void setTomato(boolean tomato) {
		this.tomato = tomato;
	}
	
	public boolean isOnion() {
		return onion;
	}
	
	public void setOnion(boolean onion) {
		this.onion = onion;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public boolean isPepper() {
		return pepper;
	}
	
	public void setPepper(boolean pepper) {
		this.pepper = pepper;
	}
	
	public boolean isCatupiry() {
		return catupiry;
	}
	
	public void setCatupiry(boolean catupiry) {
		this.catupiry = catupiry;
	}
	
	public String getStatusOrder() {
		return statusOrder;
	}

	public void setStatusOrder(String statusOrder) {
		this.statusOrder = statusOrder;
	}
}
