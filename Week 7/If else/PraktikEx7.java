public class PraktikEx7 {
    // Possibly prints some message(s) to the user based on the given age
    public static void main (String[] args){
        int age =  15;
        message(age);
    }
    public static void message(int age) {    
        if (age >= 21) {
            System.out.println("I can legally purchase alcohol!");
        } else if (age >= 17 && age <= 20) {
            System.out.println("I can purchase a ticket to an R-rated movie.");
        } else {
            System.out.println("I can get my driver's license!");
        }
    }
}

