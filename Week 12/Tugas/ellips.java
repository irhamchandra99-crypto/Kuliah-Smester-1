public class ellips implements shape{
    private double x;
    private double y;

    public ellips (double x, double y){
        this.x = x;
        this.y = y;
    }
    public double area(){
        return Math.PI * x * y;
    }
    public double perimeter(){
        return Math.PI * 2 * Math.sqrt ((x*x+y*y)/2);
    }
    @Override
    public String toString(){
        return "ellips"; 
    }
}
