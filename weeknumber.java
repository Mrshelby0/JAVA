import java.util.*;
public class weeknumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your week");
        int week = s.nextInt();
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;        
                case 3:
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}