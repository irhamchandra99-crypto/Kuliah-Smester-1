import java.util.Scanner;

public class PraktikEx4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        longestName(input, 4);
    }
    public static void longestName(Scanner console, int b){
        String longest = ""; 

        for(int i = 1; i <= b; i++){
            System.out.print("name #" + i + "? ");
            String name = console.nextLine(); 

            if(name.length() > longest.length()){
                longest = name;
            }
        }
        String formated = longest.substring(0,1).toUpperCase() + longest.substring(1).toLowerCase();
        System.out.println(formated + "'s name is longest");
    }
}
