import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedList
        LinkedList<String> trainConsist = new LinkedList<>();

        // 🔹 Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // 🔹 Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        // 🔹 Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 🔹 Display final train consist
        System.out.println("Final Train Consist: " + trainConsist);
    }
}