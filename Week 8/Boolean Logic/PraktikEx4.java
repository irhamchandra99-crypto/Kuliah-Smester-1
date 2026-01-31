public class PraktikEx4 {
    public static void main(String[] args){
        //System.out.println(before(3, 13, 4, 15));
        System.out.println(before(5, 13, 4, 15));
    }
    public static boolean before(int m1,int d1,int m2,int d2){
        
        if(m1 < m2  ){
            return true;
        }else if (m1 == m2 && d1 < d2){
            return true;
        }else{
            return false;
        }
    }
}
