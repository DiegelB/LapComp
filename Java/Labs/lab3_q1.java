// Ben Diegel, JAVA I, Lab 3 Question 1
import java.util.Scanner;

public class lab3_q1{
    public static void main(String[] args){
        
        final double TAX = .0675, // CONSTANTS for tax and tip percentages (decimal form)
                     TIP = .2;
        
        double mealCharge, // charge for only the meal
               taxAmount, // amount of tax on the meal
               tipAmount, // amount of tip for meal
               totalBill; // total amount of everything

        Scanner keyboard = new Scanner(System.in); // new keyboard scanner

        System.out.print("\nPlease enter the price of your meal. \n>>"); // gets the meal charge with nice formating
        mealCharge = keyboard.nextDouble();

        taxAmount = mealCharge * TAX; // calcs the tax amount for the meal
        tipAmount = mealCharge * TIP; // calcs the tip amount
        totalBill = mealCharge + taxAmount + tipAmount; // adds everything together 

        System.out.println("\nMeal Charge:\t$" + mealCharge + // formats the end result like a recipt. 
                           "\nTax:\t\t$" + taxAmount +        // (how do you set percision??)
                           "\nTip:\t\t$" + tipAmount +
                           "\n\nTotal:\t\t$" + totalBill);
        
    }
}