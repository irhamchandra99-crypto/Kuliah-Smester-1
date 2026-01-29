public class PraktikEx3 {
    public static void main(String[] args){
        System.out.println(repl("hello", 3));

    }
    public static String  repl(String a, int b){
        String result = "";    
 
        for(int i = 0; i < b; i++){
            result += a;
      }

      return result;
    }
}
