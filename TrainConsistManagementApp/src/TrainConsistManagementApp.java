
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("=========================================");

        int[] capacities = {72, 56, 24, 70, 68};

        System.out.print("Original Capacities: ");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }
        System.out.println();

        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.print("\nSorted Capacities (Ascending): ");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}