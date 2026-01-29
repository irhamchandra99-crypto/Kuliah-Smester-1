
import java.util.Scanner;

public class PraktikEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Low = ");
        int low = input.nextInt();
        
        System.out.print("High = ");
        int high = input.nextInt();
        
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
