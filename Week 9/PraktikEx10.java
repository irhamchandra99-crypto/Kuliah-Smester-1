import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PraktikEx10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("ulang.txt"));
        printDuplicates(input);
        input.close();
    }

    public static void printDuplicates(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner s = new Scanner(line);
            if (!s.hasNext()) {
                System.out.println();
                s.close();
                continue;
            }
            String prev = s.next();
            int count = 1;
            boolean firstOutput = true;
            while (s.hasNext()) {
                String tok = s.next();
                if (tok.equals(prev)) {
                    count++;
                } else {
                    if (count > 1) {
                        if (!firstOutput) System.out.print(" ");
                        System.out.print(prev + "*" + count);
                        firstOutput = false;
                    }
                    prev = tok;
                    count = 1;
                }
            }
            if (count > 1) {
                if (!firstOutput) System.out.print(" ");
                System.out.print(prev + "*" + count);
            }
            System.out.println();
            s.close();
        }
    }
}
