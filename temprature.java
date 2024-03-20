// import java.util.*;
// public class temprature {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         double temp = 103.5;
//         if (temp >=100) {
//             System.out.println("you have a fever");
//         }
//         else if (temp <=100) {
//             System.out.println("you don't have a fever");
//         }
//         else{
//             System.out.println("Invelid input");
//         }
//     }
// }

//with INput
import java.util.*;
public class temprature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Temprature:");
        double temp = s.nextDouble();
        if (temp >=100) {
            System.out.println("you have a fever");
        }
        else if (temp <=100) {
            System.out.println("you don't have a fever");
        }
        else{
            System.out.println("Invelid input");
        }
    }
}
