import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("Nurisa.txt");
        fileWriter.write("Nurisa\n");
        fileWriter.write("Malika\n");
        fileWriter.write("Asan");
        fileWriter.close();

        FileReader fileReader = new FileReader("Nurisa.txt");
        Scanner scan = new Scanner(fileReader);
        while(scan.hasNext()){
            System.out.println(scan.nextLine());;
        }
            fileReader.close();
    }
}