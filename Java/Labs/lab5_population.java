import java.util.Scanner;

public class lab5_population{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double populationIncrease, dailyPop, percentOfIncrease;
        int startingOrgNumber = 0, numberOfDays = 0;

        System.out.print("Please enter the starting number of organisms.\n>>");
        startingOrgNumber = keyboard.nextInt();
        while (startingOrgNumber < 2){
            System.out.print("Please enter a number bigger than 1.\n>>");
            startingOrgNumber = keyboard.nextInt();
        }

        System.out.print("Please enter the daily population increase.\n%");
        populationIncrease = keyboard.nextDouble();
        while(populationIncrease < 0){
            System.out.print("Please enter only positive percentages.\n%");
            populationIncrease = keyboard.nextDouble();
        }

        System.out.print("Please enter the number of days that the population will increase.\n>>");
        numberOfDays = keyboard.nextInt();
        while (numberOfDays < 1){
            System.out.print("Please enter a number bigger than 0.\n>>");
            numberOfDays = keyboard.nextInt();
        }   
        dailyPop = startingOrgNumber;
        percentOfIncrease = populationIncrease/100;

        int currentDay = 0;
        for (int i=0; i<=numberOfDays;i++){
            currentDay++;
            dailyPop += (percentOfIncrease * dailyPop);
            System.out.println("Day " + currentDay + "\t\t" + dailyPop);
        }
    }
}