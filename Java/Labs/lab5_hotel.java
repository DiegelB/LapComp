import java.util.Scanner;

public class lab5_hotel{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int numOfFloors;
        double numOfRooms, numOfOccupied, finalRooms = 0, finalOccupied = 0;
        double occupiedRate;

        System.out.print("Please enter the number of floors in this hotel.\n>>");
        numOfFloors = keyboard.nextInt();

        while (numOfFloors < 1){
            System.out.print("Please enter a number that is not less than 1.\n>>");
            numOfFloors = keyboard.nextInt();
        }

        for(int i=1; i <= numOfFloors; i++){
            System.out.print("Please enter the number of rooms floor " + i + " has.\n>>");
            numOfRooms = keyboard.nextDouble();
            while(numOfRooms < 10){
                System.out.print("Please enter a number greater that 9.\n>>");
                numOfRooms = keyboard.nextDouble();
            }

            finalRooms += numOfRooms;

            System.out.print("Please enter the number of occupied rooms floor " + i + " has.\n>>");
            numOfOccupied = keyboard.nextDouble();
            finalOccupied += numOfOccupied;
            System.out.println();
        }

        occupiedRate = finalOccupied / finalRooms;

        System.out.printf("There are %.0f rooms, %.0f are occupied. So %.2f is the rate of occupancy.\n"
        ,finalRooms, finalOccupied, occupiedRate);
    }
}