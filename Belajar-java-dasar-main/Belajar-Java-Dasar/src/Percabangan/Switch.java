package Percabangan;

public class Switch {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup Baik");
                break;
            case "D":
                System.out.println("Nilai anda kurang");
                break;
            default:
                System.out.println("Anda dinyatakan tidak lolos");
        }

        //Switch Lambda tanpa break
        switch (nilai){
            case "A" -> System.out.println("Anda lulus Dengan Baik");
            case "B","C" ->  System.out.println("Nilai anda Cukup Baik");
            case "D" ->  System.out.println("Nilai anda kurang");
            default -> {
                System.out.println("Anda dinyatakan tidak lolos");
            }
        }
        // Switch dengan yield
        var ucapan = "A";
        ucapan = switch (nilai){
            case "A":
                yield "Anda lulus Dengan Baik";
            case "B", "C":
                yield "Nilai anda cukup baik";
            case "D":
                yield "Nilai anda kurang ";
            default:
                yield "Anda dinyatakan tidak lolos";

        };
        System.out.println(ucapan);


    }
}
