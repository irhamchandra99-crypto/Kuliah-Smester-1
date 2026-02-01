import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Percobaan{
    public static void main(String[] args)throws FileNotFoundException {
        Scanner file1 = new Scanner(new File("text1.txt"));

        while(file1.hasNextLine()){
            String line = file1.nextLine();
            Scanner kata = new Scanner(line);
            
            while (kata.hasNext()) { 
                
                String perkata = kata.next();
                System.out.print(perkata + "s ");
            }
            kata.close();
        }
        file1.close();
    }
}