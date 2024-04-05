import java.util.Scanner;

public class Library_Fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days late: ");
        int daysLate = sc.nextInt();

        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.5; 
        } else if (daysLate <= 14) {
            fine = 7 * 0.5 + (daysLate - 7) * 1; 
        } else if (daysLate <= 21) {
            fine = 7 * 0.5 + 7 * 1 + (daysLate - 14) * 5; 
        } else {
            System.out.println("Your membership is canceled!");
            return;
        }

        System.out.println("Fine for returning the book late for " + daysLate + " is: Rs. " + fine);
    }
}