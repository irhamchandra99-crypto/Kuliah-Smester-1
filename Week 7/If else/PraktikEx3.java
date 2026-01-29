public class PraktikEx3 {
    public static double quadrant(double a, double b){
        if(a < 0 && b > 0){
            return 2;
        } else {
            return 0;
        }

    }
    
    public static void main(String[] args) {
        double hasil = quadrant(2.3, 14.2);

        System.out.println("Return adalah : " + hasil);
    }
}
