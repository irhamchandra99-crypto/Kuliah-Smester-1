import java.awt.*;

public class percobaan {
    public static void main (String[] args){
        DrawingPanel Gambar = new DrawingPanel (500, 500);
        Gambar.setBackground(Color.GRAY);
        
        Graphics g = Gambar.getGraphics();
        g.fillRect(175, 175, 100, 100);
        g.drawLine(0, 100, 50, 200);
        
    }  
}