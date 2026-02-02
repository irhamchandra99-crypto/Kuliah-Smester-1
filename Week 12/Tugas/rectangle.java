public class rectangle implements shape {
    private double weight;
    private double height;

    public rectangle (double weight, double height){
        this.weight = weight;
        this.height = height;
    }
    
    public double area () {
        return weight * height;
    }

    public double perimeter (){
        return 2.0 * (weight + height);
    }

    @Override
    public String toString(){
        return "rectangle";
    }

}