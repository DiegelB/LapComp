import java.util.Scanner;

public class exam4{
    public static void main(String[] args){
        int big = 0, small = 0, temp, current;
        boolean flag = true;
        Scanner keyboard = new Scanner(System.in);

        while(flag){
            System.out.print("Please enter a number or a negative to exit.\n>>");
            current = keyboard.nextInt();

            if(current < 0){
                flag = false;
            }
            else{
                if(current > big){
                    big = current;
                }
                if(current < big || current <= small){
                    small = current;
                }
            }
        }

        System.out.println("The biggest number: " + big + "\nThe smallest number: " + small);

    }
}