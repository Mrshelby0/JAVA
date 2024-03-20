import java.util.Scanner;
public class oddoreven {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your number :");
        int a = S.nextInt();
        if (a%2 ==0) {
            System.out.println("A is a even number");

        }
        else{
            System.out.println("A is a odd number");
        }
    }
}
