package CommonClass.generics;

import Perulangan.For;

import java.util.ArrayList;
import java.util.Collection;

public class WildcardVSGenericsMethod {
    // menggunakan wildcards
    static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }

    // menggunakan generc methods
    static <T> Collection arrayToCollection(T[] a) {
        Collection<T> c = new ArrayList();
        for (T o: a) {
            c.add(o);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] sa = { "Happy", "Coding" };
        Collection r = arrayToCollection(sa);
        print(r);
    }
}
