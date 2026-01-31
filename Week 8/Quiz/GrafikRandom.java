import java.awt.*;
import java.util.*;

public class GrafikRandom {
    public static void main(String[] args) {
        


        Random rand = new Random();
      

        int[] frekuensi = new int[13];
        int roll1, roll2, sum;
        boolean stop = false;
        while (!stop){
            roll1 = rand.nextInt(6) +1;
            roll2 = rand.nextInt(6) +1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
           
            
            if(sum == 7){
                stop = true;
            }

            DrawingPanel canvas = new DrawingPanel(200, 200);
            Graphics g = canvas.getGraphics();
            
            g.drawRect(25, 30, 30, 200 - sum);
           
        }
        for(int i = 2; i <= 12; i++){
            int tinggi =  - tinggi; 
        }

        // g.drawRect();
        // g.drawRect();
        // g.drawRect();
        // g.drawRect();
    }


}