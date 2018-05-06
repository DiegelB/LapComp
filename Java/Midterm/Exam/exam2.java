import java.util.Scanner;

public class exam2{
    public static void main(String[] args){
        double packageWeight, finalShipCharge;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the weight of your package.\n>>");
        packageWeight = keyboard.nextDouble();

        finalShipCharge = calcCharges(packageWeight);

        System.out.printf("Your total shipping charges is: $%.2f\n", finalShipCharge);

    }
    public static double calcCharges(double packageWeight){
        if(packageWeight <= 2){
            return packageWeight * 1.10;
        }
        else if(packageWeight <= 6){
            return packageWeight * 2.20;
        }
        else if(packageWeight <= 10){
            return packageWeight * 3.70;
        }
        else if(packageWeight > 10){
            return packageWeight * 3.80;
        }
        return 0;
    }
}