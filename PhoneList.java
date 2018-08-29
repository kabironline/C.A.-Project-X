import  java.util.*;

class PhoneList {

	 public static ArrayList<Phone> list = new ArrayList<Phone>();
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
			System.out.println("Num.     Name of Product	RAM 	price");
			Logo.drawLine();
		for (int i = 0;i < list.size() ;i++ ) {
			String iNum = (int)i+")";
			String PriceNum = (int)list.get(i).price+"Rs.";
			String Ram = list.get(i).RAM+"Gb.";
			String nameS = list.get(i).name;
			String phoneLine = String.format("%-8s %-22s %-7s %s",iNum,nameS,Ram,PriceNum);
			System.out.println(phoneLine);
			stop();
		} 
		main.buyOrNot();


	}

	public Phone get(int index) {
		return list.get(index);
	}


	public void addSamToArray() {

		list.clear();
		list.add (new Phone ("Samsung J7" , 15000, 3.0));
		list.add (new Phone ("Samsung J5" , 12000, 3.0));
		list.add (new Phone ("Samsung J3" , 8800, 2.0));
		list.add (new Phone ("Samsung J2" , 6590, 2.0));
		list.add (new Phone ("Samsung J1" , 6890, 1.0));
		list.add (new Phone ("Samsung S9+" , 64500, 6.0));
		list.add (new Phone ("Samsung S9" , 57000, 6.0));
		list.add (new Phone ("Samsung S8+" , 62000, 6.0));
		list.add (new Phone ("Samsung S8" , 50000, 4.0));
		list.add (new Phone ("Samsung S7 Edge" , 39500, 4.0));
		list.add (new Phone ("Samsung S6 Edge" , 35000, 3.0));
		list.add (new Phone ("Samsung On7" , 13990, 4.0));

	}
	public void addAppleToArray () {

		list.clear();
		list.add (new Phone ("Apple iPhone X" , 99000, 3.0));
		list.add (new Phone ("Apple iPhone 8+" , 72999, 1.0));
		list.add (new Phone ("Apple iPhone 8" , 69990, 2.0));
		list.add (new Phone ("Apple iPhone 7+" , 60990, 3.0));
		list.add (new Phone ("Apple iPhone 7" , 45999, 2.0));
		list.add (new Phone ("Apple iPhone 6s" , 37999, 1.0));
		list.add (new Phone ("Apple iPhone 6" , 25699, 1.0));
		list.add (new Phone ("Apple iPhone SE" , 18990, 1.0));
		list.add (new Phone ("Apple iPadPro 12.9'",69900, 4.0));
		list.add (new Phone ("Apple iPad 9.7' ",25900, 2.0));

	}
	public void addNokiaToArray() {

		list.clear();
		list.add (new Phone ("Nokia 8" , 28699, 4.0));
		list.add (new Phone ("Nokia 7+" , 25999, 4.0));
		list.add (new Phone ("Nokia 6" , 12999, 3.0));
		list.add (new Phone ("Nokia 5" , 11700, 2.0));
		list.add (new Phone ("Nokia 3" , 8490, 2.0));
		list.add (new Phone ("Nokia 2" ,6219 , 1.0));

	}
	public void addHuaToArray() {
		
		list.clear ();
		list.add (new Phone ("Huawei P20 Pro" , 64999, 6.0));
		list.add (new Phone ("Huawei P20" , 60999, 4.0));
		list.add (new Phone ("Huawei Mate 8" , 39999, 3.0));
		list.add (new Phone ("Huawei Nexus 6P" ,36999 , 3.0));
		list.add (new Phone ("Huawei View 10" , 29999, 6.0));
		list.add (new Phone ("Huawei Honor 8 Pro" , 22999, 6.0));
		list.add (new Phone ("Huawei Honor 7x" , 15999, 4.0));
		list.add (new Phone ("Huawei Honor 9 Lite" , 13999, 3.0));
		list.add (new Phone ("Huawei Mate 9" , 12999, 4.0));
		list.add (new Phone ("Huawei Honor 8 Smart" , 12999, 4.0));
		list.add (new Phone ("Huawei Honor 8" , 8490, 4.0));

	}
	    public static void stop() {
        long i = 0;
        while (i <= 100000000) {
            i++;
        }
	}
}