import java.io.*;
import java.util.*;

public class tugas {
   public static void main (String[] args) throws FileNotFoundException{
      Scanner input = new Scanner(new File("data.txt"));
      while (input.hasNextLine()) {
         String line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         int id = lineScan.nextInt();
         String name = lineScan.next();
         int sum = 0;
         int count = 0;
         while (lineScan.hasNextInt()) {
            sum += lineScan.nextInt();
            count++;
         }
         double rata = sum / count;
         System.out.println(name + " (NIM#" + id + ") Total nilai " + sum + " Total Rata-rata " + rata);
      }
   } 
}