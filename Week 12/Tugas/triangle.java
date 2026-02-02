public class triangle implements shape {
    private double a;
    private double b;
    private double c;

    public triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString(){
        return "triangle";
    }

}