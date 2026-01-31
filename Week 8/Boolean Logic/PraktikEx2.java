public class PraktikEx2{
    public static void main(String[] args) {
        //System.out.println(allDigitsOdd(135311));
        System.out.println(allDigitsOdd(9145293));
    }
    public static boolean   allDigitsOdd (int angka){
        

        while (angka > 0){
            int digit = angka % 10;
            if(digit % 2 == 0){
                return false;
            }
            angka = angka / 10;
        }
        return true;
    }
}