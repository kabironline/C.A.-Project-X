import java.util.Scanner;
import  java.lang.*;
import java.io.*;
import java.util.*;

class ProjectK {

    public static int screenWidth = 140;
    public static int finalPrice;
    public static int amt;
    public static int boxWidth = 54;    
    public static int priceHolder = 0;
    public static int menu;
    public static int intYouNeed = 0;
    public static boolean isNumber = false;
    public static boolean choose = false;
    public static boolean isYes = false;
    public static String name;
    public static String surname = "";
    public static String address;
    public static String phoneNumber;
    public static ArrayList<Cart> Mycart = new ArrayList<Cart>();
    public static Cart cartItem = new Cart("",0,0.0);

        //The Main Function
    public static void main(String[] args) {
        Logo.drawWelcome();
        login();
    }

    public static void login (){
        takeCredentials();
         start();
    }
    public static void takeCredentials (){
        
        Scanner sc = new Scanner (System.in);
        boolean exit = false;
        boolean exit2 = false;
        while (!exit2) {
            Logo.clear();
            Logo.vAlign();
            printCentered("Weclome Guest User");
            printCentered2("Enter your first name : ");
            name = sc.next();

            Logo.clear();
            Logo.vAlign();
            printCentered("Weclome " + name);
            printCentered2("Enter your surname : ");
            surname = sc.next();
            char a;
            sc.useDelimiter("\n");
            Logo.clear();
            Logo.vAlign();
            printCentered("Weclome " + name + " " + surname);
            printCentered2("Enter the address of delivery : ");
            address = sc.next();
            while(!exit){
                Logo.clear();
                Logo.vAlign();
                System.out.println(phoneNumber);
                printCentered("Last step of Registration");
                printCentered2("Enter only the phone number : ");
                phoneNumber = sc.next();
                if (phoneNumber.length() == 10 || phoneNumber.length() == 10)  {
                    
                    for (int i = 0; i<phoneNumber.length() ;i++ ) {
                        a = phoneNumber.charAt(i);
                        if (Character.isDigit(a) == false) {
                            exit = false;
                        }else {
                            exit = true;
                        }
                    }
                }
            }
            Logo.clear();
            Logo.vAlign();
            printCentered("Name : " + name + " " + surname);
            printCentered("Address : " + address);
            printCentered("PhoneNumber : " + phoneNumber);
            yesNo("Are the above given details correct");
            if (isYes) {
                exit2 = true;
            }
        }
        
    }

    private static void discription () {
        clear();
        printCentered("Welcome " + name+" to the K. Store");
        stop(1);
        printCentered("");
        printCentered("Instructions");
        stop(1);
        printCentered("");             
        printCentered("Press 1 check Samsung phones");
        stop(1);
        printCentered("Press 2 check Apple phones");
        stop(1);
        printCentered("Press 3 check Nokia phones");
        stop(1);
        printCentered("Press 4 check Huawei phones");
        stop(1);
        printCentered("Press 5 check your shoping cart *"+Mycart.size()+" item(s)*");
        stop(1);
        printCentered("Press 6 to exit the store");
        stop(1);
    }

    public static void printCentered(String text) {
        int n = ((screenWidth - text.length()) / 2) + text.length();
        System.out.println(String.format("%1$" + n + "s", text));
    }
    public static void printCentered2(String text) {
        int n = ((screenWidth - text.length()) / 2) + text.length();
        System.out.print(String.format("%1$" + n + "s", text));
    }
    public static void home () {
        discription();
        menu();
    }

    public static boolean yesNo (String text) {
        boolean exit = false;
        Scanner sc = new Scanner (System.in);
        String choose = "";
        while (!exit) {
            System.out.print(text + " (y/n):");
            choose = sc.next();
            if (choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n")) {
                if (choose.equalsIgnoreCase("y")) {
                    isYes = true;
                }else if (choose.equalsIgnoreCase("n")){
                    isYes = false;
                }
                exit = true;
            }else{
                System.out.println("Wrong Choice!!");

            }

        }
        return isYes;
    }

    public static int integerCheck (String text) {
        Scanner sc = new Scanner (System.in);
        char c;
        boolean exit = false;
        while (!exit){
            System.out.print(text + " :");
            String numS = sc.next();
            for (int i = 0;i < numS.length() ;i++ ) {
                char x = numS.charAt(i);
                if (Character.isDigit(x) == false) {
                    System.out.println("Wrong Choice!");
                    break;    
                }else {
                    isNumber = true;
                    exit = true;
                    intYouNeed = Integer.parseInt(numS);
                }
            }
        }
        return intYouNeed;
    }

    public static void buyOrNot (){
        yesNo("Do you want to add phone to your cart from this lists ");
        if (isYes) {
            cartSel();
        }else{
            start();
        }
    } 

    public static void start (){

        home();

    }

    public static void clear(){
        //Clears Screen in java
        Logo log = new Logo();
        try {

            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {}
        log.logoDraw();

    }

    public static void menu () {

        Logo log = new Logo();
        PhoneList list = new PhoneList();
        Cart cart = new Cart("", 0,0.0);
        Scanner sc = new Scanner (System.in);
        boolean exit = false;
        while(!exit) {
            //System.out.print("Please choose an option from the list given above : ");
            integerCheck("Please choose an option from the list given above");
            menu =  intYouNeed;
            if (isNumber) {
                if (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6) {

                    exit = true;
                    if ( menu == 1) {
                        clear();
                        list.addSamToArray();
                        list.print();
                    }else if (menu == 2) {
                        clear();
                        list.addAppleToArray();
                        list.print();
                    }else if (menu == 3) {
                        clear();
                        list.addNokiaToArray();
                        list.print();
                    }else if (menu == 4) {
                        clear();
                        list.addHuaToArray();
                        list.print();
                    }else if (menu == 5) {
                        cart();
                    }else if (menu == 6) {
                        exitCheck();        
                    }

                } else {
                    System.out.println("!! Wrong choice !!");
                }

            }else {
                System.out.println("!! Wrong choice !!");
            }
        }
    }

    public static void cartSel() {

        addItemsToCart();

    }

    public static void addItemsToCart (){
        PhoneList list = new PhoneList();
        boolean exit = false;
        while(!exit){
            integerCheck("Enter the number allocated to the mobile you want to buy or enter 999 to cancel the placement of order");
            if (intYouNeed == 999) {
                home();
            }else if ((intYouNeed >= 0) && (intYouNeed < PhoneList.list.size()) ){
                String Name = list.get(intYouNeed).name;
                int Price = list.get(intYouNeed).price;
                double RAM = list.get(intYouNeed).RAM;
                Cart mycart = new Cart(Name,Price,RAM);
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
            integerCheck("You have selected : " + Name + "\nPlease enter quantity or enter 999 to exit");
            if (isNumber) {
                if (intYouNeed == 999) {
                    home();   
                }else{
                    while(!exit2) {
                        if (intYouNeed > 0 && intYouNeed <=10) {
                            for (int i = 1; i <= intYouNeed  ;i++ ) {
                                Mycart.add(item);
                            }
                            home();
                        }else{
                            System.out.println("Wrong Choice!!");
                            integerCheck("You have selected : " + Name + "\nPlease enter quantity or enter 999 to exit");
                        }
                    }
                }
            }else {
                System.out.println("Wrong Choice!!");
            }
        }
    }

    public static void stop(int timer) {
        int i = 0;
        while (i <= 100000000 * timer) {
            i++;
        }
    }

    public static void cart(){
        finalPrice = 0;
        clear();
        boolean exit = false;
        int choose = 0;
        Scanner sc = new Scanner (System.in);
        if (Mycart.size() == 0) {
            System.out.println("There is nothing in your cart!?!?");

        }else {
            System.out.println(Mycart.size() + " item(s) are in your cart.");
            System.out.println("Num.     Name of Product    RAM     price");
            Logo.drawLine();
            for (int i = 0;i <= Mycart.size()-1 ;i++ ) {
                finalPrice += Mycart.get(i).price;

                //System.out.println(Mycart.get(i).name + " The Price is: " + Mycart.get(i).price +" with total RAM of: " + Mycart.get(i).RAM+ "GB is in your cart");
                String iNum = (int)i+")";
                String PriceNum = (int)Mycart.get(i).price+"Rs.";
                String Ram = Mycart.get(i).RAM+"Gb.";
                String nameS = Mycart.get(i).name;
                String phoneLine = String.format("%-8s %-22s %-7s %s",iNum,nameS,Ram,PriceNum);
                System.out.println(phoneLine);
                stop(1);
            }
        }
        printAmtBox();
        System.out.println("");
        System.out.println("Press 1 to delete items from your cart ");
        System.out.println("Press 2 to clear your cart");
        System.out.println("Print 3 to check out your cart");
        System.out.println("Press 4 to return back to the menu");
        System.out.print("please select your choice: ");
        while (!exit){
            String chooseS = sc.next();
            char c = chooseS.charAt(0);
            boolean isNumber = Character.isDigit(c);
            choose = Character.getNumericValue(c);
            if (choose== 1 || choose == 2 || choose == 3 || choose == 4) {
                if (choose == 1) {
                    deleteMenu();
                }else if (choose == 2){
                    clearCart();
                }else if (choose == 3) {
                    checkOut();
                }else if (choose == 4) {

                    start();
                }
                exit = true;
            }else{
                System.out.println("Wrong Choice!!");
                System.out.print("Please choose an option form the list : ");
            }
        }
    }

    public static void clearCart () {

        boolean exit = false;
        String choose;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.print("Are You sure you want to clear your cart?(y/n) ");
            choose = sc.next();
            if (Mycart.size() != 0 ) {
                if (choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n")) {
                    if (choose.equalsIgnoreCase("y")) {
                        Mycart.clear();
                    }else if (choose.equalsIgnoreCase("n")){
                    }
                    exit = true;
                }else{
                    System.out.println("Wrong Choice!!");
                }    
            }else {
                System.out.println("There is nothing in your cart :|");

            }
            clear();
            System.out.println("Returning to Cart menu");
            stop(9);
            stop(9);
            clear();
            System.out.println("Returning to Cart menu.");
            stop(9);
            stop(9);
            clear();
            System.out.println("Returning to Cart menu..");
            stop(9);
            stop(9);
            clear();
            System.out.println("Returning to Cart menu...");
            stop(9);
            stop(9);
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
        clear();
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

        System.out.print("Do you want to delete items form your cart (y/n): ");
        while (!exit) {
            cartChoose = sc.next();
            if (cartChoose.equalsIgnoreCase("y") || cartChoose.equalsIgnoreCase("n")) {
                if (cartChoose.equalsIgnoreCase("y")) {
                    deleteItem();
                }else if (cartChoose.equalsIgnoreCase("n")){
                    cart();
                }
                exit = true;
            }else{
                System.out.println("Wrong Choice!!");
                System.out.print("Do you want to delete items form your cart (y/n): ");
            }

        }

    } 

    public static void deleteItem () {
        Scanner sc = new Scanner (System.in);
        int deleteNum = 0;
        String cartChoose = "";
        boolean exit = false;
        boolean exit2 = false;
        boolean exit3 = false;
        integerCheck("Enter the number allocated to the phone you want to delete");
        if (isNumber) {
            while(!exit)
            if (deleteNum >= 0 && deleteNum < Mycart.size()) {
                yesNo("Are You sure you want to delete "+Mycart.get(deleteNum).name+" from the cart");
                if (isYes) {
                    Mycart.remove(deleteNum);
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
        String name = "";
        String address = "";
        int phoneNumber = 0;
        
        clear();
        if (numberOfItems > 0) {
            addressCheck();
            clear();
            System.out.println("Your items will arrive at : "+  address);
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
                if (i % 5 == 0) {
                    System.out.println("");
                }
            }
            boxWidth +=1;
            printAmtBox();

        }else {
            System.out.println("                            You have nothing in your cart!");

        }
        yesNo("Please confirm the items you have added to your cart");
        if(isYes){

        }

    }
    public static void addressCheck(){
        Logo.clear();
        yesNo("The order is placed by : " + name + " " + surname + "\nThe order will arrive at " + address + "\nThe Phone Number of the recipient is : " + phoneNumber + "\nAre the above given details correct ");
        if(!isYes){
            takeCredentials();
        }


    }
    public static void exitCheck () {
        yesNo("Are you sure you want to exit the store?");
        if (isYes) {
            if(Mycart.size() != 0){
                yesNo("You have items in your cart? Do You wish to buy them?");
                if (isYes) {
                    cart();
                }else{
                    exit();
                }
            }else {
                exit();
            }
        }else{
            start();
        }
    }

    public static void exit (){
        Mycart.clear();
        Logo log = new Logo();
        log.exitAnim();
    }
}