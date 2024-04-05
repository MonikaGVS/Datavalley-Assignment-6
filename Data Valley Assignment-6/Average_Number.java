import java.util.Scanner;

public class Average_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        char choice;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            sum += number;
            count++;

            if (number < smallest) {
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
