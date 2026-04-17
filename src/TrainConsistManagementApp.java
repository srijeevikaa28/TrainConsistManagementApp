import java.util.*;
import java.util.stream.Collectors;

// Bogie class reused from UC7/UC8
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

        // UC7 reused list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, "Sleeper", 72));
        bogies.add(new Bogie(2, "AC Chair", 60));
        bogies.add(new Bogie(3, "Sleeper", 80));
        bogies.add(new Bogie(4, "First Class", 90));
        bogies.add(new Bogie(5, "AC Chair", 65));
        bogies.add(new Bogie(6, "First Class", 85));

        System.out.println("=== Original Bogie List ===");
        bogies.forEach(System.out::println);

        // UC9: Grouping by bogie type (name)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\n=== Grouped Bogies by Type ===");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            entry.getValue().forEach(System.out::println);
        }

        // Verify original list unchanged
        System.out.println("\n=== Original List After Grouping (Unchanged) ===");
        bogies.forEach(System.out::println);
    }
}