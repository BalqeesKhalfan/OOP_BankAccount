import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline left by nextDouble()
        System.out.print("Enter owner name: ");
        String ownerName = scanner.nextLine();
        // Creating a bank account object
        BankAccount account = new BankAccount(accountNumber, balance, ownerName);
        // Menu for actions
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                account.withdraw(withdrawalAmount);
            } else if (choice == 3) {
                account.displayAccountInfo();
            } else if (choice == 4) {
                System.out.println("Exiting program.");
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}