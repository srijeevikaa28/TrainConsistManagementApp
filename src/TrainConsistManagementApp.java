import java.util.*;

class GoodsBogie {
    String type;   // Rectangular / Cylindrical
    String cargo;  // Petroleum, Coal, etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "GoodsBogie{type='" + type + "', cargo='" + cargo + "'}";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Goods bogie list
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        System.out.println("=== Goods Bogie List ===");
        bogies.forEach(System.out::println);

        // UC12: Safety validation using allMatch()
        boolean isSafeTrain = bogies.stream()
                .allMatch(b -> b.type.equals("Rectangular") ||
                        (b.type.equals("Cylindrical") && b.cargo.equals("Petroleum")));

        // Output result
        System.out.println("\n=== Safety Validation Result ===");

        if (isSafeTrain) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFETY COMPLIANT");
        }
    }
}