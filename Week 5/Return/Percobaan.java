public class Percobaan {
    public static double pay(double TA, int JamKerja) {
        return (JamKerja <= 8) 
            ? TA * JamKerja
            : (TA * 8) + (TA * 1.5 * (JamKerja - 8));
    }

    public static void main(String[] args) {
        System.out.println(pay(5.50, 6));   // 33.0
        System.out.println(pay(4.00, 11));  // 50.0
    }
}
