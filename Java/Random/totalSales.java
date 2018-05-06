import javax.swing.JOptionPane;

public class totalSales{
    public static void main(String[] args){

        int days;
        double sales, totalSales;
        String input;

        input = JOptionPane.showInputDialog("For how many days do you have sales figures?");
        days = Integer.parseInt(input);

        totalSales = 0.0;

        for(int i = 1; i <= days; i++){
            input = JOptionPane.showInputDialog("Enter the sales for day " + i + ": ");
            sales = Double.parseDouble(input);
            totalSales += sales;
        }

        JOptionPane.showMessageDialog(null, String.format("The total sales are $%,.2f", totalSales));
        System.exit(0);
    }
}