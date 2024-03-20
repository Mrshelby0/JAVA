import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the entered year is a leap year
        boolean isLeapYear = false;
        
        // Leap year logic:
        // If the year is evenly divisible by 4,
        // it is a leap year, unless it is divisible by 100,
        // but if it is also divisible by 400, then it is still a leap year.
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        
        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

