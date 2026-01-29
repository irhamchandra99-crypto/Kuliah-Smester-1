import Java.*; //awt.

public class PrettyPicture {
    public static void main(String[] args) {
        DrawingPanel panel = DrawingPanel(220, 150); //new
        setBackgroundColor(Color.YELLOW); //panel.
        
        Graphics g = panel.Graphics(); //get
        panel.setColor(new Color.BLUE); //new, g.
        g.drawRectangle(50, 25); //angle , x and y
        g.setColor("RED"); //"" , Color.
        g.fillEllipse(130, 25, 42.1, 40.5); //42.1 sama 40.5 tidak usah pake titik
    }
}