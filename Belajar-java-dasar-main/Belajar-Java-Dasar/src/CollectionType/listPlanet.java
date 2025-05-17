package CollectionType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class listPlanet {
    public static void main(String[] args) {
        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";

        //menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Mercury"); // method add() untuk menambahkan objek ke list
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planets awal : ");
        for (int i = 0; i < planets.size(); i++){ // Method size() untuk mendapatkan ukuran list
            // Method get() untuk melihat isi list pada index i
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari list
       
        System.out.println("List planets akhir : ");
        for (int i = 0 ; i < planets.size();i++){
            System.out.println("\t index-" + i + " = "+ planets.get(i));
        }




    }
}
