import java.util.Scanner;

public class exam{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name, petName, city, college, profession, aniType;
        int age;

        System.out.print("Please enter your name.\n>>");
        name = keyboard.nextLine();
        System.out.print("Please enter a city name.\n>>");
        city = keyboard.nextLine();
        System.out.print("Please enter a college name.\n>>");
        college = keyboard.nextLine();
        System.out.print("Please enter your profession.\n>>");
        profession = keyboard.nextLine();
        System.out.print("Please enter an animal type (ie species).\n>>");
        aniType = keyboard.nextLine();
        System.out.print("Please enter an animal name.\n>>");
        petName = keyboard.nextLine();
        System.out.print("Please enter your age.\n>>");
        age = keyboard.nextInt();

        System.out.println("There once was a person named "+name+" who lived in "+city+". At the age of "+age+", "+name+
                            " went to college at "+college+". "+name+" graduated and went to work as a "+profession+". "+
                            "Then, "+name+" adopted a(n) "+aniType+" named "+petName+". They both lived happily ever" +
                            " after!");
    }
}