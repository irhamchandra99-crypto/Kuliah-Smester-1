import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(afsd);
        printDuplicates(input);
    }
    public static void printDuplicates(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner s = new Scanner(line);
        if (!s.hasNext()) {
            System.out.println(); // baris kosong -> newline
            s.close();
            continue;
        }
    //    String prev = s.next();
    //    int count = 1;
    //    boolean firstOutput = true;
    //    while (s.hasNext()) {
    //        String tok = s.next();
    //        if (tok.equals(prev)) {
    //            count++;
    //        } else {
    //            if (count > 1) {
    //                if (!firstOutput) System.out.print(" ");
    //                System.out.print(prev + "*" + count);
    //                firstOutput = false;
    //            }
    //            prev = tok;
    //            count = 1;
    //        }
    //    }
        if (count > 1) {
            if (!firstOutput) System.out.print(" ");
            System.out.print(prev + "*" + count);
        }
        System.out.println();
        s.close();
    }
}

}
