import java.util.*;
class item {


	public String name = "";  
	public int price = 0;
	public double RAM = 0;
	public int storage = 0;
	public int powerStorage = 0;
	public item ( String Name, int Price, double Ram, int powerStorage,int storage){
		
		this.name = Name;
		this.price = Price;
		this.RAM = Ram;
		this.storage = storage;
		this.powerStorage = powerStorage;
	}

}