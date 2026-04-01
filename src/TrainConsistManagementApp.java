import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("==================================================");

        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 50));
            bogies.add(new Bogie("First Class", 24));
            bogies.add(new Bogie("General", 90));
        }

        long loopStart = System.nanoTime();


        List<Bogie> filteredByLoop = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                filteredByLoop.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;

        long streamStart = System.nanoTime();

        List<Bogie> filteredByStream = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;

        System.out.println("Loop Execution Time (ns): " + loopDuration);
        System.out.println("Stream Execution Time (ns): " + streamDuration);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}