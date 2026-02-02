public class circle implements shape{
    private double radius;

    public circle (double radius){
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return "circle";
    }
}
