import java.util.Scanner;
public class Banking {
    static Scanner sc = new Scanner(System.in);
    public static void Showbalanace(double balance) {
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║       ACCOUNT DETAILS       ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.printf("💳 Current Balance : $%,.2f%n", balance);
        System.out.println("════════════════════════════════");
    }
    public static double deposite(double balance) {
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║        DEPOSIT MONEY         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.print("💵 Enter amount to deposit: $");
        double amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("❌ Amount can't be negative!");
            return 0;
        } else {
            System.out.println("✅ Deposit Successful!");
            return amount;
        }
    }
    public static double Withdraw(double balance) {
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║       WITHDRAW MONEY         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.print("💸 Enter amount to withdraw: $");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("❌ Insufficient Balance!");
            return 0;
        } else if (amount < 0) {
            System.out.println("❌ Amount can't be negative!");
            return 0;
        } else {
            System.out.println("✅ Withdrawal Successful!");
            return amount;
        }
    }
    public static void main(String[] args) {

        boolean isRunning = true;
        double balance = 1000000.2334;

        System.out.println("\n");
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║          🏦 BANK MANAGEMENT SYSTEM         ║");
        System.out.println("║        Welcome to Secure Banking!          ║");
        System.out.println("╚════════════════════════════════════════════╝");

        while (isRunning) {

            System.out.println("\n┌──────────────────────────────────────────┐");
            System.out.println("│                 MAIN MENU                │");
            System.out.println("├──────────────────────────────────────────┤");
            System.out.println("│  1. 💰 Show Balance                      │");
            System.out.println("│  2. ➕ Deposit Money                     │");
            System.out.println("│  3. ➖ Withdraw Money                    │");
            System.out.println("│  4. 🚪 Exit                              │");
            System.out.println("└──────────────────────────────────────────┘");

            System.out.print("👉 Enter your choice (1-4): ");

            int choose = sc.nextInt();

            switch (choose) {

                case 1 -> Showbalanace(balance);

                case 2 -> balance = balance + deposite(balance);

                case 3 -> balance = balance - Withdraw(balance);

                case 4 -> {
                    isRunning = false;

                    System.out.println("\n╔════════════════════════════════════════════╗");
                    System.out.println("║     🙏 THANK YOU FOR VISITING US!         ║");
                    System.out.println("║       Have a Great Day Ahead 😊           ║");
                    System.out.println("╚════════════════════════════════════════════╝");
                }

                default -> System.out.println("❌ Invalid Choice! Please select 1-4.");
            }
        }

        sc.close();
    }
}