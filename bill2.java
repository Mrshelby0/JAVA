import java.util.*;
public class bill2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = 5;
        float pen = 10;
        float eraser = 5;
        System.out.println("how many pencil you take:");
        float d = sc.nextFloat();
        float dd = d*pencil;
        System.out.println("How many eraser you take");
        float e = sc.nextFloat();
        float ee= e*eraser;
        System.out.println("how  many pen you take: ");
        float p = sc.nextFloat();
        float pp = p*pen;
        System.out.println("the total item you take is :");        
        System.out.println("pencil = "+ d  +'*'+ pencil+'=' + dd);
        System.out.println("pen = "+ p + '*'+ pen+'='+ pp );
        System.out.println("eraser = "+ e + '*'+ eraser+'='+ ee );
        float item = dd+pp+ee;
        float gste=item*0.18f;
        System.out.println("18% gst = "+gste);
        float billll=gste+item;
        System.out.println("the total bill is :"+billll);
    }
}
