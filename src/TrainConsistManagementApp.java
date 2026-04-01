import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList
        List<String> trainConsist = new ArrayList<>();

        // 🔹 Add bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // 🔹 Display after insertion
        System.out.println("After Adding Bogies: " + trainConsist);

        // 🔹 Remove one bogie
        trainConsist.remove("AC Chair");

        // 🔹 Check existence
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // 🔹 Final list
        System.out.println("Final Train Consist: " + trainConsist);
    }
}