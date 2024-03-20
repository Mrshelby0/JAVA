import java.util.*;
public class solution2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int number;
        int choice;
        int evensum=0;
        int oddsum=0;
        do {
            System.out.print("Enter your number");
            number =s.nextInt();
            if (number %2==0) {
                evensum+=number;
            }
            else{
                oddsum+= number;
            }
            System.out.print("Do you want to to continue? press 1 for yes or 0 for no");
            choice = s.nextInt();
        } while (choice==1);
        System.out.println("sum of even numbers : " + evensum);
        System.out.println("sumof od numbers: "+ oddsum);
    }
}
