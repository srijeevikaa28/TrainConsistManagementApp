import java.util.*;
import java.util.stream.Collectors;

// Bogie class reused from UC7–UC9
class Bogie {
    int id;
    String name;
    int capacity;

    public Bogie(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
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

        System.out.println("=== Original Bogie List ===");
        bogies.forEach(System.out::println);

        // UC10: map + reduce to calculate total seats
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\n=== Total Seating Capacity of Train ===");
        System.out.println("Total Seats = " + totalSeats);

        // Verify original list unchanged
        System.out.println("\n=== Original List After Reduce (Unchanged) ===");
        bogies.forEach(System.out::println);
    }
}