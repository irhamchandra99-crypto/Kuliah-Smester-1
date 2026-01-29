public class PraktikEx12 {
    public static void main(String[] args) {
        int lines = 5;    
            for(int line = 1; line <= lines; line++){
            int garis = -1 * line + 6; 
            int angka = 2 * line - 1;

                for(int i = 0; i < garis ; i++){
                    System.out.print("-");
                }
                for(int j = 0; j < angka; j++){
                    System.out.print(angka);
                }
                for(int k = 0; k <garis ; k++){
                    System.out.print("-");
                }
                System.out.println();
            }
    }
}