public class Birthday {
    public static void main(String[] args) throws InterruptedException {

        int n = 10;

        System.out.println("🌸══════════════════════════════════════🌸");
        System.out.println("      🎀 Special Birthday Countdown 🎀");
        System.out.println("🌸══════════════════════════════════════🌸\n");

        for (int i = n; i > 0; i--) {

            System.out.print("⏳ " + i + " → ");

            if (i == n) {
                System.out.println("💣 Miss Gussa Bomb");
            } else if (i == (n - 1)) {
                System.out.println("🦎 Chhipkali Ji");
            } else if (i == (n - 2)) {
                System.out.println("👑 Nakhrewali Memsaab");
            } else if (i == (n - 3)) {
                System.out.println("😏 Kya Chirkut Se Miloge?");
            } else if (i == (n - 4)) {
                System.out.println("🐈‍⬛ Choti Billi");
            } else if (i == (n - 5)) {
                System.out.println("😴 Sleeping Beauty 2.0");
            } else if (i == (n - 6)) {
                System.out.println("💨 Hawa Hawai");
            } else if (i == (n - 7)) {
                System.out.println("🍜 Maggi Magician");
            } else if (i == (n - 8)) {
                System.out.println("🌶️ Mirchi Madam");
            } else if (i == (n - 9)) {
                System.out.println("💖 The Birthday Girl");
            }

            Thread.sleep(1000);
        }

        System.out.println("\n🎂✨══════════════════════════════════════✨🎂");
        System.out.println("          🎉 HAPPY BIRTHDAY 🎉");
        System.out.println("      🌷 Stay Happy, Keep Smiling 🌷");
        System.out.println("   💖 Wishing You Joy, Success & Fun 💖");
        System.out.println("🎂✨══════════════════════════════════════✨🎂");
    }
}