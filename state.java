import java.util.*;
public class state {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter your Number:");
        int number = s.nextInt();
        switch (number) {
            case 1:
                System.out.println("you got a samosa");
                break;
            case 2:
                System.out.println("you got a burger");
                break;
            case 3:
                System.out.println("you got a mango shake");
                break;
            default:
                System.out.println("we wake up");
                break;
        }
    }
}
