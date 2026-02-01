import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PraktikEx9 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner input = new Scanner(new File("coinFlip.txt"));
        coinFlip(input);
    }
    public static void coinFlip(Scanner c){
        int total = 0; 
        int head = 0;
        
        while(c.hasNextLine()){
            String line = c.nextLine();

        if(line.length() == 0)continue;
    

            for(int i = 0; i < line.length(); i++  ){
                char ch = line.charAt(i);
                if(ch == 'h' || ch == 'H'){
                    head++;
                    total++;
                } else if (ch == 't' || ch == 'T'){
                    total++;
                }
            }
        }
        System.out.println();
        System.out.println("total = " + total);
        double persen = 100 * ((double)head / total);

        System.out.printf("%d head (%.1f%%) %n",head, persen);
        if(persen > 50.0){
            System.out.println("Anda menang");
        } else if (persen < 50.0){
            System.out.println("Anda kalah");
        }else {
            System.out.println("Draw");
        }
    }
}