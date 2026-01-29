public class percobaan {
    public static void main(String[] args) {
        int SIZE = 25; // bisa diganti sesuai kebutuhan

        // konstanta hasil generalisasi
        int CONST_EXCLAMATION = 4 * SIZE + 2;  // untuk "!"
        int MULT_SLASH = 2;                    // multiplier untuk slash
        int SHIFT_SLASH = -2;                  // shift untuk slash

        for (int line = 1; line <= SIZE; line++) {
            // jumlah backslash "\"
            int numBackslash = MULT_SLASH * line + SHIFT_SLASH;
            for (int i = 0; i < numBackslash; i++) {
                System.out.print("\\");
            }

            // jumlah tanda seru "!"
            int numExcl = -4 * line + CONST_EXCLAMATION;
            for (int i = 0; i < numExcl; i++) {
                System.out.print("!");
            }

            // jumlah slash "/"
            int numSlash = MULT_SLASH * line + SHIFT_SLASH;
            for (int i = 0; i < numSlash; i++) {
                System.out.print("/");
            }

            System.out.println();
        }
    }
}
