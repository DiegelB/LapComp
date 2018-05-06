import java.util.Scanner;
import javax.swing.*;

public class poliTest{
    public static void main(String[] args){
        String input;
        JFrame panrent = new JFrame();
        
        input = getInput();
        JOptionPane.showMessageDialog(panrent, input);
    }
    public static String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String input = JOptionPane.showInputDialog("Enter input");
        return input;
    }
}