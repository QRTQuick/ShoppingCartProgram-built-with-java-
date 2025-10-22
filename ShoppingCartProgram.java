import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {
        // Shopping Cart Program - Bro Code 2025 Exercise
        Scanner scanner = new Scanner(System.in);

        // Ask what customer wants to buy
        System.out.print("What item do you want to buy: ");
        String item = scanner.nextLine();

        // Ask for price of the item
        System.out.print("What's the price on the price tag: ");
        double priceOfItem = scanner.nextDouble();

        // Ask how many they want to buy
        System.out.print("How many are you taking: ");
        long numberOfItems = scanner.nextLong();

        // Logic and output
        if (numberOfItems > 1) {
            double finalCost = priceOfItem * numberOfItems;
            System.out.println("You have purchased " + numberOfItems + " " + item + "(s).");
            System.out.println("Your total cost is ₦" + finalCost);
        } 
        else if (numberOfItems == 1) {
            System.out.println("You have purchased 1 " + item + ".");
            System.out.println("Your total cost is ₦" + priceOfItem);
        } 
        else {
            System.out.println("You have not made any purchases yet. Only product name = "+ item + " and its price = ₦" + priceOfItem);
        }

        scanner.close();
    }
}