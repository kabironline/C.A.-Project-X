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
	
	public void addToCart( String name, int price, double ram) {
		MyCart.add(new Cart(name, price, ram));
	}
	
	public void printCart(){
		if (MyCart.size() == 0) {
			System.out.println("There is nothing in your cart");

		}else {
			for (int i = 0;i <= MyCart.size()-1 ;i++ ) {
			System.out.println(MyCart.get(i).name + " The Price is: " + MyCart.get(i).price +" with total RAM of: " + MyCart.get(i).RAM+ "GB is in your cart");
			stop();
			}
		}
	}

	private int addTotal() {
		for (int i = 0;i <= MyCart.size()-1 ;i++ ) {
			finalPrice = finalPrice + (MyCart.get(i).price);
		}
		return finalPrice;
	}
	public static void stop() {
		long i = 0;
		while (i <= 100000000) {
			i++;
		}
	}
}