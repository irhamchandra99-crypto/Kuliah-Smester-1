import java.util.*;
import java.awt.*;

public class percobaan {
    public static void main(String[] args) {
        

        Random rand = new Random();
        int tries = 0;

        int sum = 0;
        while (sum != 7){
            int roll1 = rand.nextInt(6) +1;
            int roll2 = rand.nextInt(6) +1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
            tries++;
        }
    }
    drawingPanel canvas = new drawingPanel(200, 200);
    Graphics g = canvas.getGraphics();


}