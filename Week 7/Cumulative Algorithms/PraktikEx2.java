public class PraktikEx2 {
    public static void main(String[] args){
        pow2(3.5, -4);
        
    }
    public static void pow2(double  a,double  b){
        double result = 1;

        for(int i = 0; i < b; i++){
            result = result * a;
            
        }
        System.out.print(result);
    }
}

//3.5, -4 double