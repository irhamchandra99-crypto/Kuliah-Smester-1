
public class PraktikEx6 {
    public static void main(String[] args) {    
      System.out.println(digitSum(29017));
      System.out.println(digitSum(-456));

    }
    public static int digitSum(int a){
       a = Math.abs(a);
       int sum = 0;

       while(a > 0){
        int digit = a % 10;
        sum += digit;
        a = a/10;
       }
       return sum;
    }
}

