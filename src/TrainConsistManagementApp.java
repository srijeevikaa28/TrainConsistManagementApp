import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    int id;
    String name;
    int capacity;

    public Bogie(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{id=" + id + ", name='" + name + "', capacity=" + capacity + "}";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Large dataset for performance comparison
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie(i, (i % 2 == 0) ? "Sleeper" : "AC Chair", i % 100));
        }

        // =========================
        // LOOP BASED APPROACH
        // =========================
        long startLoop = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // =========================
        // STREAM BASED APPROACH
        // =========================
        long startStream = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // =========================
        // RESULTS
        // =========================
        System.out.println("=== Performance Comparison ===");

        System.out.println("\nLoop Execution Time   : " + loopTime + " ns");
        System.out.println("Stream Execution Time : " + streamTime + " ns");

        if (loopTime < streamTime) {
            System.out.println("\nLoop is faster");
        } else {
            System.out.println("\nStream is faster or comparable");
        }
    }
}