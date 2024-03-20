import java.util.*;
public class positiveornegitivenumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = s.nextInt();
        if (number<=0) {
            System.out.println("negitive");
        }
        else if (number >=0) {
            System.out.println("positive");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
