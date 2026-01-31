import java.util.Scanner;

public class PraktikEx7 {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner(System.in);
        String nama = ""; 
        
        while(true){
            System.out.print("Type your name :");
            nama = inputuser.nextLine();

            if(nama.length() >= 5 && nama.contains(" ")){
                break;
            } else {
                System.out.println("Error, must be at least 5 chars with a space.");
            }
        }
 
        int spasi = nama.indexOf(" ");
        String namadepan = nama.substring(0, spasi);
        String namabelakang = nama.substring(spasi +1);
        char inisial = namadepan.charAt(0);


        System.out.println("My name is " + namabelakang + ", " + inisial + ".");
        
        
    }
}
