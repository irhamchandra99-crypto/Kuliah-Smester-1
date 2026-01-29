public class PraktikEx7 {
    public static void printSquare (int row, int columns ){
        for(int r = 0; r <= row; r++ ){
            for(int c = 1; c < columns; c++){
                int nilai = r + c * row;
                System.out.print(nilai + " ");
            }
        System.out.println();
        }
    }
    public static void main (String[] args){
       printSquare(3, 6);{

       }
    } 
}
