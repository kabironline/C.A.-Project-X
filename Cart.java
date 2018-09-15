import java.util.*;

class Cart {
	public static int screenWidth = 140;
    public static int finalPrice;
    public static int amt;
    public static int boxWidth = 54;
    public static int priceHolder = 0;
    public static int menu;
    public static ArrayList<Cart> Mycart = new ArrayList<Cart>();
    public static Cart cartItem = new Cart("",0,0.0,0,0,0);
    ArrayList<Cart> MyCart = new ArrayList<Cart>();
	public String name = "";  
	public int price = 0;
    public double RAM = 0;
    public int storage=0;
    public int powerStorage = 0;

	public Cart (String Name, int Price, double Ram, int storage,int powerStorage,int Storage){
		this.name  = Name;
		this.price = Price;
        this.RAM   = Ram;
        this.powerStorage =powerStorage;
        this.storage = storage;
	}
	public static void cart(){
        finalPrice = 0;
        ProjectK.clear();
        boolean exit = false;
        int choose = 0;
        Scanner sc = new Scanner (System.in);
        if (Mycart.size() == 0) {
            System.out.println("There is nothing in your cart!?!?");

        }else {
            System.out.println(Mycart.size() + " item(s) are in your cart.");
            System.out.println("Num.     Name of Product	Price	  Power	    RAM");
            Logo.drawLine();
            for (int i = 0;i <= Mycart.size()-1 ;i++ ) {
                finalPrice += Mycart.get(i).price;

                String iNum = (int)i+")";
                String PriceNum = (int)Mycart.get(i).price+"Rs.";
                String Ram = Mycart.get(i).RAM+"GB.";
                String nameS = Mycart.get(i).name;
               	String PowerStorage = Mycart.get(i).powerStorage+"mAh";
               	String Storage = Mycart.get(i).storage+"GB.";
                String phoneLine = String.format("%-8s %-22s %-9s %-9s %s",iNum,nameS,PriceNum,PowerStorage,Ram);
                System.out.println(phoneLine);
                stop(1);
            }
        }
        printAmtBox();
        System.out.println("");
        System.out.println("Print 1 to check out your cart");
        System.out.println("Press 2 to delete items from your cart ");
        System.out.println("Press 3 to clear your cart");
        System.out.println("Press 4 to return back to the menu");
        while (!exit){
            ProjectK.integerCheck("please select your choice: ");
            choose =ProjectK.intYouNeed;
            if (choose== 1 || choose == 2 || choose == 3 || choose == 4) {
                if (choose == 1) {
                    ProjectK.addressCheck();
                }else if (choose == 2){
                    deleteMenu();
                }else if (choose == 3) {
                    clearCart();
                }else if (choose == 4) {
                    ProjectK.start();
                }
                exit = true;
            }else{
                System.out.println("Wrong Choice!!");
                System.out.print("Please choose an option form the list : ");
            }
        }
    }
	public static void addItemsToCart (){
        PhoneList list = new PhoneList();
        boolean exit = false;
        while(!exit){
            ProjectK.integerCheck("Enter the number allocated to the mobile you want to buy or enter 999 to cancel the placement of order");
            if (ProjectK.intYouNeed == 999) {
                ProjectK.home();
            }else if ((ProjectK.intYouNeed >= 0) && (ProjectK.intYouNeed < PhoneList.list.size()) ){
                String Name = list.get(ProjectK.intYouNeed).name;
                int Price = list.get(ProjectK.intYouNeed).price;
                double RAM = list.get(ProjectK.intYouNeed).RAM;
                int Storage = list.get(ProjectK.intYouNeed).storage;
                int PowerStorage = list.get(ProjectK.intYouNeed).powerStorage;
                Cart mycart = new Cart(Name,Price,RAM,Storage,PowerStorage,0);
                cartItem = mycart;
                itemQuantityAdder(mycart);
            }
        }
    }

    public static void itemQuantityAdder (Cart item) {
        boolean exit = false;
        boolean exit2 = false;
        PhoneList list = new PhoneList();
        String Name = item.name;
        while (!exit) {
            ProjectK.integerCheck("You have selected : " + Name + "\nPlease enter quantity or enter 999 to exit");
            if (ProjectK.isNumber) {
                if (ProjectK.intYouNeed == 999) {
                    ProjectK.home();
                }else{
                    while(!exit2) {
                        if (ProjectK.intYouNeed > 0 && ProjectK.intYouNeed <=10) {
                            for (int i = 1; i <= ProjectK.intYouNeed  ;i++ ) {
                                Mycart.add(item);
                            }
                            ProjectK.home();
                        }else{
                            System.out.println("Wrong Choice!!");
                            ProjectK.integerCheck("You have selected : " + Name + "\nPlease enter quantity or enter 999 to exit");
                        }
                    }
                }
            }else {
                System.out.println("Wrong Choice!!");
            }
        }
    }
	public static void clearCart () {

        boolean exit = false;
        String choose;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            ProjectK.yesNo("Are You sure you want to ProjectK.clear your cart? ");
            if (ProjectK.isYes) {
                if (Mycart.size() != 0 ){
                    Mycart.clear();
                }else {
                    cart();
                }
            }
            cart();

        }

    }
    public static void printAmtBox () {
        priceHolder = 0;
        boxWidth = 54;
        System.out.println("");
        for (int i = 0;i < Mycart.size() ;i++ ) {
            priceHolder += Mycart.get(i).price;
        }
        while (priceHolder > 0) {
            priceHolder = priceHolder / 10;
            boxWidth += 1;
        }
        String c1 = "\u2554";
        String c2 = "\u255A";
        String c3 = "\u255D";
        String c4 = "\u2557";
        String hLine = "\u2551";
        String line = "\u2550";
        if (boxWidth > 54) {
            boxWidth -= 1;
        }
        System.out.print("                  "+c1);
        for (int i = 0;i <= boxWidth ; i++ ) {
            System.out.print(line);
        }
        System.out.println(c4);
        System.out.println("                  "+hLine+ " " + finalPrice +" Rs. is the final amount you have to pay on delivery "+ hLine);
        System.out.print("                  "+c2);
        for (int i = 0;i <= boxWidth ; i++ ) {
            System.out.print(line);
        }
        System.out.println(c3);
        amt = priceHolder;
    }

    public static void deleteMenu () {
        ProjectK.clear();
        if (Mycart.size() == 0) {
            System.out.println("You have nothing in your cart!");
            stop(9);
            stop(9);
            stop(9);
            cart();
        }
        Scanner sc = new Scanner (System.in);
        int deleteNum = 0;
        String cartChoose = "";
        boolean exit = false;
        for (int i = 0;i <= Mycart.size()-1 ;i++ ) {
            System.out.println("Press "+i +" to delete "+Mycart.get(i).name+" from your cart");
            stop(1);
        }
        ProjectK.yesNo("Do you want to delete items form your cart");
        if (ProjectK.isYes) {
            deleteItem();
        }else{
            cart();
        }

    }

    public static void deleteItem () {
        Scanner sc = new Scanner (System.in);
        int deleteNum = 0;
        String cartChoose = "";
        boolean exit = false;
        boolean exit2 = false;
        boolean exit3 = false;
        ProjectK.integerCheck("Enter the number allocated to the phone you want to delete");
        if (ProjectK.isNumber) {
            while(!exit)
            if (ProjectK.intYouNeed >= 0 && ProjectK.intYouNeed < Mycart.size()) {
                ProjectK.yesNo("Are You sure you want to delete "+Mycart.get(ProjectK.intYouNeed).name+" from the cart");
                if (ProjectK.isYes) {
                    Mycart.remove(ProjectK.intYouNeed);
                    cart();
                }else {
                    cart();
                }
                exit = true;
            }else {
                System.out.println("Wrong Choice!!");
            }
        }
    }

    public static void checkOut () {
        Scanner sc = new Scanner(System.in);
        int numberOfItems = Mycart.size();
        int dayRandomiser = (int)(Math.random() * 10);
        ProjectK.clear();
        if (numberOfItems > 0) {
            ProjectK.clear();
            System.out.println("Your items will arrive at : "+  ProjectK.address);
            if (dayRandomiser < 3) {
                System.out.println("                        Your items will arrive in 1-3 buisness days");
            }else if (dayRandomiser > 2 && dayRandomiser < 7) {
                System.out.println("                        Your items will arrive in 3-6 duisness days");
            }else if (dayRandomiser > 6) {
                System.out.println("                        Your items will arrive in 6-10 buisness days");
            }
            System.out.println("                            ");
            System.out.print("* ");
            for (int i = 0; i < Mycart.size() ; i++ ) {
                System.out.print(Mycart.get(i).name + " * ");
                if (i % 10 == 0) {
                    System.out.println("");
                }
            }
            boxWidth +=1;
            printAmtBox();

        }else {
            System.out.println("                            You have nothing in your cart!");

        }
        ProjectK.yesNo("Please confirm the items you have added to your cart");
        if(ProjectK.isYes){
            ProjectK.exit();
        }

    }
	public static void cartSel() {

        addItemsToCart();

    }
    public static void stop(int timer) {
        int i = 0;
        while (i <= 100000000 * timer) {
            i++;
        }
    }

}