public class PraktikEx13 {
    public static void main(String[] args) {
        int multiplier1 = 2;
        int shift1 = -2;

        int multiplier2 =-4;
        int shift2 =26;

        int multiplier3 = 2;
        int shift3 = -2;

        for(int line = 1; line <= 6; line++){
            
                int  h1 = multiplier1 * line + shift1;
                for(int g = 0; g < h1; g++){
                System.out.print("\\");
                }
                int h2 = (multiplier2 * line) + shift2;
                for(int p = 1; p <= h2; p++){
                System.out.print("!");
                }

                int  h3 = (multiplier3 * line) + shift3;
                for(int g2 = 0; g2 < h3; g2++){
                System.out.print("/");
                }
        System.out.println();         
        }
    }
}