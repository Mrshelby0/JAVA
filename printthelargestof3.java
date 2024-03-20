import java.util.Scanner;

public class printthelargestof3 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = Sc.nextInt();
        
        System.out.println("Enter the Second Number:");
        int b = Sc.nextInt();
        
        System.out.println("Enter the Third Number");
        int c = Sc.nextInt();
        if ((a>b)&&(a>c)) {
            System.out.println(a+"IS THE GREATER THAN REST OF NUMBER");
        }
        else if ((b>c)&&(b>a)) {
            System.out.println(b+"IS THE GREATER THAN REST OF NUMBER");
        }
        else if ((c>b)&&(c>a)) {
            System.out.println(c+"IS THE GREATER THAN REST OF NUMBER");
        }
        else if ((a==b)&&(a>c)) {
            System.out.println("the value of A and B is same and A is greater than C");
        }
        else if ((a>b)&&(a==c)) {
            System.out.println("The value of A and C is Same and A is Greater than B");            
        }
        else if ((b==c)&&(b>a)) {
            System.out.println("The value of B and C is same and B is greater than A");            
        }
        else if ((b==a)&&(b>c)) {
            System.out.println("The value of B and A is same and B is greater than C");
        }
        else if ((c==a)&&(c>b)) {
            System.out.println("The value of C and A is same and C is greater than B");
        }
        else if ((c==b)&&(c>a)) {
            System.out.println("The value of C and B is same and C is greater than A ");
        }
        else if ((a==b)&&(b==c)) {
            System.out.println("The Value of A B and C is same");
        }
    }
}