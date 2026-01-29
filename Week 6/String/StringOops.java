import java.util.*;

public class StringOops {                                                        //1
    public static void main(String[] args) {                                     //2
        Scanner console = new Scanner(System.in);                                //3
        System.out.print("Type your name: ");                                    //4
        String name = console.next();                                      //5
        process(name);                                                           //6
    }                                                                            //7
                                                                                 //8
    public static void process(String name) {                                  //9
        if (name == "Whitaker") {                                                  //10
            System.out.println("You must be really awesome.");                   //11
        }                                                                        //12
        name = name.replace("a", "e");                                                       //13
        name = name.toUpperCase();                                                       //14
        name = name.substring(0, 3);                                                    //15
        System.out.println(name + " has " + name.length() + " letters");           //16
    }                                                                            //17
}                                                                                //18

