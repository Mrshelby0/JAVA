import java.util.*;
public class printnumberfrom1toN {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int counter =1;
        System.out.println("enter the number you want to print");
        int end = s.nextInt();
        while (counter <=end) {
            System.out.println(counter++);
        }
    }
}
