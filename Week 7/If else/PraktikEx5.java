public class PraktikEx5 {
    public static void main(String[] args) {
        int a = 7, b = 42;
        int smaller = minimum (a, b); // tidak mencantumkan type data dan tidak memberi variabel
        if (smaller == a) {  // tanda kurung dan tanda sama dengan  
            System.out.println("a is the smallest!");
        }
    }

    public static int minimum(int a, int b) {  // returns which int is smaller // kata void diganti dengan type data
        int smaller ; //buat variabel
        if (a < b) {
            smaller = a; // tidak perlu type data
        } else  { // tidak perlu statment 
            smaller = b;  // tidak perlu type data
        }
        return smaller; // tidak perlu type data
    }
}