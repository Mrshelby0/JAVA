// import java.util.*;
// public class passorfail {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter your Number : ");
//         int number = s.nextInt();
//         if (number >=33) {
//             System.out.println("PASS");
//         }
//         else{
//             System.out.println("FAIL");
//         }
//     }
// }

//SECOND METHOD 
import java.util.*;

public class passorfail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int number = s.nextInt();
        
        if (number <= 40) {
            System.out.println("You got a F");
        } else if (number <= 50) {
            System.out.println("You got D");
        } else if (number <= 60) {
            System.out.println("You got a C");
        } else if (number <= 70) {
            System.out.println("You got a B");
        } else if (number <= 80) {
            System.out.println("You got a B+");
        } else if (number <= 90) {
            System.out.println("You got a A");
        } else if (number <= 100) {
            System.out.println("You got a A+");
        } else {
            System.out.println("Invalid input"); // Handle inputs outside the range
        }
    }
}
