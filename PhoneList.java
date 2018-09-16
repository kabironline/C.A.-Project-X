import  java.util.*;

class PhoneList {

	 public static ArrayList<item> list = new ArrayList<item>();
	ProjectK main = new ProjectK ();
	
	public PhoneList() {
		if (main.menu == 1) {
			addSamToArray();	
		}else if(main.menu == 2){
			addAppleToArray();
		}else if(main.menu == 3) {
			addNokiaToArray();
		}else if (main.menu == 4){
			addHuaToArray();
		}
		
	}

	// this Function reads Objects from the ArrayList
	public void print() {
			System.out.println("Num.     Name of Product	Price	  Power	    Storage   RAM");
			Logo.drawLine();
		for (int i = 0;i < list.size() ;i++ ) {
			String iNum = (int)i+")";
			String PriceNum = (int)list.get(i).price+"Rs.";
			String Ram = list.get(i).RAM+"Gb.";
			String nameS = list.get(i).name;
			String PowerStorage = list.get(i).powerStorage+"mAh";
			String Storage = list.get(i).storage+"GB.";
		   	String phoneLine = String.format("%-8s %-22s %-9s %-9s %-9s %s",iNum,nameS,PriceNum,PowerStorage,Storage,Ram);
			System.out.println(phoneLine);
			stop();
		} 
		main.buyOrNot();


	}

	public item get(int index) {
		return list.get(index);
	}


	public void addSamToArray() {

		list.clear();
		list.add (new item ("Samsung J7" , 15000, 3.0, 3600, 256));
		list.add (new item ("Samsung J5" , 12000, 3.0, 3000, 256));
		list.add (new item ("Samsung Note 9" , 88000, 6.0, 4000, 512));
		list.add (new item ("Samsung Note 8" , 65900, 6.0, 3300,256 ));
		list.add (new item ("Samsung Note 6" , 68900, 4.0, 3050, 64));
		list.add (new item ("Samsung S9+" , 64500, 6.0, 4000,256));
		list.add (new item ("Samsung S9" , 57000, 6.0, 4000,256));
		list.add (new item ("Samsung S8+" , 62000, 6.0, 3600,256));
		list.add (new item ("Samsung S8" , 50000, 4.0, 3600,128));
		list.add (new item ("Samsung S7 Edge" , 39500, 4.0, 3500,128));
		list.add (new item ("Samsung S6 Edge" , 35000, 3.0, 3300,128));
		list.add (new item ("Samsung On7" , 13990, 4.0, 3000,64));		

	}
	public void addAppleToArray () {

		list.clear();
		list.add (new item ("Apple iPhone X" , 99000, 3.0, 2716, 256));
		list.add (new item ("Apple iPhone 8+" , 72999, 3.0, 2675,256 ));
		list.add (new item ("Apple iPhone 8" , 69990, 2.0, 1821, 256));
		list.add (new item ("Apple iPhone 7+" , 60990, 3.0,2900 ,128 ));
		list.add (new item ("Apple iPhone 7" , 45999, 2.0, 1960, 128));
		list.add (new item ("Apple iPhone 6s" , 37999, 1.0,2750 ,64 ));
		list.add (new item ("Apple iPhone 6" , 25699, 1.0, 2915, 64));
		list.add (new item ("Apple iPhone SE" , 18990, 1.0, 1624, 64));
		list.add (new item ("Apple iPadPro 12.9'",69900, 4.0,10307 , 128));
		list.add (new item ("Apple iPad 9.7' ",25900, 2.0, 8827, 128));	

	}
	public void addNokiaToArray() {

		list.clear();
		// list.add (new item ("Nokia 8" , 28699, 4.0));
		// list.add (new item ("Nokia 7+" , 25999, 4.0));
		// list.add (new item ("Nokia 6" , 12999, 3.0));
		// list.add (new item ("Nokia 5" , 11700, 2.0));
		// list.add (new item ("Nokia 3" , 8490, 2.0));
		// list.add (new item ("Nokia 2" ,6219 , 1.0));

	}
	public void addHuaToArray() {
		
		list.clear ();
		// list.add (new item ("Huawei P20 Pro" , 64999, 6.0));
		// list.add (new item ("Huawei P20" , 60999, 4.0));
		// list.add (new item ("Huawei Mate 8" , 39999, 3.0));
		// list.add (new item ("Huawei Nexus 6P" ,36999 , 3.0));
		// list.add (new item ("Huawei View 10" , 29999, 6.0));
		// list.add (new item ("Huawei Honor 8 Pro" , 22999, 6.0));
		// list.add (new item ("Huawei Honor 7x" , 15999, 4.0));
		// list.add (new item ("Huawei Honor 9 Lite" , 13999, 3.0));
		// list.add (new item ("Huawei Mate 9" , 12999, 4.0));
		// list.add (new item ("Huawei Honor 8 Smart" , 12999, 4.0));
		// list.add (new item ("Huawei Honor 8" , 8490, 4.0));

	}
		public static void stop() {
		long i = 0;
		while (i <= 100000000) {
			i++;
		}
	}
}