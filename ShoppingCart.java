import java.util.*;
public class ShoppingCart {
    public static void main(String args[]) {
        // Shopping Cart Program
        Scanner sc = new Scanner(System.in);

        String item1;
        double price;
        int quantity;
        char currency = '$';
        double totalPrice;


        System.out.println("Enter which item you want to buy:");
        item1 = sc.nextLine();

        System.out.println("Enter the price of the item:");
        price = sc.nextDouble();

        System.out.println("How many would you like to buy?");
        quantity = sc.nextInt();

       totalPrice = price * quantity;
       System.out.println("The total price for " + quantity + " " + item1 + "(s) is: " + currency + totalPrice);
    
        sc.close();
    }
}
