import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PraktikEx11{
    public static void main(String[] args)throws FileNotFoundException {
        Scanner input = new Scanner(new File("nama.txt"));
        mostCommonNames(input);
    
    
    }
    public static void mostCommonNames(Scanner a){
        while(a.hasNextLine()){
            String line = a.nextLine();
            Scanner lineScan = new Scanner(line);

            String mostCommon = "";
            int mostCount = 0;

            while(lineScan.hasNext()){
                String namasekarang = lineScan.next();

                Scanner linescan2 = new Scanner(line);
                int count = 0;
                while(linescan2.hasNext()){
                    String checkname = linescan2.next();
                    if(checkname.equals(namasekarang)){
                        count++;
                    }
                }
                linescan2.close();

                if(count > mostCount){
                    mostCount = count;
                    mostCommon = namasekarang;
                }
            }
        lineScan.close();

        if(!mostCommon.equals("")){
            System.out.println("Most Common = "+ mostCommon);
        }

        }
    }
}