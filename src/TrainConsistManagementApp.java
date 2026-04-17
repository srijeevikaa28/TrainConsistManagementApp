import java.util.*;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie class
class PassengerBogie {
    int id;
    String name;
    int capacity;

    // Constructor with validation
    public PassengerBogie(int id, String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid capacity: " + capacity + ". Capacity must be > 0");
        }
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "PassengerBogie{id=" + id + ", name='" + name + "', capacity=" + capacity + "}";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            bogies.add(new PassengerBogie(1, "Sleeper", 72));
            bogies.add(new PassengerBogie(2, "AC Chair", -10)); // invalid
            bogies.add(new PassengerBogie(3, "First Class", 90));

        } catch (InvalidCapacityException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\n=== Valid Bogies in Train ===");
        bogies.forEach(System.out::println);
    }
}