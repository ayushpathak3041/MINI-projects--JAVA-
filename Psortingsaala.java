import java.util.Scanner;

public class Psortingsaala {

    // ==========================================================
    // Bubble Sort
    public static void BubbleSorting(int arr[]) {

        int swapCount = 0;
        int compareCount = 0;

        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                compareCount++;

                if (arr[j] > arr[j + 1]) {

                    swapCount++;

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\n🔵 BUBBLE SORT COMPLETED");
        System.out.println("📊 Total Comparisons : " + compareCount);
        System.out.println("🔄 Total Swaps       : " + swapCount);

        System.out.println("\n📦 Sorted Array:");
        printArr(arr);
    }

    // ==========================================================
    // Print Array
    public static void printArr(int arr[]) {

        System.out.print("➡️ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // ==========================================================
    // Insertion Sort
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j;

            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }

        System.out.println("\n🟢 INSERTION SORT COMPLETED");

        System.out.println("\n📦 Sorted Array:");
        printArr(arr);
    }

    // ==========================================================
    // Selection Sort
    public static void selectionSorting(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\n🟣 SELECTION SORT COMPLETED");

        System.out.println("\n📦 Sorted Array:");
        printArr(arr);
    }

    // ==========================================================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         🎓 SORTING SHAALA 🎓         ║");
        System.out.println("║     Learn • Compare • Visualize      ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.println("\n📚 Available Sorting Techniques");
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│ 1. 🔵 Bubble Sort            │");
        System.out.println("│ 2. 🟢 Insertion Sort         │");
        System.out.println("│ 3. 🟣 Selection Sort         │");
        System.out.println("└──────────────────────────────┘");

        System.out.print("\n👉 Enter your choice (1/2/3): ");
        int choose = sc.nextInt();

        System.out.println("\n📝 ARRAY INPUT SECTION");
        System.out.print("📏 Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("\n🔢 Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element [" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n⚙️ Sorting in progress...");
        System.out.println("══════════════════════════════════════");

        switch (choose) {

            case 1 -> {

                double start = System.nanoTime();

                BubbleSorting(arr);

                double end = System.nanoTime();

                System.out.printf("\n⏱️ Time Taken : %.0f ns%n", (end - start));
            }

            case 2 -> {

                double start = System.nanoTime();

                insertionSort(arr);

                double end = System.nanoTime();

                System.out.printf("\n⏱️ Time Taken : %.0f ns%n", (end - start));
            }

            case 3 -> {

                double start = System.nanoTime();

                selectionSorting(arr);

                double end = System.nanoTime();

                System.out.printf("\n⏱️ Time Taken : %.0f ns%n", (end - start));
            }

            default -> {
                System.out.println("❌ INVALID INPUT!");
                System.out.println("👉 Please choose 1, 2 or 3.");
            }
        }

        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║   ✅ THANK YOU FOR VISITING          ║");
        System.out.println("║        🎓 SORTING SHAALA 🎓          ║");
        System.out.println("╚══════════════════════════════════════╝");

        sc.close();
    }
}