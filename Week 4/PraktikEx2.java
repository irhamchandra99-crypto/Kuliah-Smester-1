public class PraktikEx2 {
    public static void main(String[] args) {
        int shift = 9;
        int multiplier = -2;
        for (int line = 1; line <= 4 ; line++){
            int stn = (multiplier * line) + shift;
            for (int st = 1; st <= stn; st++ ){
            System.err.print("*");
            }
            System.err.println();
        }
    }
}