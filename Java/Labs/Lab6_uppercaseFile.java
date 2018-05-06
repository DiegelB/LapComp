import java.util.Scanner;
import java.io.*;

public class Lab6_uppercaseFile{
    public static void main(String[] args) throws IOException{
        String currentLine;

        File file = new File("inputText.txt");
        Scanner inputFile = new Scanner(file);

        PrintWriter outputFile = new PrintWriter("outputText.txt");

        while(inputFile.hasNext()){
            currentLine = inputFile.nextLine();
            currentLine = currentLine.toUpperCase();
            outputFile.println(currentLine);
        }
        inputFile.close();
        outputFile.close();
    }
}