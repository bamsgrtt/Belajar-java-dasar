package CommonClass.generics;

import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main(String[] args) {
        List lo = new ArrayList(); // List tanpa type-parameter
        lo.add("lo - String 1"); // lo menampung objek String
        lo.add(new Planet("Mercury", 0.06)); // lo menampung objek Planet

        for (Object o : lo) {
            Planet p = (Planet) o; // perlu type-casting dari object ke Planet
            p.print();
        }

        List<Planet> lp = new ArrayList(); // List dengan type-parameter Planet
        lp.add(new Planet("Mercury", 0.06)); // lp bisa menampung objek Planet
      //  lp.add("lp - String 1"); // baris ini compile-error, lp tidak di ijinkan menampung objek String
        lp.add(new Planet("Venus", 0.82));


        for (Planet p : lp) {
            p.print();
        }

    }
}
