import java.util.Scanner;

public class testAverage1{
    public static void main(String[] args){
        int score1, score2, score3;
        double average;
        char repeat;
        String input;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program calculates the average of three test scores.");

        do{
            System.out.print("Enter score #1: ");
            score1 = keyboard.nextInt();

            System.out.print("Enter score #2: ");
            score2 = keyboard.nextInt();

            System.out.print("Enter score #3: ");
            score3 = keyboard.nextInt();
            keyboard.nextLine();

            average = (score1 + score2 + score3) / 3.0;

            System.out.println("Your average is " + average + ".");
            System.out.println();

            System.out.println("Would you like to try again?");
            System.out.print("Y = yes || N = no\n>>");
            
            input = keyboard.nextLine();
            repeat = input.charAt(0);

        }while (repeat == 'Y' || repeat == 'y');
    }
}