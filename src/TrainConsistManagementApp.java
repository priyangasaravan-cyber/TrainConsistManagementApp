import java.util.ArrayList;
import java.util.List;


public class TrainConsistManagementApp{


    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message); // [cite: 318]
        }
    }


    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Created Bogie " + type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==================================================");

        try {
            PassengerBogie validBogie = new PassengerBogie("Sleeper", 72);
            System.out.println(validBogie);

            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", 0);
            System.out.println(invalidBogie);

        } catch (InvalidCapacityException e) {

            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}