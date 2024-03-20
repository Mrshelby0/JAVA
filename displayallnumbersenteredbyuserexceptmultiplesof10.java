import java.util.*;
public class displayallnumbersenteredbyuserexceptmultiplesof10 {
  public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        do {
            System.out.print("enter your number:");
            int number =s.nextInt();
            if (number%10 == 0) {
                continue;
            }
            System.out.println(number);
        } while (true);
    }
}
