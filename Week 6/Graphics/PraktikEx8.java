import java.awt.*;

public class PraktikEx8{
    public static void main (String[] args){
        DrawingPanel canvas = new DrawingPanel(170,170);
        Graphics g = canvas.getGraphics();
   
        for (int i=0; i < 8; i++){
            g.drawLine(0 ,10,160,10); //atas 0 10 160 10
            
            g.drawLine(160,150,160,10); //kanan 160 150 160 10
            
            g.drawLine(10,150,160,150); //bawah 10 150 160 150
            
            g.drawLine(10,150,10,20); //kiri 10 150 10 20
        }
    }
}
//belum selesai