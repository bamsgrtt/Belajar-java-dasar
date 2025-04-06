package Perulangan;

public class Continue {
    public static void main(String[] args) {
        System.out.println("------ ANGKA GANJIL ------");
        for (var counter = 1; counter <= 100; counter++){
            if (counter % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil " + counter);

        }
        System.out.println("------ ANGKA GENAP ------");
        for (var counter = 1; counter <= 100; counter++){
            if (counter % 2 == 1){
                continue;
            }
            System.out.println("Perulangan Genap " + counter);

        }
    }
}
