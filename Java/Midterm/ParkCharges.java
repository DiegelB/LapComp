import java.util.Scanner;

public class ParkCharges{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int hoursParked, amtOfCusts;
        double currentCustTotal, runningCustTotal = 0, userTotal;

            System.out.println();
            System.out.print("Please enter the number of people who parked yesterday.\n>>");
            amtOfCusts = keyboard.nextInt();
            System.out.println();

            System.out.print("Please enter the amount of hours that YOU have parked.\n>>");
            hoursParked = keyboard.nextInt();
            userTotal = calculateCharges(hoursParked);
            System.out.println();

            for(int i = 1; i <= amtOfCusts; i++){
                System.out.print("Please enter the amount of hours customer #" + i + " has parked.\n>>");
                hoursParked = keyboard.nextInt();
                currentCustTotal = calculateCharges(hoursParked);
                runningCustTotal = runningCustTotal + currentCustTotal;
                System.out.println();
            }
            System.out.print("You pay $"+ userTotal + ". Total amount paid yesterday is %" + runningCustTotal + "\n");
            
    }

    public static double calculateCharges(int hoursParked){
        if (hoursParked == 24){
            return 10;
        }
        else if (hoursParked > 0 && hoursParked <= 3){
            return 3;
        }
        else{
            return (hoursParked * .50) + 3;
        }
    }
}