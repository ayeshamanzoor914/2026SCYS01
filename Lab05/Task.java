
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = input.nextInt();
        input.nextLine();

        String[] titles = new String[n];
        int[] shelfNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of book " + (i + 1));

            System.out.print("Enter book title: ");
            titles[i] = input.nextLine();

            System.out.print("Enter shelf number: ");
            shelfNumbers[i] = input.nextInt();
            input.nextLine();
        }

        System.out.println("\n===== Library Books =====");

        for (int i = 0; i < n; i++) {
            System.out.println("Book Title: " + titles[i]);
            System.out.println("Shelf Number: " + shelfNumbers[i]);
            System.out.println("--------------------");
        }


    }
}

