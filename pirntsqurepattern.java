// public class pirntsqurepattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <=4; i++) {
//             System.out.println("* * * *");
//         }
//     }
// }
import java.util.*;
public class pirntsqurepattern {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("how many lines do you want to print");
        int u=s.nextInt();
        for (int i = 1; i <=u; i++) {
            System.out.println(" * * * * ");
        }

    }
}