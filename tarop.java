// import java.util.*;

// public class tarop {
//     public static void main(String[] args) {
//         int  number =4;
//         String type = ((number%2)==0)?  "even" : "odd";
//         System.out.println(type);
//     }
// }

import java.util.*;

public class tarop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number :");
        int number = s.nextInt();
        String type = ((number%2)==0)?  "even" : "odd";
        System.out.println(type);
    }
}
