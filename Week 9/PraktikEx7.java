
import java.io.*;
import java.util.*;



public class PraktikEx7 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner input = new Scanner(new File("example.txt"));
        
        flipLines(input);
        
    }
    public static void flipLines(Scanner a){
        while(a.hasNextLine()){
            String line1 = a.nextLine();

            if(a.hasNextLine()){
                String line2 = a.nextLine();
                System.out.println(line2);
                System.out.println(line1);
            } else {
                System.out.println(line1);
            }
        }
    }
}
