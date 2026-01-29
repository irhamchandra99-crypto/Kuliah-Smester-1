import java.util.Scanner;

public class PraktikEx1 {
    public static void main (String[] args){
        Scanner hasil = new Scanner(System.in);

        System.out.print("GPA : ");
            double GPA = hasil.nextDouble();
        
        System.out.print("Score : ");
            double Score = hasil.nextDouble();

        if(GPA > 1.8 && Score > 900){
            System.out.println("You were accepted!");
        }
        else{
            System.out.println("You were rejected!");
        }
        hasil.close();
    }
}

