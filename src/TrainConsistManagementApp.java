import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedHashSet
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // 🔹 Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 🔹 Add duplicate bogie
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // 🔹 Display final formation
        System.out.println("Train Formation: " + trainFormation);
    }
}
