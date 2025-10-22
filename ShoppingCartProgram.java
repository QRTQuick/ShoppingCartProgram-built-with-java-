// import scanner 
import java.util.Scanner;
public class ShoppingCartProgram{
    public static void main(String[] argrs){
	    // Shopping Cart Program project 2025 exersise bro code
		Scanner scanner = new Scanner(System.in);
		//what customer what to buy 
		System.out.print("what item do u wana buy : ");
		String item = scanner.nextLine();
		// price for item
		System.out.print("Whats the price on the price tag : ");
		double PriceOfItem = scanner.nextDouble();
		// no of items user wants to buy 
		System.out.print("How many are you taking : ");
		long NumberOfItem = scanner.nextLong();
		// calculation or price engine 
		double FinalCost;
		FinalCost = PriceOfItem*NumberOfItem;
		
		// engine output
        System.out.print("you have purchased "+NumberOfItem+" "+item+"/s");
        System.out.print("your total cost is N"+FinalCost);		
		
		
		scanner.close();	 
	  }
}