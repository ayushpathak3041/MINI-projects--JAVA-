import java.util.Scanner;

public class Quizgame {

    public static void main(String[] args) {

        String[] questions = {
                "What is the main function of a Router?",
                "Which part of the computer is considered the Brain?",
                "What year was Facebook launched?",
                "Who is known as the Father of Computer?",
                "What was the first programming language?"
        };

        String[][] options = {
                {"1. Storing Files", "2. Encrypting Data", "3. Directing Internet Traffic", "4. Managing Passwords"},
                {"1. CPU", "2. Hard Disk", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. COBOL", "2. C", "3. FORTRAN", "4. Assembly"}
        };

        int[] answer = {3, 1, 2, 4, 3};

        int score = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         🧠 TECH QUIZ GAME 🎮         ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.println("\n📚 Total Questions : " + questions.length);
        System.out.println("🏆 Each Correct Answer = 1 Point");
        System.out.println("🚀 Let's Begin!\n");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("══════════════════════════════════════");
            System.out.println("❓ Question " + (i + 1));
            System.out.println("══════════════════════════════════════");

            System.out.println(questions[i]);
            System.out.println();

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("\n👉 Enter Your Answer (1-4): ");
            int guess = sc.nextInt();

            if (guess == answer[i]) {
                System.out.println("✅ Correct Answer!");
                score++;
            } else {
                System.out.println("❌ Wrong Answer!");
                System.out.println("💡 Correct Option: " + answer[i]);
            }

            System.out.println();
        }

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║            🎯 RESULT 🎯             ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.println("🏆 Your Score : " + score + " / " + questions.length);

        double percentage = ((double) score / questions.length) * 100;

        System.out.printf("📊 Percentage : %.2f%%\n", percentage);

        if (percentage >= 80) {
            System.out.println("🌟 Excellent! You're a Tech Master!");
        } else if (percentage >= 60) {
            System.out.println("👏 Good Job! Keep Learning!");
        } else if (percentage >= 40) {
            System.out.println("🙂 Not Bad! Practice More!");
        } else {
            System.out.println("📚 Keep Studying and Try Again!");
        }

        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║     🙏 THANKS FOR PLAYING QUIZ!      ║");
        System.out.println("╚══════════════════════════════════════╝");

        sc.close();
    }
}