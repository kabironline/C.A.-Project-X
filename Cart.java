import java.util.*;

class Cart {

	ArrayList<Cart> MyCart = new ArrayList<Cart>();
	public String name = "";  
	public int price = 0;
	public double RAM = 0;
	public int finalPrice = 0;

	public Cart (String Name, int Price, double Ram){
		this.name  = Name;
		this.price = Price;
		this.RAM   = Ram;
	}
}