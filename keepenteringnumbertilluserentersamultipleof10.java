import java.util.*;
public class keepenteringnumbertilluserentersamultipleof10 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        do {
            System.out.println("enter your number:");
            int number =s.nextInt();
            if (number%10 == 0) {
                break;
            }
            System.out.println(number);
        } while (true);
    }
}
