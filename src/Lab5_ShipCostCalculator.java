import java.util.Arrays;
import java.util.Scanner;

public class Lab5_ShipCostCalculator
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in); //Importing scanner for input

        //Declaring variables

        double price = 0.00;
        double ship = .02;
        double cost = 0;
        double total = 0;
        String trash = "";

        System.out.print("Enter the price of an item: ");

        if(in.hasNextDouble()) {
            //Okay to ready as number

            price = in.nextDouble();
            in.nextLine(); // Clears the buffer

            if (price >= 100) {
                System.out.println("The total for your item is " + price);
            }
            if (price < 100) {
                cost = ship * price;
                total = cost + price;
                System.out.println("The total for your item is " + price);
                System.out.println("The shipping for your item is " + cost);
                System.out.println("The total for your order is " + total);

            }
        } else {  // Okay to read as a string

                   trash = in.nextLine();
                   System.out.println("You entered an incorrect amount please enter an amount not " + trash);
                   System.out.println("Please run the program again with the correct information.");
               }
    }
}