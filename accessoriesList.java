import java.util.*;
public class accessoriesList {
	public static ArrayList<item> list = new ArrayList<item>();
	public accessoriesList() {
		if(ProjectK.accessoriesmenu == 1 ){
			addEarPhone();
		}if(ProjectK.accessoriesmenu == 2 ){
			addHeadPhone();
		}if(ProjectK.accessoriesmenu == 3 ){
			addSDCard();
		}if(ProjectK.accessoriesmenu == 4 ){
			addPowerBank();
		}
	}
	public static void print(){
		if (ProjectK.accessoriesmenu == 1) {
			printHeadPhones();
		}
		if (ProjectK.accessoriesmenu == 2) {
			printHeadPhones();
		}
		if (ProjectK.accessoriesmenu == 3) {
			printStorageDrive();
		}
		if (ProjectK.accessoriesmenu == 4) {
			printPowerBanks();
		}
	}
	public static void printStorageDrive () {
		System.out.println("Num.     Name of Product	Storage	Price");
		Logo.drawLine();
		for (int i = 0;i < list.size() ;i++ ) {
				String iNum = (int)i+")";
				String PriceNum = (int)list.get(i).price+"Rs.";
				String nameS = list.get(i).name;
				String Storage = (int)list.get(i).storage + "GB.";
				String phoneLine = String.format("%-8s %-22s %-12s %-6s",iNum,nameS,Storage,PriceNum);
				System.out.println(phoneLine);
				ProjectK.stop(1);
		}
	}
	public static void printPowerBanks () {
		System.out.println("Num.     Name of Product	Capacity	Price");
		Logo.drawLine();
		for (int i = 0;i < list.size() ;i++ ) {
				String iNum = (int)i+")";
				String PriceNum = (int)list.get(i).price+"Rs.";
				String nameS = list.get(i).name;
				String PowerStorage = (int)list.get(i).powerStorage + "mAh";
				String phoneLine = String.format("%-8s %-22s %-14s %5s",iNum,nameS,PowerStorage,PriceNum);
				System.out.println(phoneLine);
				ProjectK.stop(1);
		}
	}

	public static void printHeadPhones (){
				System.out.println("Num.     Name of Product	price");
		Logo.drawLine();
		for (int i = 0;i < list.size() ;i++ ) {
				String iNum = (int)i+")";
				String PriceNum = (int)list.get(i).price+"Rs.";
				String nameS = list.get(i).name;
				String phoneLine = String.format("%-8s %-22s %s",iNum,nameS,PriceNum);
				System.out.println(phoneLine);
				ProjectK.stop(1);
		}
	}
	public item get (int index) {
		return list.get(index);
	}
	public static void addHeadPhone(){
		list.clear();
		list.add( new item ("Sony XB-650",6900 ,0 ,0,0));
		list.add( new item ("Sony XB-550",2650 ,0 ,0,0));
		list.add( new item ("Sony XB-450",1990 ,0 ,0,0));
		list.add( new item ("Sony XB-250",1490 ,0 ,0,0));
		list.add( new item ("Sennheiser HD 4.50",15000, 0,0,0));
		list.add( new item ("Sennheiser HD 4.40",7800 , 0,0,0));
		list.add( new item ("Sennheiser HD 4.30",5620 , 0,0,0));
		list.add( new item ("Sennheiser HD 4.20",3486 , 0,0,0));
		list.add( new item ("Sennheiser HD 220 ",1449 , 0,0,0));
	}
	public static void addEarPhone(){
		list.clear();
		list.add(new item( "Sony XB-55 ",1455 ,0 ,0,0));
		list.add(new item( "Sony XB-150",899  ,0 ,0,0));
		list.add(new item( "Sennheiser CX SPORTS",9990 , 0,0 ,0));
		list.add(new item( "Sennheiser CX 3.00",1500 , 0,0 ,0));
		list.add(new item( "Sennheiser CX 180 II",1090 , 0,0 ,0));
		list.add(new item( "Sennheiser CX 180",990 , 0,0 ,0));
		list.add(new item( "Sennheiser CX 213",1490 , 0,0,0));
	}
	public static void addSDCard () {
		list.clear();
		list.add(new item("Samsung Evo Class 10 ",3200 ,128 ,0,0));
		list.add(new item("Samsung Evo Class 10 ",1295 ,64 ,0,0));
		list.add(new item("Samsung Evo Class 10 ",900 ,32 ,0,0));
		list.add(new item("SanDisk Class 10", 7890,256 ,0,0));
		list.add(new item("SanDisk Class 10", 2500,128 ,0,0));
		list.add(new item("SanDisk Class 10", 1250,64 ,0,0));
		list.add(new item("SanDisk Class 10", 750,32 ,0,0));
		list.add(new item("SanDisk Class 10", 420,16 ,0,0));
	}
	public static void addPowerBank() {
		list.clear();
		list.add(new item ("Phillips Li-Ion Bank",2080,0,13000, 0));	
		list.add(new item ("Phillips Li-Ion Bank",1750,0,10000, 0));	
		list.add(new item ("Phillips Li-Ion Bank",1300,0,8000, 0));	
		list.add(new item ("Phillips Li-Ion Bank",1100,0,5000, 0));	
		list.add(new item ("Mi Li-Polymer Bank ",1500 , 0,20000, 0));	
		list.add(new item ("Mi Li-Polymer Bank ",800 , 0,10000, 0));	
	}
}