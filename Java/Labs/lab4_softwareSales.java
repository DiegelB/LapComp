import java.util.Scanner;

public class lab4_softwareSales{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        final double BASE_PRICE = 99;
        double totalPrice = 0, discount = 0, packageCost = 0;

        int packagesBought;

        System.out.print("Please enter the number of pacakages bought. \n>>");
        packagesBought = keyboard.nextInt();

        if(packagesBought < 10){
            packageCost = packagesBought * BASE_PRICE;
            totalPrice = packageCost;
        }
        else if(packagesBought >= 10 && packagesBought <= 19){
            packageCost = packagesBought * BASE_PRICE;
            discount = packageCost * .2;
            totalPrice = packageCost - discount;
        }
        else if(packagesBought >= 20 && packagesBought <= 49){
            packageCost = packagesBought * BASE_PRICE;
            discount = packageCost * .3;
            totalPrice = packageCost - discount;
        }
        else if(packagesBought >= 50 && packagesBought <= 99){
            packageCost = packagesBought * BASE_PRICE;
            discount = packageCost * .4;
            totalPrice = packageCost - discount;
        }
        else if(packagesBought > 100){
            packageCost = packagesBought * BASE_PRICE;
            discount = packageCost * .5;
            totalPrice = packageCost - discount;
        }

        System.out.print("You are buying " + packagesBought + " packages.\n");
        System.out.print("You recieved a discount of $" + discount + ".\n");
        System.out.print("Your total cost is $" + totalPrice + ".\n");

    }
}

