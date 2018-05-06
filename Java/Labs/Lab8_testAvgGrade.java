import java.util.Scanner;

public class Lab8_testAvgGrade{
    public static void main(String[] args){
        double testAverage;
        char letterGrade;
        
        testAverage = calcAverage();
        letterGrade = determineGrade(testAverage);

        System.out.printf("Test Average: %.0f\n" +
                          "Letter Grade: " + letterGrade + "\n", testAverage);
    }
    public static double calcAverage(){
        double currentTestGrade, sum = 0;
        Scanner keyboard = new Scanner(System.in);

        for(int i=0; i<=4; i++){
            System.out.print("Please enter test grade " + (i+1) + "\n>>");
            currentTestGrade = keyboard.nextInt();
            sum = sum + currentTestGrade;
        }
        return sum/5;
    }
    public static char determineGrade(double testAverage){
        if(testAverage < 60){
            return 'F';
        }
        else if(testAverage < 70){
            return 'D';
        }
        else if(testAverage < 80){
            return 'C';
        }
        else if (testAverage < 90){
            return 'B';
        }
        else if(testAverage <= 100){
            return 'A';
        }
        return 0;
    }
}