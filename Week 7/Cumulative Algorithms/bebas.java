public class bebas{
    public static void main(String[] args) {
        mystery2(64);
    }

    
    public static void mystery2(int x) {
    int y = 0;
    while (x % 2 == 0) {
        y++;
        x = x / 2;
    }
    System.out.println(x + " " + y);
}
}