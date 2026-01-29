import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        longestName(input, 4); 
    }
    public static void longestName(Scanner console, int n) {
        String longest = "";   

        for (int i = 1; i <= n; i++) {
            System.out.print("name #" + i + "? ");
            String name = console.nextLine();  

            if (name.length() > longest.length()) {
                longest = name;
            }
        }


        String formatted = longest.substring(0,1).toUpperCase() + longest.substring(1).toLowerCase();
        System.out.println(formatted + "'s name is longest");
    }

    
}
