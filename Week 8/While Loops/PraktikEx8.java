public class PraktikEx8 {
    public static void main(String[] args) {
        printLetters("Rabbit");
    }
    public static void printLetters(String s){
        String hasil = s;
        int huruf = hasil.length();
        
        for(int i = 0; i < huruf; i++){
            System.out.print(hasil.charAt(i));
            if(i < huruf-1){
                System.out.print("-");
            }
        }     
        System.out.println();
    }
}
