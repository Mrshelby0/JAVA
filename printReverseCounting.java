// public class printReverseofNumber {

//     public static void main(String[] args) {
//         for (int i = 10899; i >=1; i--) {
//             System.out.println(i);
//         }
//     }
// }

import java.util.*;
public class printReverseCounting {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter your number");
        int d= s.nextInt();
        for (int i = d; i>=1; i--) {
            System.out.print(i+" ");
        }
    }
}