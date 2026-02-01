import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PraktikEx6 {
    public static void main(String[] args)throws FileNotFoundException {

        Scanner input = new Scanner(new File("hitung.txt"));
        runSum(input);

    }
    public static void runSum(Scanner a){
        double sum = 0;
        double maxSum = Double.NEGATIVE_INFINITY;

        System.out.print("Jumlah Berjalan = ");

        while(a.hasNextDouble()){
            double angka = a.nextDouble();
            sum += angka;
            System.out.print(sum + ", ");
            if(sum > maxSum){
                maxSum = sum;
            }


        }
        System.out.println();
        System.out.println("Jumlah Maksimum = "+ maxSum);

    }
}