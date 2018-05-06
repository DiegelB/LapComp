import java.util.Scanner;

public class lab10_payroll{
    public static void main(String[] args){
        int[] empId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        int[] hours = new int[7];
        double[] payRate = new double[7];
        double[] wages = new double[7];

        getValues(hours, payRate, empId);
        calcWages(hours, payRate, wages);
        display(wages, empId);
        
    }

    public static void getValues(int[] hours, double[] payRate, int[] empId){
        Scanner keyboard = new Scanner(System.in);
        boolean flag = true;

        for(int i = 0; i < empId.length; i++){
            System.out.print("Please enter the hours for employee " + empId[i] + "\n>>");
            hours[i] = keyboard.nextInt();
            
            while(flag){
                System.out.print("Please enter the payrate for employee " + empId[i] + "\n>>");
                payRate[i] = keyboard.nextDouble();
                if(payRate[i] < 6){
                    System.out.println("Please enter pay greater than $6.00");
                }
                else{
                    break;
                }
            }
            
            System.out.println();
        }
    }
    public static void calcWages(int[] hours, double[] payRate, double[] wages){
        for(int i = 0; i < hours.length; i++){
            wages[i] = hours[i] * payRate[i];
        }
    }
    public static void display(double[] wages, int[] empId){
        System.out.println("Employee\tWages");
        for(int i = 0; i < wages.length; i++){
            System.out.println(empId[i] + "\t\t" + wages[i]);
        }
    }
}
