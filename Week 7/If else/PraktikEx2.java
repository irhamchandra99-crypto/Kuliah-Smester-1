public class PraktikEx2{
    public static int numUnique(int a, int b, int c){
        if(a == b && b == c){
            return 1;
        } else if (a == b || a == c || b == c){
            return 2;
        } else{
            return 3;
        }
    }
    
    public static void main(String[] args){
        System.out.println("Return " + numUnique(18, 3, 4)); 
        System.out.println("Return " + numUnique(6, 7, 6)); 
    }
}