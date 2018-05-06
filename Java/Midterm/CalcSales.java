import java.util.Scanner;

public class CalcSales{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int productNumber, amtSold, amtTotal = 0;
        double finalPrice = 0, saleTotal = 0;
        boolean flag = true;
        
        while(flag){
            System.out.println();
            System.out.print("Please enter the product number (1-5) or a negative to exit.\n>>");
            productNumber = keyboard.nextInt();

            if (productNumber < 0){
                flag = false;
                break;
            }

            switch (productNumber){
                case 1:
                    System.out.print("Please enter the amount sold for product " + productNumber + ".\n>>");
                    amtSold = keyboard.nextInt();
                    amtTotal += amtTotal + amtSold;

                    saleTotal = amtSold * 2.98;
                    break;
                case 2:
                    System.out.print("Please enter the amount sold for product " + productNumber + ".\n>>");
                    amtSold = keyboard.nextInt();
                    amtTotal += amtTotal + amtSold;

                    saleTotal = amtSold * 4.50;
                    break;
                case 3:
                    System.out.print("Please enter the amount sold for product " + productNumber + ".\n>>");
                    amtSold = keyboard.nextInt();
                    amtTotal += amtTotal + amtSold;

                    saleTotal = amtSold * 9.98;
                    break;
                case 4:
                    System.out.print("Please enter the amount sold for product " + productNumber + ".\n>>");
                    amtSold = keyboard.nextInt();
                    amtTotal += amtTotal + amtSold;

                    saleTotal = amtSold * 4.49;
                    break;
                case 5:
                    System.out.print("Please enter the amount sold for product " + productNumber + ".\n>>");
                    amtSold = keyboard.nextInt();
                    amtTotal += amtTotal + amtSold;

                    saleTotal = amtSold * 6.87;
                    break;
                default:
                    break;
            }
            finalPrice += finalPrice + saleTotal;
            
        }
        System.out.printf("You've sold %d products and its costed $%.2f.\n", amtTotal, finalPrice); 
    }
}