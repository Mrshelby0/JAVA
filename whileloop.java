// print hello world 100 times
// import java.util.*;
// public class whileloop {
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         int counter =0;
//         while (counter <100) {
//             System.out.println("hello world");
//             counter++;

//         }
//     }
// }

import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int counter =0;
        System.out.println("how many times do you want to print hello world:");
        int sd= s.nextInt();
        while (counter <sd) {
            System.out.println("hello world");
            counter++;
            
        }
    }
}
