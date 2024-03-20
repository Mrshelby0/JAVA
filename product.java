import java.util.Scanner;

public class product {
    public static void main(String args[]){
        Scanner s  = new Scanner(System.in);
        System.out.println("Input your number a and b:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a*b;
        System.out.println("your answer is:"+ c);
    }
}
