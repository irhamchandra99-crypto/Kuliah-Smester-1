public class PraktikEx15 {
    public static void main (String[] args ){
        int SIZE = 7; 
        
        int Konstanta = 4 * SIZE + 2;
        int Mult_Garis = 2;
        int Shift_Garis = -2;


        for(int line = 1; line <= SIZE; line ++){
            int GarisBelakang = Mult_Garis*line+Shift_Garis;
            for(int j = 0; j < GarisBelakang; j++){
                System.out.print("\\");
            }
            int Pentung = -4 * line + Konstanta;
            for(int k = 0; k < Pentung; k++){
                System.out.print("!");
            }
            int GarisDepan = Mult_Garis*line+Shift_Garis;
            for(int l = 0; l < GarisDepan; l++ ){
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
