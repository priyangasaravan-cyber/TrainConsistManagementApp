import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC10 Count Total Seats in Train (reduce) ");
        System.out.println("==============================================");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, (a, b) -> a + b);

        System.out.println("\nTotal Seating Capacity (Calculated via reduce): " + totalSeats);

        System.out.println("\nUC10 reduction completed...");
    }
}