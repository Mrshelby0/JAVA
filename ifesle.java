import java.util.Scanner;
public class ifesle{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int a = S.nextInt();
        if (a >= 18) {
            System.out.println("adult : drive, vote");
        }
        else{
            System.out.println("not adult");
        }

    }
}