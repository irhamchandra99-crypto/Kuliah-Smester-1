public class PraktikEx6 {
    public static void printGrid (int row, int columns){
        for(int r = 1; r <= row; r++){
            for(int c = 0; c < columns; c++){
                int nilai = r + c * row;
                System.out.print(nilai + " "); 
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        printGrid(4, 6);{
        }

    }
}