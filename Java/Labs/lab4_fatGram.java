import java.util.Scanner;

public class lab4_fatGram{
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        double calories, fatGrams, percentage, caloriesFromFat;

        System.out.print("Please enter the number of calories.\n>>");
        calories = keyboard.nextDouble();

        System.out.print("Please enter the number of fat grams.\n>>");
        fatGrams = keyboard.nextDouble();

        caloriesFromFat = fatGrams * 9.0;
        percentage = caloriesFromFat / calories;

        if (percentage <= .3){
            System.out.print("Your food item is low in fat!\n");
        }
        

    }
}