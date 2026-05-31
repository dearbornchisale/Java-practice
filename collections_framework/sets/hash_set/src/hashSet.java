import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<String> countires = new HashSet<>();

        countires.add("Malawi");
        countires.add("Zambia");
        countires.add("Congo");
        countires.add("Gambia");
        countires.add("Zimbabwe");
        countires.add("Egypt");
        countires.add("Niger");
        countires.add("Nigeria");
        countires.add("Uganda");
        countires.add("Kenya");
        countires.add("Malawi");
        countires.add("Egypt");
        countires.add("Niger");
        countires.add("Nigeria");

        for (String country : countires) {
            System.out.println(country);
        }

        if (countires.contains("South Africa")) {
            System.out.println("SA is a country");
        } else {
            System.out.println("SA is not a country");

        }

    }
}
