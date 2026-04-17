import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class (Passenger bogies reused from UC7)
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

        // UC7 Reused Bogie List
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, "Sleeper", 72));
        bogies.add(new Bogie(2, "AC Chair", 60));
        bogies.add(new Bogie(3, "First Class", 85));
        bogies.add(new Bogie(4, "General", 50));
        bogies.add(new Bogie(5, "Premium AC", 90));

        System.out.println("=== Original Bogie List ===");
        bogies.forEach(System.out::println);

        // UC8: Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\n=== Filtered Bogies (capacity > 60) ===");
        filteredBogies.forEach(System.out::println);

        // Verify original list is unchanged
        System.out.println("\n=== Original List After Filtering (Unchanged) ===");
        bogies.forEach(System.out::println);
    }
}