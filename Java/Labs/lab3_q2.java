import java.util.Scanner;

public class lab3_q2{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        String name, city, college, profession, animal, petName;
        int age;

        System.out.print("\nPlease enter your name.\n>>");
        name = keyboard.nextLine();

        System.out.print("\nPlease enter your city.\n>>");
        city = keyboard.nextLine();

        System.out.print("\nPlease enter your college.\n>>");
        college = keyboard.nextLine();

        System.out.print("\nPlease enter your profession.\n>>");
        profession = keyboard.nextLine();

        System.out.print("\nPlease enter your animal's species.\n>>");
        animal = keyboard.nextLine();

        System.out.print("\nPlease enter your pet's name.\n>>");
        petName = keyboard.nextLine();

        System.out.print("\nPlease enter your age.\n>>");
        age = keyboard.nextInt();

        System.out.print("\nThere once was a person named " + name + " who lived in " + city + ".\n" +
                         "At the age of " + age + ", " + name + " went to college at " + college + ".\n" +
                         name + " graduated and went to work as a " + profession + ".\n" +
                         "Then, " + name + " adopted a(n) " + animal + " named " + petName + ".\n" +
                         "They both lived happily ever after!\n");
    }
}
