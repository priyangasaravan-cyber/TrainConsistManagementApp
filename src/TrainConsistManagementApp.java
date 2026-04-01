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
        System.out.println(" UC9 Calculate Total Capacity (Streams) ");
        System.out.println("==============================================");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        int totalCapacity = bogies.stream()
                .mapToInt(b -> b.capacity)
                .sum();

        System.out.println("\nTotal Passenger Capacity: " + totalCapacity);

        System.out.println("\nUC9 calculation completed...");
    }
}