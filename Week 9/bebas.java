import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bebas {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner masuk = new Scanner(new File("lines.txt"));
        flipLine(masuk);

    }
    public static void flipLine (Scanner a){
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