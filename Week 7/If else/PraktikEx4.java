// Building Java Programs, Chapter 4 Lab
// Improve this program by factoring redundant code from the method below.

public class PraktikEx4 {
    
        
    public static String  factoring(double gpa, double credits) {
        if (gpa == 4.0 && credits == 5) {
            return "I'm valedictorian for this class! Woo hoo!\nI made the dean's list for this class!\n ";     
        } else if (gpa >= 3.5 && credits == 5) {
            return "I made the dean's list for this class!\n ";
        } else if(gpa < 1.5 && credits == 5 || gpa <= 0.7 && credits ==0) {
            return "Uh-oh..I probably should have studied a little more.\n " ;
        } 

    return "Input tidak sesuai ";    
    }
    public static void main(String[] args) {

    
    System.out.println(factoring(4.0, 5));
    System.out.println(factoring(3.7, 5));
    System.out.println(factoring(1.0, 5));
    }
}
