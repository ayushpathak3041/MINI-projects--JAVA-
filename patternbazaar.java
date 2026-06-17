import java.util.Scanner;

public class Patternbazaar {

    // =====================================
    public static void squarePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // =====================================
    public static void RightTringlePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // =====================================
    public static void PyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // =====================================
    public static void DiamondPattern(int n) {

        // Upper Half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // =====================================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;

        do {

            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║         🎨 PATTERN BAZAAR 🎨         ║");
            System.out.println("╚══════════════════════════════════════╝");

            System.out.println("┌──────────────────────────────────────┐");
            System.out.println("│ 1. ⬜ Square Pattern                 │");
            System.out.println("│ 2. 🔺 Right Triangle Pattern         │");
            System.out.println("│ 3. 🏔️ Pyramid Pattern               │");
            System.out.println("│ 4. 💎 Diamond Pattern                │");
            System.out.println("│ 5. 🚪 Exit                           │");
            System.out.println("└──────────────────────────────────────┘");

            System.out.print("👉 Enter Pattern Number: ");
            int choose = sc.nextInt();

            if (choose == 5) {
                System.out.println("\n╔══════════════════════════════════════╗");
                System.out.println("║      🙏 THANK YOU FOR VISITING       ║");
                System.out.println("║         PATTERN BAZAAR 🎨           ║");
                System.out.println("╚══════════════════════════════════════╝");
                break;
            }

            System.out.print("📏 Enter Pattern Size: ");
            int n = sc.nextInt();

            System.out.println("\n✨ YOUR PATTERN ✨");
            System.out.println("══════════════════════════════════════");

            switch (choose) {

                case 1 -> squarePattern(n);

                case 2 -> RightTringlePattern(n);

                case 3 -> PyramidPattern(n);

                case 4 -> DiamondPattern(n);

                default -> System.out.println("❌ Invalid Input! Please choose 1-5.");
            }

            System.out.println("══════════════════════════════════════");

            sc.nextLine(); // consume leftover newline

            System.out.print("\n🔄 Do you want another pattern? (khelo/no): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("khelo"));

        System.out.println("\n🌟 Program Ended Successfully 🌟");

        sc.close();
    }
}