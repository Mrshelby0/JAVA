import java.util.Scanner;

public class areaofacircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the radius:");
        float r = s.nextInt();
        float answer = 3.14f * r * r ;
        System.out.println("the area of circle is:"+answer);

    }
}
