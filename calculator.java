// import java.util.*;
// public class calculator {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
        // System.out.println("press 1 if you want to sum");
        // System.out.println("press 2 if you want to minus");
        // System.out.println("press 3 if you want to divied");
        // System.out.println("press 4 if you want to multipye");
        // System.out.println("enter what you want to do :");
        // int number = s.nextInt();
//         if (number == 1) {
            // System.out.println("enter your first number:");
            // int a = s.nextInt();
            // System.out.println("enter your second number:");
            // int b = s.nextInt();
            // int c = a+b ;
            // System.out.println("The sum of A+B is"+c);
//         }
//         else if (number==2) {
//             System.out.println("enter your first number:");
//             int a = s.nextInt();
//             System.out.println("enter your second number:");
//             int b = s.nextInt();
//             int c = a-b ;
//             System.out.println("The sum of A+B is"+c);
//         }
//         else if (number ==3) {
//             System.out.println("enter your dividend number:");
//             int a = s.nextInt();
//             System.out.println("enter your divisor number:");
//             int b = s.nextInt();
//             int c = a/b ;
//             System.out.println("The sum of A+B is"+c);
//         }
//         else if (number ==4) {
//             System.out.println("enter your first number:");
//             int a = s.nextInt();
//             System.out.println("enter your second number:");
//             int b = s.nextInt();
//             int c = a*b ;
//             System.out.println("The sum of A+B is"+c);
//         }
//         else{
//             System.out.println("Invalid Input");
//         }
//     }
// }


// using SWITCH
import java.util.*;
public class calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("press 1 if you want to sum");
        System.out.println("press 2 if you want to minus");
        System.out.println("press 3 if you want to divied");
        System.out.println("press 4 if you want to multipye");
        System.out.println("enter what you want to do :");
        int number = s.nextInt();
        switch (number) {
            case 1:
            System.out.println("enter your first number:");
            int a = s.nextInt();
            System.out.println("enter your second number:");
            int b = s.nextInt();
            int c = a+b ;
            System.out.println("The sum of A+B is"+c);
                break;
            case 2:
            System.out.println("enter your first number:");
            int aa = s.nextInt();
            System.out.println("enter your second number:");
            int bb = s.nextInt();
            int cc = aa-bb ;
            System.out.println("The sum of A+B is"+cc);
            break;
            case 3:
            System.out.println("enter your divident number:");
            int aaa = s.nextInt();
            System.out.println("enter your devisor number:");
            int bbb = s.nextInt();
            int ccc = aaa/bbb ;
            System.out.println("The sum of A+B is"+ccc);
            break;
            case 4:
            System.out.println("enter your first number:");
            int q = s.nextInt();
            System.out.println("enter your second number:");
            int e = s.nextInt();
            int d = q+e ;
            System.out.println("The sum of A+B is"+d);
            break;
            default:
            System.out.println("invalid input");
                break;
        }
    }
}