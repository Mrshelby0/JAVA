import java.util.*;
// Bill of Items
public class bill {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        float pencil = sc.nextFloat();
        System.out.println("enter the price of eraser:");
        float eraser = sc.nextFloat();
        System.out.println("enter the price of pen ");
        float pen = sc.nextFloat();
        float toll = pencil+pen+eraser;
        System.out.println("the total bill is: "+toll);
        float gstbill=toll*0.18f;
        System.out.println("the total bill after 18% gst :"+gstbill);
        float finallbill = toll + gstbill;
        System.out.println("the finall bill is:"+finallbill);

    }
}