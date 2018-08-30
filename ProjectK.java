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
        BufferedReader sc2;
        sc2 = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner (System.in);
        boolean exit = false;
        boolean exit2 = false;
        while (!exit2) {
            Logo.clear();
            Logo.vAlign();
            printCentered("Weclome Guest User");
            printCentered2("Enter your first name : ");
            try{
                name = sc2.readLine();
            }
            catch(IOException e ){}

            Logo.clear();
            Logo.vAlign();
            printCentered("Weclome " + name);
            printCentered2("Enter your surname : ");
            try{
                surname = sc2.readLine();
            }
            catch(IOException e ){}
            char a;
            sc.useDelimiter("\n");
            Logo.clear();
            Logo.vAlign();
            printCentered("Weclome " + name + " " + surname);
            printCentered2("Enter the address of delivery : ");
            try{
                address = sc2.readLine();
            }
            catch(IOException e ){}
            while(!exit){
                Logo.clear();
                Logo.vAlign();
                printCentered("Last step of Registration");
                printCentered2("Enter only the phone number : ");
                try{
                phoneNumber = sc2.readLine();
                }
                catch(IOException e2){}
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
            }else {
                exit = false;
            }
        }
        start();
    }
    private static void discription () {
        clear();
        printCentered("Welcome " + name+" to the K. Store");
        stop(1);
        printCentered("");
        printCentered("Instructions");
        stop(1);
        printCentered("");
        printCentered("Press 1 to check Samsung phones");
        stop(1);
        printCentered("Press 2 to check Apple phones");
        stop(1);
        printCentered("Press 3 to check Nokia phones");
        stop(1);
        printCentered("Press 4 to check Huawei phones");
        stop(1);
        printCentered("Press 5 to check Phone Accessoires");
        stop(1);
        printCentered("Press 5 to check your shoping cart *"+Mycart.size()+" item(s)*");
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
        String choose = "";
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        while (!exit) {
            System.out.print(text + " (Y/n): ");
            try{
                choose = sc.readLine();
            }
            catch(IOException e) {}
            if (choose.equalsIgnoreCase("") || choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n")) {
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
        BufferedReader sc =new BufferedReader (new InputStreamReader(System.in));
        String numS = "";
        char c;
        boolean exit = false;
        while (!exit){
            System.out.print(text + " :");
            try{
            numS = sc.readLine();
            }
            catch (IOException e){}
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
            Cart.cartSel();
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
                        Cart.cart();
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

    public static void stop(int timer) {
        int i = 0;
        while (i <= 100000000 * timer) {
            i++;
        }
    }
       public static void addressCheck(){
        Logo.clear();
        Logo.vAlign();
        printCentered2("The order is placed by : " + name + " " + surname + "\nThe order will arrive at " + address + "\nThe Phone Number of the recipient is : " + phoneNumber + "\nAre the above given details correct ");
        yesNo("");
        if(!isYes){
            takeCredentials();
        }else{
            Cart.checkOut();
        }


    }
    public static void exitCheck () {
        yesNo("Are you sure you want to exit the store?");
        if (isYes) {
            if(Mycart.size() != 0){
                yesNo("You have items in your cart? Do You wish to buy them?");
                if (isYes) {
                    Cart.cart();
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
        Logo.exitAnim();
    }
}