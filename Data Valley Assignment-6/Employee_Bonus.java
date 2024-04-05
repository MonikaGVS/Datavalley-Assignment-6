import java.util.Scanner;

public class Employee_Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year in which the employee joined the organization: ");
        int joinYear = scanner.nextInt();

        int yearsOfService = currentYear - joinYear;

        if (yearsOfService > 5) {
            System.out.println("Congratulations! You have been awarded a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            System.out.println("Congratulations! You have been awarded a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, no bonus is awarded for less than 3 years of service.");
        }

        scanner.close();
    }
}
