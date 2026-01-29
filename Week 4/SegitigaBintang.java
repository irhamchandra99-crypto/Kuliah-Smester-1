public class SegitigaBintang {
    public static void main(String[] args) {
        int shift = 8;        // jumlah bintang awal
        int multiplier = 3;  // setiap baris berkurang 1

        for (int i = 1; i <= 6; i++) {  // sebanyak 8 baris
            int jumlahBintang = shift + multiplier * i;

            for (int j = 0; j < jumlahBintang; j++) { // j untuk menghitung jumlah bintang pada suatu baris
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
