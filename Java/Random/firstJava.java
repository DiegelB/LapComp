import java.util.Scanner;

public class firstJava {
    public static void main(String[] args) {
        double num1, num2;
        double quot;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num1 = keyboard.nextDouble();

        System.out.print("enter a new number: ");
        num2 = keyboard.nextDouble();

        if (num2 == 0){
            System.out.print("Divide by zero error.");
            System.out.print("Please run the program again.");
        }
        else {
            quot = num1 / num2;
            System.out.print("The quotient of " + num1 + "\n");
            System.out.print("divided by " + num2 + "\n");
            System.out.print("is " + quot);
        }
    }
}