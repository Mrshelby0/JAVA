import java.util.*;
public class averageof3number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Number 1 : ");
        int a = s.nextInt();
        System.out.println("Number 2 : ");
        int b = s.nextInt();
        System.out.println("Number 3 : ");
        int c = s.nextInt();
        int avg = (a+b+c) / 3; 
        System.out.println("The average of 3 number is :"+avg);
    }
}
