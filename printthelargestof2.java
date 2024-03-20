import java.util.Scanner;

public class printthelargestof2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int a = S.nextInt();
        System.out.println("Enter your second number : ");
        int b = S.nextInt();
        if (a>b) {
            System.out.println("the a is greater than b");
        }
        if (b>a) {
            System.out.println("the b is greater than a");
        }
        if (a==b) {
            System.out.println("both equal");
        }
    }
}
