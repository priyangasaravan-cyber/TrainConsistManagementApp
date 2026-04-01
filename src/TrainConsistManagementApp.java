import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC11 Validate Train ID & Cargo Codes (Regex) ");
        System.out.println("==============================================");

        String trainID = "TRN-1234";
        String cargoCode = "PET-AB";

        String trainIDRegex = "^TRN-\\d{4}$";

        String cargoCodeRegex = "^[A-Z]{3}-[A-Z]{2}$";

        boolean isTrainIDValid = Pattern.matches(trainIDRegex, trainID);
        System.out.println("Train ID: " + trainID);
        System.out.println("Is Valid Train ID: " + isTrainIDValid);

        boolean isCargoCodeValid = Pattern.matches(cargoCodeRegex, cargoCode);
        System.out.println("\nCargo Code: " + cargoCode);
        System.out.println("Is Valid Cargo Code: " + isCargoCodeValid);

        String invalidID = "TRAIN12";
        System.out.println("\nTesting Invalid ID: " + invalidID);
        System.out.println("Is Valid: " + Pattern.matches(trainIDRegex, invalidID));

        System.out.println("\nUC11 validation completed...");
    }
}