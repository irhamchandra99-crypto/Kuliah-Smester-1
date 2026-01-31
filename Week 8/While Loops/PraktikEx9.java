public class PraktikEx9 {
    public static void main(String[] args) {
        printFactors(24);
    }
    public static void printFactors(int s) {
        int j = s;

        for(int i = 1; i < j; i++){
            if (s % i == 0){
                System.out.print(i+ " and " );
            }
        }
        System.out.print(j);
    }
}

