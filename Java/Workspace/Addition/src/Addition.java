import java.util.Scanner;


public class Addition {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("Please enter the first number to add: ");
        num1 = input.nextInt();

        System.out.print("Please enter the second number to add: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.print("The sum of " + num1 + " and " + num2 + " is " + sum + "\n");
    }
}
