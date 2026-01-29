import java.util.*;  // for Scanner

public class ProcessName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = console.nextLine();

        String[] parts = name.split(" ");
        String nama1 = parts[0];
        String nama2 = parts[parts.length - 1];
        char inisial = nama1.charAt(0);
     
        name = nama2 + ", " + inisial + "."; 

        // your code goes here
        
        System.out.println("Your name is: " + name);
    }
}