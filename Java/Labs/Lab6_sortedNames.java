import java.util.Scanner;

public class Lab6_sortedNames{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String iName1, iName2, iName3, temp;

        System.out.println();
        System.out.print("Please enter a first first-name.\n>>");
        iName1 = keyboard.nextLine();

        System.out.println();
        System.out.print("Please enter a second first-name.\n>>");
        iName2 = keyboard.nextLine();

        System.out.println();
        System.out.print("Please enter a third first-name.\n>>");
        iName3 = keyboard.nextLine();

        if(iName1.compareTo(iName2) > 0){
            temp = iName1;
            iName1 = iName2;
            iName3 = temp;
        }
        if(iName1.compareTo(iName3) > 0){
            temp = iName1;
            iName1 = iName3;
            iName3 = temp;
        }
        if(iName2.compareTo(iName3) > 0){
            temp = iName2;
            iName2 = iName3;
            iName3 = temp;
        }
        System.out.println(iName1);
        System.out.println(iName2);
        System.out.println(iName3);
    }
}