import java.util.Scanner;

public class javaPrac2{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String firstName;

        System.out.print("Please enter your first name. \n>>");
        firstName = input.next();

        System.out.print(firstName);
    }
}