public class PraktikEx3 {
    public static void main(String[] args) {
        System.out.println(hasMidpoint(3, 7, 7));
    }
    public static boolean hasMidpoint (int a,int b, int c){
        if((a+b) / 2 == c || (a+c) / 2 == b || (b+c) / 2 == a){
            return true;
        } else {
            return false;
        }
    }
}
