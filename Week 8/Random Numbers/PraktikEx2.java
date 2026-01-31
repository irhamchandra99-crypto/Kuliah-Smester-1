import java.util.*;

public class PraktikEx2{
    public static void main(String[] args) {
        makeGuesses(50);
    }
    public static void makeGuesses(int number){
        int jumlah = 0;
        
        Random nomor = new Random();
        int b = nomor.nextInt(number) + 1;
        jumlah++;
        
        while(b < 48){
            System.out.println("guess = " + b);
            b = nomor.nextInt(number) + 1;
            jumlah++;
        }
        System.out.println("guess = " + b);
        System.out.println("total guess = " + jumlah);
    }    
}