public class PraktikEx6 {
    // Returns whether the given string represents a vowel:
// a, e, i, o, or u, case insensitively.
public static void main(String[] args) {
    System.out.println(isVowel("a"));
    System.out.println(isVowel("i"));
    System.out.println(isVowel("u"));
    System.out.println(isVowel("E"));
    System.out.println(isVowel("O"));
    System.out.println(isVowel("p"));
}

public static boolean isVowel(String s) {
    
    return 
    s.equalsIgnoreCase("a") || 
    s.equalsIgnoreCase("i") || 
    s.equalsIgnoreCase("u") || 
    s.equalsIgnoreCase("e") || 
    s.equalsIgnoreCase("o") ;
    
    }
}

