import java.util.Scanner;

public class incometaxcalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        
        double taxToPay = calculateTax(income);
        System.out.println("Tax to pay: " + taxToPay);
        
        scanner.close();
    }

    public static double calculateTax(double income) {
        double taxRate;
        if (income <= 5) {
            taxRate = 0;
        } else if (income <= 10) {
            taxRate = 0.20; // 20%
        } else {
            taxRate = 0.30; // 30%
        }
        return income * taxRate;
    }
}

