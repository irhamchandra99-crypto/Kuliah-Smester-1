public class PraktikEx5 {
    public static void main(String[] args) {
        System.out.println(sameDashes("hi--there-you.", "12--(134)-7539"));
        System.out.println(sameDashes("-15-389", "-xy-zzy"));
        System.out.println(sameDashes("criminal-plan", "(206)555-1384"));
        System.out.println(sameDashes("abc-4", "9.8"));
    }
    public static boolean sameDashes(String a, String b){
        int panjang = Math.max(a.length(), b.length());
        for (int i = 0; i < panjang; i++) {
            boolean dash1 = (i < a.length() && a.charAt(i) == '-');
            boolean dash2 = (i < b.length() && b.charAt(i) == '-');

            if (dash1 != dash2) { // kalau salah satu punya dash tapi yang lain tidak
            return false;

            }
        }   
    return true; 
    }
}

