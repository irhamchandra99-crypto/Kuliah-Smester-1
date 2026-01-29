public class PraktikEx5 {
    public static void main(String[] args) {
        int shift = 8;
        int multiplier = 3;

        for(int i = 0; i <= 5; i++){
            int jb = multiplier * i + shift;

            for(int k = 0; k <jb; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}