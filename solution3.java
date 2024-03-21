import java.util.*;
public class solution3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("Enter any positive integer: ");
        num = s.nextInt();
        for (int i=1; i<=num;i++){
            fact *=i;
        }

        System.out.println("Factorial: "+fact);
    }
}
