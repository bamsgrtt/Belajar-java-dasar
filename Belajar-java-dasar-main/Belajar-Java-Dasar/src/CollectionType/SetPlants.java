package CollectionType;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlants {
    public static void main(String[] args) {
        // Menggunakan Hashset
        Set<String> planets = new HashSet<>();
        planets.add("Origin Stream");
        planets.add("High Stream");
        planets.add("Mid Strean");
        planets.add("Low Stream");

        System.out.println("Set planets awal : (Size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("Low Stream");

        System.out.println("Set planet terakhir");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ){
            // Looping Menggunkan Iterator
            System.out.println("\t" + iterator.next());
        }
    }
}
