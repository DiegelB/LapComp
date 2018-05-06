/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/
import java.util.Scanner;
// Insert any necessary import statements here.

public class Lab8_areaRectangle{
    public static void main(String[] args){
        double length = 0,    // The rectangle's length
               width = 0,     // The rectangle's width
               area = 0;      // The rectangle's area
        Scanner keyboard = new Scanner(System.in);

        // Get the rectangle's length from the user.
        length = getLength(length, keyboard);
   
        // Get the rectangle's width from the user.
        width = getWidth(width, keyboard);

        // Get the rectangle's area.
        area = getArea(area, length, width, keyboard);

        // Display the rectangle data.
        System.out.println();
        displayData(length, width, area);
   }
    public static double getLength(double length, Scanner keyboard){
        System.out.print("Please enter the length of the rectangle.\n>>");
        length = keyboard.nextDouble();
        return length;
   }
   public static double getWidth(double width, Scanner keyboard){
        System.out.print("Please enter the width of the rectangle.\n>>");
        width = keyboard.nextDouble();
        return width;
   }
   public static double getArea(double area, double length, double width, Scanner keyboard){
        area = width * length;
        return area;
   }
   public static void displayData(double length, double width, double area){
       System.out.printf("NAMES----+----DATA" +
                          "\nLength\t |    %.2f" +
                          "\nWidth\t |    %.2f" +
                          "\nArea\t |    %.2f\n", length, width, area);
   }
}
