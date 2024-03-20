import java.util.*;
public class primeornot {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = s.nextInt();
        if (n ==2) {
            System.out.println("n is prime");
        }
        else{
        boolean isprime =true;
        for (int i =2; i <=n-1; i++) {
            if (n%1==0) {
                isprime = false;
            }
        }
        if (isprime==true) {
            System.out.println("n is prime");
        }
        else{
            System.out.println("n is not prime");
        }}
    }
}
