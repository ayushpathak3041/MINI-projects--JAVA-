import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int computerGuess = rd.nextInt(1, 11);
        int guess = 0;
        int attempts = 0;

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      🎮 NUMBER GUESSING GAME 🎮      ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println("🤖 I have selected a number between 1 and 10.");
        System.out.println("🎯 Try to guess it!\n");

        do {

            System.out.print("👉 Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < computerGuess) {
                System.out.println("📉 Too Low! Try Again.\n");
            } else if (guess > computerGuess) {
                System.out.println("📈 Too High! Try Again.\n");
            } else {
                System.out.println("\n🎉 CONGRATULATIONS! 🎉");
                System.out.println("🏆 You guessed the correct number!");
                System.out.println("🔢 Number was: " + computerGuess);
                System.out.println("🎯 Attempts: " + attempts);
            }

        } while (guess != computerGuess);

        sc.close();
    }
}