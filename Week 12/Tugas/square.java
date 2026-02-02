public class square implements shape {
    private double s;

    public square(double s){
        this.s = s;
    }

    public double area() {
        return s * s;
    }

    public double perimeter() {
        return 4 * s;
    }

    @Override
    public String toString(){
        return "square";
    }

}
