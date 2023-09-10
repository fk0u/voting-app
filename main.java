import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Initialize variables to keep track of the vote count
        int candidate1Votes = 0;
        int candidate2Votes = 0;

        // Get the user's name
        System.out.print("Silahkan masukkan Nama anda: ");
        String userName = input.nextLine();

        // Get the user's age
        System.out.print("Silahkan masukkan Usia anda: ");
        int userAge = input.nextInt();

        // Check if the user is eligible to vote
        if (userAge >= 18) {
            // Present the user with a list of candidates to vote for
            System.out.println("Silahkan Berikan Suara anda ke pilihan anda:");
            System.out.println("1. Bayu");
            System.out.println("2. Andi");

            // Get the user's selection
            int userSelection = input.nextInt();

            // Increment the vote count for the selected candidate
            if (userSelection == 1) {
                candidate1Votes++;
            } else if (userSelection == 2) {
                candidate2Votes++;
            }

            // Display a confirmation message to the user
            System.out.println("Terima Kasih Telah memberikan suara, " + userName + "!");
        } else {
            // Display a message to the user if they are not eligible to vote
            System.out.println("Maaf, Anda tidak berhak memilih.");
        }

        // Display the final vote count
        System.out.println("Bayu: " + candidate1Votes + " suara");
        System.out.println("Andi: " + candidate2Votes + " suara");
    }
}