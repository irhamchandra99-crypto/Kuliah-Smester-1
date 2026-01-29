import java.awt.*;

public class PraktikEx7{
    public static void main(String[] args){
        DrawingPanel canvas = new DrawingPanel(520,180);
        Graphics g = canvas.getGraphics();
        for(int j = 0; j < 5; j++){
            DrawFace(g, 10 + j * 100, 30);
        }
    }
    public static void DrawFace(Graphics g, int x, int y){ 
    g.setColor(Color.BLACK);
    g.drawOval(x,y,100,100); 
    
    g.setColor(Color.BLUE);
    g.fillOval(x+20,y+30,20,20); 
    g.fillOval(x+60,y+30,20,20); 
    
    g.setColor(Color.RED);
    g.drawLine(x+30, y+70, x+70, y+70);  

    
    }
}