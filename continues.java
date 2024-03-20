// public class continues {
//     public static void main(String[] args) {
//         for (int i = 0; i <=5 ; i++) {
//             if (i == 3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

import java.util.*;
public class continues {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = s.nextInt();
        for (int i = 0; i<=100; i++) {
            if (i == a) {
                continue;
            }
            System.out.println(i);
        }
    }
}